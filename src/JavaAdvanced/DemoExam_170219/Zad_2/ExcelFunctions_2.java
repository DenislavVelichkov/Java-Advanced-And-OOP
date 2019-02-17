package JavaAdvanced.DemoExam_170219.Zad_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExcelFunctions_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList<String>> row = new ArrayList<>();
        ArrayList<String> col = new ArrayList<>();

        while (n-- > 0) {
            String[] data = sc.nextLine().split("[,\\s]+");
            col.addAll(Arrays.asList(data));
            row.add(col);
            col = new ArrayList<>();
        }

        String[] line = sc.nextLine().split(" ");

        switch (line[0]) {
            case "sort":
                break;
            case "hide":
                hide(row, line[1]);
                break;
            case "filter":
                filter(row, line[1], line[2]);
                break;
            default:
                break;
        }
        //Hide
    }

    private static void filter(ArrayList<ArrayList<String>> row, String headerName, String param) {
        ArrayList<String> temp = new ArrayList<>(row.get(0));
        int header = temp.get(0).indexOf(headerName);

        for (ArrayList<String> col : row) {
            temp.add(col.get(header));
        }

    }

    private static void hide(ArrayList<ArrayList<String>> rows, String cmd) {
        int colToHide = rows.get(0).indexOf(cmd);
        for (ArrayList<String> row : rows) {
            row.remove(colToHide);
        }
    }
}
