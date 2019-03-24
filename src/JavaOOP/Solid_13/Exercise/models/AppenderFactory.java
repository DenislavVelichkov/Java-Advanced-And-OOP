package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;
import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Factory;
import JavaOOP.Solid_13.Exercise.interfaces.Layout;

public class AppenderFactory implements Factory<Appender> {
    private LayoutFactory layoutFactory;

    public AppenderFactory() {
        this.layoutFactory = new LayoutFactory();
    }

    @Override
    public Appender produce(String produceData) {
        String[] tokens = produceData.split("\\s+");

        String appenderType = tokens[0];
        String layoutType = tokens[1];

        Layout layout = this.layoutFactory.produce(layoutType);
        Appender appender = null;

        if (appenderType.equals("ConsoleAppender")) {
            appender = new ConsoleAppender(layout);
        } else if (appenderType.equals("FileAppender")) {
            appender = new FileAppender(layout);
        }

        if (tokens.length == 3) {
            appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
        }

        return appender;
    }
}

