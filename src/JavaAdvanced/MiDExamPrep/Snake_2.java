package JavaAdvanced.MiDExamPrep;

import java.util.Scanner;

public class Snake_2 {
    private static int snakeLength = 1;
    private static int foodCount = 0;
    private static int[] snakePosition = new int[2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int screenSize = Integer.parseInt(sc.nextLine());
        char[][] board = new char[screenSize][];

        String[] commands = sc.nextLine().split(", ");

        for (int row = 0; row < screenSize; row++) {
            char[] line = sc.nextLine().replace(" ", "").toCharArray();
            board[row] = line;

            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 's') {
                    snakePosition[0] = row;
                    snakePosition[1] = col;
                }
                if (board[row][col] == 'f') {
                    foodCount++;
                }
            }
        }

        for (int i = 0; i < commands.length; i++) {
            snakeMoves(board.length, commands[i]);

            if (board[snakePosition[0]][snakePosition[1]] == 'f') {
                foodCount--;
                snakeLength++;
            }
            if (board[snakePosition[0]][snakePosition[1]] == 'e') {
                System.out.println("You lose! Killed by an enemy!");
                return;
            }

        }

        if (foodCount > 0) {
            System.out.printf("You lose! There is still %d food to be eaten.", foodCount);
        } else {
            System.out.printf("You win! Final snake length is %d", snakeLength);
        }
    }

    private static void snakeMoves(int boardSize, String commands) {

        switch (commands) {
            case "up":
                snakePosition[0]--;

                if (snakePosition[0] < 0) {
                    snakePosition[0] = boardSize - 1;
                }

                break;
            case "down":
                snakePosition[0]++;

                if (snakePosition[0] > boardSize - 1) {
                    snakePosition[0] = 0;
                }

                break;
            case "left":
                snakePosition[1]--;

                if (snakePosition[1] < 0) {
                    snakePosition[1] = boardSize - 1;
                }

                break;
            case "right":
                snakePosition[1]++;

                if (snakePosition[1] > boardSize - 1) {
                    snakePosition[1] = 0;
                }

                break;
            default:
                break;
        }
    }
}
