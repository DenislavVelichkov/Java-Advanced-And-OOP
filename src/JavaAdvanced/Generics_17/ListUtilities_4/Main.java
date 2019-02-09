package JavaAdvanced.Generics_17.ListUtilities_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> asd = new ArrayList<>();
        Collections.addAll(asd, 1, 2, 18, 2 - 1);
        ListUtils.getMin(asd);

        List<String> dsa = new ArrayList<>();
        Collections.addAll(dsa, "aka", "bala", "mica");
        ListUtils.getMax(dsa);

    }
}
