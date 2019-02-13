package JavaAdvanced.Generics_17.Exercise.CustomList_8_ver2;

import java.util.Scanner;

public class Engine implements Runnable {
    private static String END_COMMAND = "END";
    private Scanner sc;
    private String input;
    private CommandParser commandParser;

    public Engine() {
        this.sc = new Scanner(System.in);
        this.commandParser = new CommandParser();
        this.input = "";
    }

    @Override
    public void run() {
        this.input = this.sc.nextLine();

        while (!this.input.equals(Engine.END_COMMAND)) {
            this.commandParser.execute(this.input);

            this.input = this.sc.nextLine();
        }
    }
}
