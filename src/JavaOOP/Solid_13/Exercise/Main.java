package JavaOOP.Solid_13.Exercise;

import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Layout;
import JavaOOP.Solid_13.Exercise.interfaces.Logger;
import JavaOOP.Solid_13.Exercise.models.ConsoleAppender;
import JavaOOP.Solid_13.Exercise.models.MessageLogger;
import JavaOOP.Solid_13.Exercise.models.SimpleLayout;

public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");

    }

}
