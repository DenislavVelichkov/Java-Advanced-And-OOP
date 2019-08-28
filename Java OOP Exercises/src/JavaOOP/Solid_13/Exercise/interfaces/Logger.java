package JavaOOP.Solid_13.Exercise.interfaces;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;

public interface Logger {
    void log(String time, String message, ReportLevel reportLevel);
}
