package JavaOOP.Solid_13.Exercise.factories;

import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Factory;
import JavaOOP.Solid_13.Exercise.interfaces.Logger;
import JavaOOP.Solid_13.Exercise.models.MessageLogger;

public class LoggerFactory implements Factory<Logger> {
    private AppenderFactory appenderFactory;

    public LoggerFactory() {
        this.appenderFactory = new AppenderFactory();
    }

    @Override
    public Logger produce(String produceData) {
        String[] tokens = produceData.split(System.lineSeparator());
        Appender[] appenders = new Appender[tokens.length];

        for (int i = 0; i < tokens.length; ++i) {
            appenders[i] = this.appenderFactory.produce(tokens[i]);
        }

        return new MessageLogger(appenders);
    }
}
