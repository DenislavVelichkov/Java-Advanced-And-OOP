package JavaAdvanced.MultidimensionalArrays_5;

import java.util.Scanner;

public class FindTheRealQueen_7 {
    private static int SIZE = 8;
    private static String QUEEN = "q";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isItValidQueen = false;

        String[][] board = new String[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            String[] tempArr = sc.nextLine().split("\\s+");
            board[row] = tempArr;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals(QUEEN)) {
                    isItValidQueen = checkForValidQueen(board, i, j);
                    if (isItValidQueen) {
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }
    }

    private static boolean checkForValidQueen(String[][] board, int row, int column) {
        return checkForValidPath(board, row, column);
    }

    private static boolean checkForValidPath(String[][] board, int row, int column) {
        for (int i = column + 1; i < SIZE; i++) {//check right
            if (board[row][i].equals(QUEEN)) {
                return false;
            }
        }

        for (int i = column - 1; i > 0; i--) {//check left
            if (board[row][i].equals(QUEEN)) {
                return false;
            }
        }

        for (int i = row - 1; i > 0; i--) {
            if (board[i][column].equals(QUEEN)) {//check up
                return false;
            }
        }

        for (int i = row + 1; i < SIZE; i++) {
            if (board[i][column].equals(QUEEN)) {//check down
                return false;
            }
        }

        for (int i = row - 1, j = column + 1; i > 0 && j < SIZE; i--, j++) { //up-right
            if (board[i][j].equals(QUEEN)) {
                return false;
            }
        }

        for (int i = row + 1, j = column - 1; i < SIZE && j > 0; i++, j--) { //down-left
            if (board[i][j].equals(QUEEN)) {
                return false;
            }
        }

        for (int i = row - 1, j = column - 1; i > 0 && j > 0; i--, j--) { //up-left
            if (board[i][j].equals(QUEEN)) {
                return false;
            }
        }

        for (int i = row + 1, j = column + 1; i > SIZE && j > SIZE; i++, j++) { //down-right
            if (board[i][j].equals(QUEEN)) {
                return false;
            }
        }

        return true;
    }
}
