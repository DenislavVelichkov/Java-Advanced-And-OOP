package JavaOOP.WorkingWithAbstractions_3.Exercise.GreedyTimes_6Martin;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class Bag {
    private long capacity;
    private long currentWeight;
    private long gold;
    private Map<String, Long> gems;
    private long totalGems;
    private Map<String, Long> cash;
    private long totalCash;
    private boolean goldAdded;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.currentWeight = 0;
        this.gold = 0;
        this.gems = new LinkedHashMap<>();
        this.totalGems = 0;
        this.cash = new LinkedHashMap<>();
        this.totalCash = 0;
        this.goldAdded = false;
    }

    public void addCash(String itemType, long quantity) {
        if (this.hasFreeCapacity(quantity)
                && this.totalGems >= this.totalCash + quantity) {
            if (!this.cash.containsKey(itemType)) {
                this.cash.put(itemType, quantity);
            } else {
                this.cash.put(itemType, this.cash.get(itemType) + quantity);
            }

            this.totalCash += quantity;
            this.currentWeight += quantity;
        }
    }

    private boolean hasFreeCapacity(long weight) {
        return this.currentWeight + weight <= this.capacity;
    }

    public void addGems(String itemType, long quantity) {
        if (this.hasFreeCapacity(quantity)
                && this.gold >= this.totalGems + quantity) {
            if (!this.gems.containsKey(itemType)) {
                this.gems.put(itemType, quantity);
            } else {
                this.gems.put(itemType, this.gems.get(itemType) + quantity);
            }

            this.totalGems += quantity;
            this.currentWeight += quantity;
        }
    }

    public void addGold(long weight) {
        if (this.hasFreeCapacity(weight)) {
            this.goldAdded = true;
            this.gold += weight;
            this.currentWeight += weight;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        if (this.goldAdded) {
            str.append("<Gold> $").append(this.gold).append(System.lineSeparator());
            str.append("##Gold - ").append(this.gold).append(System.lineSeparator());
        }
        if (this.gems.size() > 0) {
            str.append("<Gem> $").append(this.totalGems).append(System.lineSeparator());

            this.gems
                    .entrySet()
                    .stream()
                    .sorted(Comparator.comparing((Function<Map.Entry<String, Long>, String>) Map.Entry::getKey).reversed()
                            .thenComparingLong(Map.Entry::getValue))
                    .forEach(entry -> {
                        str.append("##");
                        str.append(entry.getKey());
                        str.append(" - ");
                        str.append(entry.getValue());
                        str.append(System.lineSeparator());
                    });

            str.append("<Cash> $");
            str.append(this.totalCash);
            str.append(System.lineSeparator());

            this.cash
                    .entrySet()
                    .stream()
                    .sorted(Comparator.comparing((Function<Map.Entry<String, Long>, String>) Map.Entry::getKey).reversed()
                            .thenComparingLong(Map.Entry::getValue))
                    .forEach(entry-> {
                        str.append("##");
                        str.append(entry.getKey());
                        str.append(" - ");
                        str.append(entry.getValue());
                        str.append(System.lineSeparator());
                    });

        }


        return str.toString();
    }

}
