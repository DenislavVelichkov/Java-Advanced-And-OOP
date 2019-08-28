package JavaOOP.Solid_13.Exercise.interfaces;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;

public interface Layout {
    String format(String time, String message, ReportLevel reportLevel);
}
