package JavaAdvanced.DefiningClasses_13.Exercise.CatLady_9;

import JavaAdvanced.DefiningClasses_13.Exercise.CatLady_9.Cat.Cat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        ArrayList<Cat> cats = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String breed = tokens[0];
            String name = tokens[1];
            double attribute = Double.parseDouble(tokens[2]);

            Cat cat;

            if (breed.equals("Siamese")) {
                cat = new Siamese(name, attribute);
            } else if (breed.equals("Cymric")) {
                cat = new Cymric(name, attribute);
            } else {
                cat = new StreetExtraordinary(name, attribute);
            }

            cats.add(cat);
            input = reader.readLine();
        }

        String name = reader.readLine();

        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                System.out.println(cat);
                break;
            }
        }
    }
}
