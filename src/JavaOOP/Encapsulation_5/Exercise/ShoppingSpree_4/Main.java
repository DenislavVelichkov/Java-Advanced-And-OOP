package JavaOOP.Encapsulation_5.Exercise.ShoppingSpree_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] people = reader.readLine().split(";");
        String[] products = reader.readLine().split(";");
        List<Person> listOfPeople = new ArrayList<>();
        List<Product> listOfProducts = new ArrayList<>();

        for (int i = 0; i < people.length; i++) {
            String[] personToBeRet = people[i].split("=");

            for (int j = 0; j < personToBeRet.length; j++) {
                String name = personToBeRet[j];
                double money = Double.parseDouble(personToBeRet[j + 1]);

                try {
                    Person person = new Person(name, money);
                    listOfPeople.add(person);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }

                break;
            }
        }

        for (int i = 0; i < products.length; i++) {
            String[] productToBeRet = products[i].split("=");

            for (int j = 0; j < productToBeRet.length; j++) {
                String name = productToBeRet[j];
                int cost = Integer.parseInt(productToBeRet[j + 1]);

                try {
                    Product product = new Product(name, cost);
                    listOfProducts.add(product);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }

                break;
            }
        }

        if (!listOfPeople.isEmpty()) {

            while (true) {
                String[] input = reader.readLine().split("\\s+");

                if (input[0].equals("END")) {
                    break;
                }

                String name = input[0];
                int indexOfPerson = getIndexOfPerson(listOfPeople, name);
                String product = input[1];
                int indexOfProduct = getIndexOfProduct(listOfProducts, product);

                try {
                    listOfPeople.get(indexOfPerson).buyProduct(listOfProducts.get(indexOfProduct));
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }

            }

            for (Person person : listOfPeople) {
                System.out.println(person);
            }

        }
    }

    private static int getIndexOfProduct(List<Product> listOfProducts, String productName) {
        int index = 0;

        for (Product product : listOfProducts) {
            if (product.getName().equals(productName)) {
                index = listOfProducts.indexOf(product);
                break;
            }
        }

        return index;
    }

    private static int getIndexOfPerson(List<Person> listOfPeople, String personName) {
        int index = 0;

        for (Person person : listOfPeople) {
            if (person.getName().equals(personName)) {
                index = listOfPeople.indexOf(person);
                break;
            }
        }

        return index;
    }
}
