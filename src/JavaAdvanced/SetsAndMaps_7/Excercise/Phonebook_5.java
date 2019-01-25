package JavaAdvanced.SetsAndMaps_7.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Phonebook_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        HashMap<String, String> phonebook = new LinkedHashMap<>();

        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];

            phonebook.putIfAbsent(name, "");
            if (phonebook.containsKey(name)) {
                phonebook.put(name, number);
            }

            input = reader.readLine();
        }

        String searchCriteria = reader.readLine();
        while (!searchCriteria.equals("stop")) {


            if (phonebook.containsKey(searchCriteria)) {
                System.out.printf("%s -> %s\n", searchCriteria, phonebook.get(searchCriteria));
            } else {
                System.out.printf("Contact %s does not exist.\n", searchCriteria);
            }

            searchCriteria = reader.readLine();
        }
    }
}
