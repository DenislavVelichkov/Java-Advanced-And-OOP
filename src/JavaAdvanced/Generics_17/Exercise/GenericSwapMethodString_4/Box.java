package JavaAdvanced.Generics_17.Exercise.GenericSwapMethodString_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Box<T> {
    private ArrayList<T> params;

    Box() {
        this.params = new ArrayList<>();
    }

    public void add(T param) {
        this.params.add(param);
    }
    public void swap(int first, int second) {
        T val1 = this.params.get(first);
        T val2 = this.params.get(second);
        this.params.set(first, val2);
        this.params.set(second, val1);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        this.params
                .forEach(param -> str
                .append(params.get(0).getClass().getName())
                .append(": ")
                .append(param)
                .append(System.lineSeparator()));

        return str.toString();
    }
}