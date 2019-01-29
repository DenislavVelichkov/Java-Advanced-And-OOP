package JavaAdvanced.MultidimensionalArrays_5.Exercise;

import java.util.Scanner;

public class TheHeiganDance_8ver2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int plPosX = 7;
        int plPosY = 7;
        int playerHP = 18500;
        double bossHP = 3000000d;

        double dealDMG = Double.parseDouble(sc.nextLine());
        String theDeadlySpell = "";

        double eruptionDMG = 6000d;
        double cloudDMG = 3500d;

        while (true) {
            if (playerHP > 0) {
                bossHP -= dealDMG;
            }

            if (theDeadlySpell.equals("Cloud")) {
                playerHP -= cloudDMG;
            }

            if (bossHP <= 0 || playerHP <= 0) {
                break;
            }

            String[] action = sc.nextLine().split("\\s+");
            String spell = action[0];
            int spellX = Integer.parseInt(action[1]);
            int spellY = Integer.parseInt(action[2]);

            if (damageArea(spellX, spellY, plPosX, plPosY)) {
                if (!damageArea(spellX, spellY, plPosX - 1, plPosY) && boardBorder(plPosX - 1)) {
                    plPosX--;
                    theDeadlySpell = "";
                } else if (!damageArea(spellX, spellY, plPosX, plPosY + 1) && boardBorder(plPosY + 1)) {
                    plPosY++;
                    theDeadlySpell  = "";
                } else if (!damageArea(spellX, spellY, plPosX + 1, plPosY) && boardBorder(plPosX + 1)) {
                    plPosX++;
                    theDeadlySpell  = "";
                } else if (!damageArea(spellX, spellY, plPosX, plPosY - 1) && boardBorder(plPosY - 1)) {
                    plPosY--;
                    theDeadlySpell  = "";
                } else {
                    if (spell.equals("Cloud")) {
                        playerHP -= cloudDMG;
                        theDeadlySpell = "Cloud";
                    } else {
                        playerHP -= eruptionDMG;
                        theDeadlySpell = "Eruption";
                    }
                }
            }
        }

        if (theDeadlySpell.equals("Cloud")) {
            theDeadlySpell = "Plague Cloud";
        }else {
            theDeadlySpell = "Eruption";
        }

        if (bossHP <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f\n", bossHP);
        }

        if (playerHP <= 0) {
            System.out.printf("Player: Killed by %s\n", theDeadlySpell);
        } else {
            System.out.printf("Player: %d\n", playerHP);
        }

        System.out.printf("Final position: %d, %d", plPosX, plPosY);
    }

    private static boolean damageArea(int spellX, int spellY, int plyPosX, int plyPosY) {
        return spellX - 1 <= plyPosX && plyPosX <= spellX + 1
                && spellY - 1 <= plyPosY && plyPosY <= spellY + 1;
    }

    private static boolean boardBorder(int cellToBe) {
        return cellToBe >= 0 && cellToBe < 15;
    }
}
