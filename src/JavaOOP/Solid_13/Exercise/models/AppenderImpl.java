package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;
import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Layout;

public abstract class AppenderImpl implements Appender {
    private static final ReportLevel REPORT_LEVEL_DEFAULT = ReportLevel.INFO;

    private Layout layout;
    private ReportLevel reportLevel;
    private int messagesCount;

    public AppenderImpl(Layout layout) {
        this.layout = layout;
        this.reportLevel = REPORT_LEVEL_DEFAULT;
        this.messagesCount = 0;
    }

    @Override
    public abstract void append(String time, String message, ReportLevel reportLevel);

    public AppenderImpl(Layout layout, ReportLevel reportLevel) {
        this(layout);
        this.reportLevel = reportLevel;
    }

    public Layout getLayout() {
        return this.layout;
    }
}
