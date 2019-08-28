package JavaOOP.Solid_13.Exercise;

import JavaOOP.Solid_13.Exercise.controllers.EngineImpl;
import JavaOOP.Solid_13.Exercise.controllers.InputParser;
import JavaOOP.Solid_13.Exercise.factories.LoggerFactory;
import JavaOOP.Solid_13.Exercise.interfaces.Factory;
import JavaOOP.Solid_13.Exercise.interfaces.Logger;

public class Main {
    private static final Factory<Logger> LOGGER_FACTORY = new LoggerFactory();
    private static EngineImpl engine;

    public static void main(String[] args) {
        InputParser inputParser = new InputParser();

        Main.engine = new EngineImpl(Main.LOGGER_FACTORY.produce(inputParser.readLoggerInfo()));
        engine.run(engine.toString());

       /* Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");
*/
    }

}
