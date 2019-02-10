package JavaAdvanced.Generics_17.Exercise.CustomList_7;

import java.util.ArrayList;

public class CustomList<T extends Comparable<T>> {
    private ArrayList<T> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

    public void addData(T data) {
        this.data.add(data);
    }

    public void removeData(int index) {
        this.data.remove(index);
    }

    public boolean contains(T element) {
        return this.data.contains(element);
    }

    public void swap(int index1, int index2) {
        T temp = this.data.get(index1);
        this.data.set(index1, this.data.get(index2));
        this.data.set(index2, temp);
    }

    public int countGreaterThan(T value) {
        int count = 0;

        for (T param : this.data) {
            if (param.compareTo(value) > 0) {
                count++;
            }
        }

        return count;
    }

    public T getMax() {
        return this.data.stream().max(Comparable::compareTo).get();
    }

    public T getMin() {
        return this.data.stream().min(Comparable::compareTo).get();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        this.data.forEach(el -> str.append(el).append(System.lineSeparator()));
        return str.toString().trim();
    }
}
