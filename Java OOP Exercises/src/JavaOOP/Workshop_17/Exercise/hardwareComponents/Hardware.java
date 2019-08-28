package JavaOOP.Workshop_17.Exercise.hardwareComponents;

import JavaOOP.Workshop_17.Exercise.softwareComponents.Software;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Hardware {
    private String name;
    private String type;
    private int maxCapacity;
    private int maxMemory;
    private Map<String, Software> softwareComponents;
    private int usedCapacity;
    private int usedMemory;

    public Hardware(String name, String type,  int maxCapacity, int maxMemory) {
        this.name = name;
        this.type = type;
        this.setMaxCapacity(maxCapacity);
        this.setMaxMemory(maxMemory);
        this.softwareComponents = new LinkedHashMap<>();
        this.usedCapacity = 0;
        this.usedMemory = 0;
    }

    protected void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
    }

    protected void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    private boolean hasFreeCapacity(int capacity) {
        return this.maxCapacity - (this.usedCapacity + capacity) >= 0;
    }

    private boolean hasFreeMemory(int memory) {
        return this.maxMemory - (this.usedMemory + memory) >= 0;
    }

    public void addSoftware(Software software) {
        if (hasFreeCapacity(software.getCapacityConsumption())
             && hasFreeMemory(software.getMemoryConsumption())) {
            this.softwareComponents.putIfAbsent(software.getName(), software);
            this.usedCapacity += software.getCapacityConsumption();
            this.usedMemory += software.getMemoryConsumption();
        }
    }

    public String getName() {
        return this.name;
    }

    public void releaseSoftware(String softwareName) {
        if (this.softwareComponents.containsKey(softwareName)) {
            Software software = this.softwareComponents.remove(softwareName);
            this.usedCapacity -= software.getCapacityConsumption();
            this.usedMemory -= software.getMemoryConsumption();
        }
    }

    public int getSoftwareComponentsCount() {
        return this.softwareComponents.size();
    }

    public int getUsedCapacity() {
        return this.usedCapacity;
    }

    public int getUsedMemory() {
        return this.usedMemory;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public int getMaxMemory() {
        return this.maxMemory;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        int expressCount = (int) this.softwareComponents
                                .values()
                                .stream()
                                .filter(software -> software.getType().equals("Express"))
                                .count();

        int lightCount = this.softwareComponents.size() - expressCount;

        sb.append("Hardware Component - ").append(this.getName())
            .append(System.lineSeparator())
            .append("Express Software Components - ").append(expressCount)
            .append(System.lineSeparator())
            .append("Light Software Components - ").append(lightCount)
            .append(System.lineSeparator())
            .append("Memory Usage: ")
            .append(String.format("%d / %d", this.getUsedMemory(), this.getMaxMemory()))
            .append(System.lineSeparator())
            .append("Capacity Usage: ")
            .append(String.format("%d / %d", this.getUsedCapacity(), this.getMaxCapacity()))
            .append(System.lineSeparator())
            .append("Type: ")
            .append(this.getType())
            .append(System.lineSeparator())
            .append("Software Components: ");

        if (this.softwareComponents.values().size() == 0) {
            sb.append("None");
        } else {
            this.softwareComponents
                .values()
                .forEach(software -> sb.append(software.getName()).append(", "));
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }
}
