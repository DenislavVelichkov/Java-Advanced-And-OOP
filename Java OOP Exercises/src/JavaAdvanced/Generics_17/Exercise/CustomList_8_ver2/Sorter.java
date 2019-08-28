package JavaAdvanced.Generics_17.Exercise.CustomList_8_ver2;

public class Sorter {
    public static <T extends Comparable<T>> void sort(SmartList<T> smartList) {
        for (int i = 0; i < smartList.size(); i++) { // Bubble Sort
            for (int j = i + 1; j < smartList.size(); j++) {
                if (smartList.get(i).compareTo(smartList.get(j)) > 0) {
                    smartList.swap(i, j);
                }
            }
        }
    }
}
