package JavaOOP.Solid_13.Exercise.interfaces;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;

public interface Appender {
    void append(String time, String message, ReportLevel reportLevel);

    void setReportLevel(ReportLevel reportLevel);
}
