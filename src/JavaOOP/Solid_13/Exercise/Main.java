package JavaOOP.Solid_13.Exercise;

import JavaOOP.Solid_13.Exercise.controllers.InputParser;
import JavaOOP.Solid_13.Exercise.factories.LoggerFactory;
import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Factory;
import JavaOOP.Solid_13.Exercise.interfaces.Layout;
import JavaOOP.Solid_13.Exercise.interfaces.Logger;
import JavaOOP.Solid_13.Exercise.models.ConsoleAppender;
import JavaOOP.Solid_13.Exercise.models.MessageLogger;
import JavaOOP.Solid_13.Exercise.models.SimpleLayout;

public class Main {
    private static final Factory<Logger> LOGGER_FACTORY = new LoggerFactory();

    public static void main(String[] args) {
        InputParser inputParser = new InputParser();
        Logger logger = Main.LOGGER_FACTORY.produce(inputParser.readLoggerInfo());


       /* Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");
*/
    }

}
