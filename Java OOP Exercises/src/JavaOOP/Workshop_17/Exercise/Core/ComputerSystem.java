package JavaOOP.Workshop_17.Exercise.Core;

import JavaOOP.Workshop_17.Exercise.hardwareComponents.Hardware;
import JavaOOP.Workshop_17.Exercise.softwareComponents.Software;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComputerSystem {
    private Map<String, Hardware> hardwareComponents;

    public ComputerSystem() {
        this.hardwareComponents = new LinkedHashMap<>();
    }

    public void addHardware(Hardware hardware) {
        this.hardwareComponents.putIfAbsent(hardware.getName(), hardware);
    }

    public void addSoftwareComponent(String hardwareName, Software software) {
        if (this.hardwareComponents.containsKey(hardwareName)) {
            this.hardwareComponents.get(hardwareName).addSoftware(software);
        }
    }

    public void releaseSoftwareComponent(String hardwareName, String softwareName) {
        if (this.hardwareComponents.containsKey(hardwareName)) {
            this.hardwareComponents.get(hardwareName).releaseSoftware(softwareName);
        }
    }

    public String analyze() {
        String separator = java.lang.System.lineSeparator();
        StringBuilder sb = new StringBuilder();
        int softwareComponentsCount = 0;
        int memoryInUse = 0;
        int memoryTotal = 0;
        int capacityInUse = 0;
        int capacityTotal = 0;

        for (String name: this.hardwareComponents.keySet()) {
            softwareComponentsCount +=
                this.hardwareComponents.get(name)
                    .getSoftwareComponentsCount();

            memoryInUse += this.hardwareComponents.get(name).getUsedMemory();
            memoryTotal += this.hardwareComponents.get(name).getMaxMemory();
            capacityInUse += this.hardwareComponents.get(name).getUsedCapacity();
            capacityTotal += this.hardwareComponents.get(name).getMaxCapacity();
        }

        sb.append("System Analysis")
        .append(System.lineSeparator())
        .append("Hardware Components: ")
        .append(this.hardwareComponents.size())
        .append(separator)
        .append("Software Components: ")
        .append(softwareComponentsCount)
        .append(separator)
        .append("Total Operational Memory: ")
        .append(String.format("%d / %d", memoryInUse, memoryTotal))
        .append(separator)
        .append("Total Capacity Taken: ")
        .append(String.format("%d / %d", capacityInUse, capacityTotal));

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

            this.hardwareComponents
                .entrySet()
                .stream()
                .filter(hw -> hw.getValue().getType().equals("Power"))
                .forEach(hw -> {
                    sb
                        .append(hw.getValue().toString())
                        .append(System.lineSeparator());
                });


            this.hardwareComponents
                .entrySet()
                .stream()
                .filter(hw -> hw.getValue().getType().equals("Heavy"))
                .forEach(hw -> {
                    sb
                        .append(hw.getValue().toString())
                        .append(System.lineSeparator());
                });

        return sb.toString();
    }
}
