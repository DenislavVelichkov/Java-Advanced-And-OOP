package JavaAdvanced.Generics_17.GenericArrayCreator_2;

import java.lang.reflect.Array;

public class ArrayCreator{

    public static <T> Object[] create(int length, T item) {
       T[] result = (T[]) new Object[length];
        return setValue(length, item, result);
    }

    public static <T> Object[] create(Class<T> clazz, int length, T item) {
        T[] result = (T[]) Array.newInstance(clazz, length);

        for (int i = 0; i < length; i++) {
            result[i] = item;
        }
        return result;
    }

    private static <T> T[] setValue(int length, T item, T[] result) {
        for (int i = 0; i < length; i++) {
            result[i] = item;
        }
        return result;
    }
}
