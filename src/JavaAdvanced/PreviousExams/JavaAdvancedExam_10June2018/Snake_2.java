package JavaAdvanced.PreviousExams.JavaAdvancedExam_10June2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Snake_2 {
    private static int snakeLength = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int boardSize = Integer.parseInt(reader.readLine());
        ArrayDeque<String> commands =
                Arrays.stream(reader.readLine().split(","))
                .collect(Collectors.toCollection(ArrayDeque::new));
        String[][] board = new String[boardSize][];

        for (int i = 0; i < board.length; i++) {
            board[i] = reader.readLine().split(" ");
        }

        while (!commands.isEmpty()) {
            findStartingCoordinates(board);
            switch (commands.pop()) {
                case "right":

                    break;
                case "left":
                    break;
                case "down":
                    break;
                case "up":
                    default:
                        break;
            }

        }
    }

    private static int findStartingCoordinates(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].charAt(0) == 's') {
                    return board[i][j];
                }
            }
        }
        return null;
    }
}
