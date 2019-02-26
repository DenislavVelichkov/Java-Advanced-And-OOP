package JavaAdvanced.MiDExamPrep;

import java.util.Scanner;

public class Snake_2 {
    private static int snakeLength = 1;
    private static int foodCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int screenSize = Integer.parseInt(sc.nextLine());
        char[][] board = new char[screenSize][screenSize];
        int[] snakePosition = new int[2];
        String[] commands = sc.nextLine().split(",");

        for (int row = 0; row < screenSize; row++) {
            board[row] = sc.nextLine().toCharArray();
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 's') {
                    snakePosition[0] = row;
                    snakePosition[1] = col;
                }
            }
        }

        snakeMoves(board, commands);


    }

    private static void snakeMoves(char[][] board, String[] commands) {
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "up":
                    break;
                case "down":
                    break;
                case "left":
                    break;
                case "right":
                    break;
                default:
                    break;
            }
        }
    }
}
