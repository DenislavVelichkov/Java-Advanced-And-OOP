package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheHeiganDance_8 {
    private static int X = 15;
    private static int Y = 15;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int playerStartPosition =  15 / 2;
        double playerHP = 18500d;
        double enemieHP = 3000000d;

        double dealDMG = Double.parseDouble(reader.readLine());
        String input = reader.readLine();

        while (true) {
            String[] action = input.split("\\s+");

            String spell = action[0];
            int x = Integer.parseInt(action[1]);
            int y = Integer.parseInt(action[2]);

            int[][] board = new int[X][Y];
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    board[row][col] = 1;
                }
            }

            switch (spell) {
                case "Eruption":
                    board[x][y] = markDeadFields(board, x, y);
                    System.out.println();
                    break;
                case "Cloud":

                    break;
                default:
                    enemieHP -= dealDMG;
                    break;
            }
            input = reader.readLine();
        }
    }

    private static int markDeadFields(int[][] board, int x, int y) {
        for (int row = x - 1; row <= x + 1; row++) {
            for (int col = y - 1; col <= y + 1; col++) {
                if (checkBorders(board, row, col)) {
                    board[row][col] = 0;
                }
            }
        }






        return 0;
    }

    private static boolean checkBorders(int[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
}
