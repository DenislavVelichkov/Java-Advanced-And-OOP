package JavaOOP.Solid_13.Exercise.controllers;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;
import JavaOOP.Solid_13.Exercise.interfaces.Logger;

import java.util.Scanner;

public class EngineImpl implements JavaOOP.Solid_13.Exercise.interfaces.Engine {
    private Logger logger;
    private Scanner scanner;

    public EngineImpl(Logger logger) {
        this.logger = logger;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run(String endString) {
        String input = scanner.nextLine();

        while (!input.equals(endString)) {
            String[] tokens = input.split("\\|");

            String time = tokens[1];
            String message = tokens[2];

            this.logger.log(time, message, ReportLevel.valueOf(tokens[0]));

            input = this.scanner.nextLine();
        }
    }

    @Override
    public String toString() {
        return this.logger.toString();
    }
}
