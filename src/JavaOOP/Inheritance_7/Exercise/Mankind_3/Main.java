package JavaOOP.Inheritance_7.Exercise.Mankind_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        try {
            String[] input = data.split("\\s+");
            Student student = new Student(input[0], input[1], input[2]);

            System.out.println(student);


            data = sc.nextLine();
            input = data.split("\\s+");

            Worker worker = new Worker(input[0], input[1], Double.parseDouble(input[2]), Double.parseDouble(input[3]));

            System.out.println(worker);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
