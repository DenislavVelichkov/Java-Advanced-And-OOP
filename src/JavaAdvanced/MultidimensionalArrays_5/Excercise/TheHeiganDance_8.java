package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class TheHeiganDance_8 {
    private static final int X = 15;
    private static final int Y = 15;
    private static int[][] DEFAULT = new int[X][Y];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int plPosX = X / 2;
        int plPosY = Y / 2;
        double playerHP = 18500d;
        double bossHP = 3000000d;

        double dealDMG = Double.parseDouble(reader.readLine());
        String theDeadlySpell = "";

        int[][] board = new int[X][Y];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = 1;
            }
        }
        DEFAULT = board;
        Deque<Double> dmgStack = new ArrayDeque<>();
        double eruptionDMG = 6000d;
        double cloudDMG = 3500d;

        while (true) {
            if (playerHP > 0) {
                bossHP -= dealDMG;
            }

            while (!dmgStack.isEmpty()) {
                if (dmgStack.peek() == 6000d) {
                    theDeadlySpell = "Eruption";
                } else {
                    theDeadlySpell = "Plague Cloud";
                }
                if (playerHP > 0) {
                    playerHP -= dmgStack.remove();
                } else {
                    break;
                }
            }

            if (theDeadlySpell.equals("Plague Cloud")) {
                playerHP -= cloudDMG;
            }

            if (bossHP <= 0 || playerHP <= 0) {
                break;
            }
            String[] action = reader.readLine().split("\\s+");

            String spell = action[0];
            int spellX = Integer.parseInt(action[1]);
            int spellY = Integer.parseInt(action[2]);

            switch (spell) {
                case "Eruption":
                DEFAULT = markDeadFields(board, spellX, spellY);
                board = DEFAULT;
                    int[] newPlPosition = markPlayerPos(DEFAULT, plPosX, plPosY);
                    plPosX = newPlPosition[0];
                    plPosY = newPlPosition[1];

                    if (board[plPosX][plPosY] == 0) {
                        dmgStack.add(eruptionDMG);
                    }

                    break;
                case "Cloud":
                    if (board[plPosX][plPosY] == board[spellX][spellY]) {
                        dmgStack.add(cloudDMG);
                    }
                    break;
                default:
                    break;
            }
        }

        if (bossHP <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f\n", bossHP);
        }

        if (playerHP <= 0) {
            System.out.printf("Player: Killed by %s\n", theDeadlySpell);
        } else {
            System.out.printf("Player: %.2f\n", playerHP);
        }

        System.out.printf("Final position: %d, %d", plPosX, plPosY);
    }

    /*private static void printMatrix(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int i1 = 0; i1 < board[i].length; i1++) {
                System.out.print(board[i][i1] + " ");
            }
            System.out.println();
        }
    }*/

    private static int[] markPlayerPos(int[][] board, int plyPosX, int plyPosY) {
        int[] result = {plyPosX, plyPosY};

        if (checkBorders(board, plyPosX - 1, plyPosY)) {
            if (board[plyPosX - 1][plyPosY] == 1) {
                result[0] = plyPosX - 1;
                return result;
            }
        }
        if (checkBorders(board, plyPosX, plyPosY + 1)) {
            if (board[plyPosX][plyPosY + 1] == 1) {
                result[1] = plyPosY + 1;
                return result;
            }
        }
        if (checkBorders(board, plyPosX + 1, plyPosY)) {
            if (board[plyPosX + 1][plyPosY] == 1) {
                result[0] = plyPosX + 1;
                return result;
            }
        }
        if (checkBorders(board, plyPosX, plyPosY - 1)) {
            if (board[plyPosX][plyPosY - 1] == 1) {
                result[1] = plyPosY - 1;
                return result;
            }
        }

        return result;
    }

    private static int[][] markDeadFields(int[][] board, int x, int y) {
        for (int row = x - 1; row <= x + 1; row++) {
            for (int col = y - 1; col <= y + 1; col++) {
                if (checkBorders(board, row, col)) {
                    board[row][col] = 0;
                }
            }
        }

        for (int row = x - 1, col = y - 1; row <= x + 1 &&
                col <= y + 1; row++, col++) {//down-righ
            if (checkBorders(board, row, col)) {
                board[row][col] = 0;

            }
        }

        for (int row = x - 1, col = y + 1; row <= x + 1 &&
                col <= y - 1; row++, col--) {//right-down-left
            if (checkBorders(board, row, col)) {
                board[row][col] = 0;
            }
        }
        return board;
    }

    private static boolean checkBorders(int[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
}
