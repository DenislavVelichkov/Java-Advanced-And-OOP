package JavaAdvanced.Generics_17.Exercise.GenericCountMethodString_5;

import java.util.ArrayList;

public class Box<T extends Comparable<T>> { // означава Cmparable от себе си. <T extends Comparable<T>
    private ArrayList<T> params;

    Box() {
        this.params = new ArrayList<>();
    }

    public ArrayList<T> getParams() {
        return this.params;
    }

    public void add(T param) {
        this.params.add(param);
    }

    public void compare(ArrayList<T> arg, T value) {
        int count = 0;
        for (T param : arg) {
            if (param.compareTo(value) > 0) {
                count++;
                System.out.println(count);
            }
        }
    }
}