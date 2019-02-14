package JavaAdvanced.Generics_17.Exercise.Tuple_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tokens = sc.nextLine();

        int index = tokens.lastIndexOf(" ");
        String param1 = tokens.substring(0, index).trim();
        String param2 = tokens.substring(index + 1);

        Tuple tuple = new Tuple(param1, param2);

        tokens = sc.nextLine();
        index = tokens.lastIndexOf(" ");
        param1 = tokens.substring(0, index).trim();
        param2 = tokens.substring(index + 1);
        Tuple tuple1 = new Tuple(param1, Integer.parseInt(param2));

        tokens = sc.nextLine();
        index = tokens.lastIndexOf(" ");
        param1 = tokens.substring(0, index);
        param2 = tokens.substring(index + 1);
        Tuple tuple2 = new Tuple(Integer.parseInt(param1),Double.parseDouble(param2));

        System.out.println(tuple);
        System.out.println(tuple1);
        System.out.println(tuple2);
    }
}
