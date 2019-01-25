package JavaAdvanced.SetsAndMaps_7.Excercise;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        LinkedHashSet<String> users = new LinkedHashSet<>();

        while (n-- > 0) {
            String username = sc.nextLine();
            users.add(username);
        }

        users.forEach(System.out::println);
    }
}
