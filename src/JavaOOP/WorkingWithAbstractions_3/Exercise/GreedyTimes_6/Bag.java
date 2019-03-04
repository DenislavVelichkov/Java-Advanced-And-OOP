package JavaOOP.WorkingWithAbstractions_3.Exercise.GreedyTimes_6;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Bag {
    private long capacity;
    private long goldAmount;
    private long gemAmount;
    private long cashAmount;
    private HashMap<String, HashMap<String, Long>> items;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.items = new LinkedHashMap<>();
    }

    public void addItem(String item, String itemType, long itemAmount) {
        this.items.putIfAbsent(item, new LinkedHashMap<>());
        this.items.get(item).putIfAbsent(itemType, 0L);

        this.goldAmount = this.items.get(item).get(itemType);
        this.gemAmount = this.items.get(item).values().stream().mapToLong(value -> value).sum();
        this.cashAmount = this.items.get(item).values().stream().mapToLong(value -> value).sum();


        if (isThereMoreSpace(this.items, itemAmount)) {
            if (this.goldAmount >= this.gemAmount
                    && this.gemAmount >= this.cashAmount) {
                this.capacity -= itemAmount;
                this.items
                        .get(item)
                        .put(itemType, items.get(item).get(itemType) + itemAmount);
            }
        }
    }

    private boolean isThereMoreSpace(HashMap<String, HashMap<String, Long>> items, long itemAmount) {
        long finalCapacity = itemAmount;

        for (HashMap<String, Long> value : items.values()) {
            finalCapacity += value
                    .values()
                    .stream()
                    .mapToLong(amount -> amount)
                    .sum();
        }

        return finalCapacity <= capacity;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        this.items
                .entrySet()
                .stream()
                .sorted((o1, o2) -> {
                    long sumValues1 = o1.getValue().values().stream().mapToLong(v -> v).sum();
                    long sumValues2 = o2.getValue().values().stream().mapToLong(v -> v).sum();

                    return (int) (sumValues2 - sumValues1);
                })
                .forEach(entry -> {
                    long sumValue = entry.getValue().values().stream().mapToLong(v -> v).sum();
                    str.append(String.format(
                            "<%s> $%d", entry.getKey(), sumValue));
                    str.append(System.lineSeparator());

                    entry.getValue().entrySet().stream()
                            .sorted((o1, o2) -> {
                                int result = o2.getKey().compareTo(o1.getKey());

                                return result != 0 ? result : o1.getValue().compareTo(o2.getValue());
                            })
                            .forEach(el -> {
                                if (el.getValue() != 0) {
                                    str.append(String.format("##%s - %d",
                                            el.getKey(), el.getValue()));
                                    str.append(System.lineSeparator());
                                }
                            });
                });

        return str.toString();
    }
}