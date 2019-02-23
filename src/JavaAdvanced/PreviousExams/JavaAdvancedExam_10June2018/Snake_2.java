package JavaAdvanced.PreviousExams.JavaAdvancedExam_10June2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Snake_2 {
    private static int snakeLength = 1;
    private static String[][] board;
    private static int foodLeft = 0;
    private static int row;
    private static int col;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int boardSize = Integer.parseInt(reader.readLine());
        ArrayDeque<String> commands =
                Arrays.stream(reader.readLine().split(", "))
                .collect(Collectors.toCollection(ArrayDeque::new));
        board = new String[boardSize][];

        for (int i = 0; i < board.length; i++) {
            board[i] = reader.readLine().split(" ");
        }

        while (!commands.isEmpty()) {
           int[] coordinates = findStartingCoordinates();
            row = coordinates[0];
            col = coordinates[1];

            switch (commands.pop()) {
                case "right":
                    col++;
                    break;

                case "left":
                    col--;
                    break;

                case "down":
                    row--;
                    break;

                case "up":
                    row++;
                    break;

                    default:
                        break;
            }

            isFood(row, col);

            if (isEnemy(row, col)) {
                System.out.println("You lose! Killed by an enemy!");
                return;
            }

            if (foodLeft == 0) {
                System.out.println("You win! Final snake length is " + snakeLength);
                return;
            }

        }

        System.out.printf("You lose! There is still %d food to be eaten.", foodLeft);
    }

    private static boolean isEnemy(int startRow, int startCol) {

        boolean isAHit = false;

        if (board[startRow][startCol].charAt(0) == 'e') {
            isAHit = true;
        }

        return isAHit;
    }

    private static void isFood(int startRow, int startCol) {
        if (board[startRow][startCol].charAt(0) == 'f') {
            snakeLength++;
            foodLeft--;
        }
    }

    private static int[] findStartingCoordinates() {
        int finalRow = 0;
        int finalCol = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].charAt(0) == 'f') {
                    foodLeft++;
                }
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col].charAt(0) == 's') {
                    finalRow = row;
                    finalCol = col;
                }
            }
        }

        return new int[]{finalRow, finalCol};
    }

    public boolean isInBorders() {
        try {

        }
    }
}
