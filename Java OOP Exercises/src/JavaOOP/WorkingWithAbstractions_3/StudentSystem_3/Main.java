package JavaOOP.WorkingWithAbstractions_3.StudentSystem_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRepository studentSystem = new StudentRepository();

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("Exit")) {
                break;
            }

            studentSystem.parseCommand(input);
        }
    }
}
