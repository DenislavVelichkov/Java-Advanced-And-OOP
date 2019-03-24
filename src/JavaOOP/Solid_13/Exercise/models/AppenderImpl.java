package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;
import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Layout;

public abstract class AppenderImpl implements Appender {
    private static final ReportLevel REPORT_LEVEL_DEFAULT = ReportLevel.INFO;

    private Layout layout;
    private ReportLevel reportLevel;
    private int messagesCount;
    private boolean canAppend = false;

    public AppenderImpl(Layout layout) {
        this.layout = layout;
        this.reportLevel = REPORT_LEVEL_DEFAULT;
        this.messagesCount = 0;
    }

    public AppenderImpl(Layout layout, ReportLevel reportLevel) {
        this(layout);
        this.reportLevel = reportLevel;
    }

    protected void incrementMessagesCount() {
        ++this.messagesCount;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    public ReportLevel getReportLevel() {
        return this.reportLevel;
    }

    protected boolean canAppend(ReportLevel reportLevel) {
        return this.reportLevel.ordinal() <= reportLevel.ordinal();
    }
    @Override
    public abstract void append(String time, String message, ReportLevel reportLevel);

    public Layout getLayout() {
        return this.layout;
    }

    @Override
    public String toString() {
        return String.format(
                "Appender type: %s, " +
                "Layout type: %s, " +
                "Report level: %s," +
                "Messages appended %d, ",
                this.getClass().getSimpleName(),
                this.layout.getClass().getSimpleName(),
                this.reportLevel.toString(),
                this.messagesCount
        );
    }
}
