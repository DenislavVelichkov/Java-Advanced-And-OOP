package JavaAdvanced.SetsAndMaps_7.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FixEmails_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        HashMap<String, String> emailsList = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            emailsList.putIfAbsent(input, "");
            String mail = reader.readLine();

            if (emailsList.containsKey(input)) {

                if (!mail.contains(".us") &&
                !mail.contains("com") &&
                !mail.contains(".uk")) {

                    emailsList.put(input, mail);
                }
            }

            input = reader.readLine();
        }

        emailsList.forEach((key, value) -> {
            if (!value.isEmpty()) {
                System.out.printf("%s -> %s\n", key, value);
            }
        });
    }
}
