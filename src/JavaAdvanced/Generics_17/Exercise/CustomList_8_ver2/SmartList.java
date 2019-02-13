package JavaAdvanced.Generics_17.Exercise.CustomList_8_ver2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartList<T extends Comparable<T>> {
    private List<T> data;

    public SmartList() {
        this.data = new ArrayList<>();
    }

    public void add(T element) {
        this.data.add(element);
    }

    public void remove(int index) {
        this.data.remove(index);
    }

    public boolean contains(T element) {
        return this.data.contains(element);
    }

    public void swap(int first, int second) {
        T temp = this.data.get(first);
        this.data.set(first, this.data.get(second));
        this.data.set(second, temp);
    }

    public int countGreaterThan(T element) {
        int count = 0;

        for (T param : this.data) {
            if (param.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }

    public T getMax() {
        return this.data.stream().max(T::compareTo).get();
    }
// T:compareTo or Comparable::compareTo also works ..
    public T getMin() {
        return this.data.stream().min(Comparable::compareTo).get();
    }

    public void sort() {
        Collections.sort(this.data);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        this.data.forEach(el -> str.append(el).append(System.lineSeparator()));
        return str.toString().trim();
    }
}
