package JavaOOP.WorkingWithAbstractions_3.Exercise.GreedyTimes_6;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Bag {
    private long capacity;
    private HashMap<String, HashMap<String, Long>> items;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.items = new LinkedHashMap<>();
    }

    public HashMap<String, HashMap<String, Long>> getItems() {
        return this.items;
    }

    public void addItem(String itemType, long itemAmount) {
        this.items.putIfAbsent(itemType, new LinkedHashMap<>());
        this.items.get(itemType).put(itemType, 0L);

        if (isThereMoreSpace(this.items)) {
            this.items
                    .get(itemType)
                    .put(itemType, items.get(itemType).get(itemType) + itemAmount);
        }
    }

    private boolean isThereMoreSpace(HashMap<String, HashMap<String, Long>> items) {
        long finalCapacity = 0;

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


        return super.toString();
    }
}

