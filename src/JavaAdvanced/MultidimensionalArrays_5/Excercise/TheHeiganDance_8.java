package JavaAdvanced.MultidimensionalArrays_5.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class TheHeiganDance_8 {
    private static final int X = 15;
    private static final int Y = 15;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int plyPosX =  X / 2;
        int plyPosY = Y / 2;
        double playerHP = 18500d;
        double enemieHP = 3000000d;

        double dealDMG = Double.parseDouble(reader.readLine());
        String input = reader.readLine();
        String theDeadlySpell = "";

        while (enemieHP > 0 || playerHP > 0) {
            String[] action = input.split("\\s+");

            String spell = action[0];
            int spellX = Integer.parseInt(action[1]);
            int spellY = Integer.parseInt(action[2]);

            int[][] board = new int[X][Y];
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    board[row][col] = 1;
                }
            }

            Deque<Double> dmgStack = new ArrayDeque<>();
            double eruptionDMG = 3000d;
            double cloudDMG = 3500d;

            if (enemieHP > 0) {
                while (!dmgStack.isEmpty()) {
                    if (dmgStack.peek() == 3000d) {
                        theDeadlySpell = "Eruption";
                    } else {
                        theDeadlySpell = "Cloud";
                    }
                    if (playerHP > 0) {
                        playerHP -= dmgStack.pop();
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }

            switch (spell) {
                case "Eruption":
                    markDeadFields(board, spellX, spellY);
                    markPlayerPos(board, plyPosX, plyPosY);
                    dmgStack.push(eruptionDMG);
                    
                    break;
                case "Cloud":
                    if (board[plyPosX][plyPosY] == board[spellX][spellY]) {
                        dmgStack.push(cloudDMG);
                    }
                    break;
                default:
                    enemieHP -= dealDMG;
                    break;
            }

            input = reader.readLine();
        }

        if (enemieHP <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f", enemieHP);
        }

        if (playerHP <= 0) {
            System.out.printf("Player: Killed by %s", theDeadlySpell);
        } else {
            System.out.printf("Player: %.2f", playerHP);
        }

        System.out.printf("Final position: %d, %d", plyPosX, plyPosY);
    }

    private static void markPlayerPos(int[][] board, int plyPosX, int plyPosY) {

    }

    /*private static void printMatrix(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int i1 = 0; i1 < board[i].length; i1++) {
                System.out.print(board[i][i1] + " ");
            }
            System.out.println();
        }
    }*/

    private static void markDeadFields(int[][] board, int x, int y) {
        for (int row = x - 1; row <= x + 1; row++) {
            for (int col = y - 1; col <= y + 1; col++) {
                if (checkBorders(board, row, col)) {
                    if (board[row][col] == 2) {
                        // TODO: 24.1.2019 г. player moves
                    } else {
                        board[row][col] = 0;
                    }
                }
            }
        }

        for (int row = x - 1, col = y - 1 ; row <= x + 1 && col <= y + 1; row++, col++) {//down-righ
            if (checkBorders(board, row, col)) {
                if (board[row][col] == 2) {
                    // TODO: 24.1.2019 г. player moves
                } else {
                    board[row][col] = 0;
                }
            }
        }

        for (int row = x - 1, col = y + 1 ; row <= x + 1 && col <= y - 1; row++, col--) {//right-down-left
            if (checkBorders(board, row, col)) {
                if (board[row][col] == 2) {
                    // TODO: 24.1.2019 г. player moves
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }

    private static boolean checkBorders(int[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
}
