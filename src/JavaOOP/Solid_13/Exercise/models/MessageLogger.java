package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;
import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Logger;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    private void logAll(String time, String massege, ReportLevel reportLevel) {
        for (Appender appender : this.appenders) {
            appender.append(time, massege, reportLevel);

        }
    }
    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    @Override
    public void logInfo(String time, String message) {
        this.logAll(time, message, ReportLevel.INFO);
    }

    @Override
    public void logError(String time, String message) {
        this.logAll(time, message, ReportLevel.ERROR);

    }

    @Override
    public void logWarning(String time, String message) {
        this.logAll(time, message, ReportLevel.WARNING);

    }

    @Override
    public void logCritical(String time, String message) {
        this.logAll(time, message, ReportLevel.CRITICAL);

    }

    @Override
    public void logFatal(String time, String message) {
        this.logAll(time, message, ReportLevel.FATAL);

    }
}
