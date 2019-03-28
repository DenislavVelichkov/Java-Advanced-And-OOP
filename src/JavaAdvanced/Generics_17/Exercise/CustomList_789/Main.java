package JavaAdvanced.Generics_17.Exercise.CustomList_789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        CustomList list = new CustomList();

        while (!line.equals("END")) {
            String[] cmd = line.split("\\s+");
            String command = cmd[0];

            switch (command) {
                case "AddCommand":
                    list.addData(cmd[1]);
                    break;
                case "Remove":
                    list.removeData(Integer.parseInt(cmd[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(cmd[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(cmd[1]),
                            Integer.parseInt(cmd[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(cmd[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
                case "Sort":
                    list.sort();
                    break;
                default:
                    break;
            }

            line = sc.nextLine();
        }
    }
}
