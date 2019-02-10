package JavaAdvanced.Generics_17.Exercise.GenericBox_1;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> params;
    private List<Integer> intParams;

    Box() {
        this.params = new ArrayList<>();
    }

    public void add(T param) {
        if (param instanceof String) {
            this.params.add(param);
        }
        if (param instanceof Integer) {
            int num = (int) param;
            this.intParams.add(num);
        }
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        this.params.forEach(param -> str
                .append(param.getClass().getName())
                .append(": ")
                .append(param)
                .append(System.lineSeparator()));

        return str.toString();
    }

}
