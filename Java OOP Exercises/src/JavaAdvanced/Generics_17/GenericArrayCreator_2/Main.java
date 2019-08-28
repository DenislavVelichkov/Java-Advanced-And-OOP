package JavaAdvanced.Generics_17.GenericArrayCreator_2;

public class Main {
    public static void main(String[] args) {

        Object[] strings = ArrayCreator.create(10, "empty");
        System.out.println(strings != null);
        int count = 0;
        for (Object string : strings) {
            System.out.println(count++ + " " + string);
            System.out.println(count);
        }

    }
}
