package JavaAdvanced.Generics_17.ListUtilities_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> asd = new ArrayList<>();
        Collections.addAll(asd, 1, 2, 18, 2 - 1);
        Integer min = ListUtils.getMin(asd);
        System.out.println(min);

        List<String> dsa = new ArrayList<>();
        Collections.addAll(dsa, "aka", "bala", "mica");
        String max = ListUtils.getMax(dsa);
        System.out.println(max);
    }
}
