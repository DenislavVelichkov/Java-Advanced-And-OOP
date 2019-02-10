package JavaAdvanced.Generics_17.Exercise.Tuple_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tokens = sc.nextLine();

        int firstParam = tokens.lastIndexOf(" ");
        String param1 = tokens.substring(0, firstParam);
        String param2 = tokens.substring(firstParam + 1);

        Tuple tuple = new Tuple(param1, param2);

        tokens = sc.nextLine();
        firstParam = tokens.lastIndexOf(" ");
        param1 = tokens.substring(0, firstParam);
        param2 = tokens.substring(firstParam + 1);
        Tuple tuple1 = new Tuple(param1, param2);

        tokens = sc.nextLine();
        firstParam = tokens.lastIndexOf(" ");
        param1 = tokens.substring(0, firstParam);
        param2 = tokens.substring(firstParam + 1);
        Tuple tuple2 = new Tuple(param1, param2);

        System.out.println(tuple);
        System.out.println(tuple1);
        System.out.println(tuple2);
    }
}
