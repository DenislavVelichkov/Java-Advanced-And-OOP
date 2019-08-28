package JavaOOP.Inheritance_7.Exercise.Animals_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String classType = sc.nextLine();
        String input = sc.nextLine();

        while (!input.equals("Beast!")) {

            try {
                String[] tokens = input.split("\\s+");

                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String gender = tokens[2];

                switch (classType) {
                    case "Cat":
                        System.out.println(new Cat(name, age, gender));

                        break;
                    case "Dog":
                        System.out.println(new Dog(name, age, gender));
                        break;
                    case "Frog":
                        System.out.println(new Frog(name, age, gender));
                        break;
                    case "Kitten":
                        System.out.println(new Kitten(name, age, gender));

                        break;
                    case "Tomcat":
                        System.out.println(new Tomcat(name, age, gender));

                        break;
                    default:
                        break;
                }


            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            classType = sc.nextLine();
            input = sc.nextLine();
        }
    }
}
