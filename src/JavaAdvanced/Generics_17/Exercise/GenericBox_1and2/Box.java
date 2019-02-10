package JavaAdvanced.Generics_17.Exercise.GenericBox_1and2;

import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> params;

    Box() {
        this.params = new ArrayList<>();
    }

    public void add(ArrayList<T> param) {
        this.params.addAll(param);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(params.get(0).getClass().getName()).append(": ");
        this.params.forEach(param -> str.append(param).append(" "));

        return str.toString();
    }
}
