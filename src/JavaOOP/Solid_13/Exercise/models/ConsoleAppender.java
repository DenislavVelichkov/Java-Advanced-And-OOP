package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;
import JavaOOP.Solid_13.Exercise.interfaces.Appender;
import JavaOOP.Solid_13.Exercise.interfaces.Layout;

public class ConsoleAppender extends AppenderImpl{

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    public ConsoleAppender(Layout layout, ReportLevel reportLevel) {
        super(layout, reportLevel);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        String output = this.getLayout().format(time, message, reportLevel);
        System.out.println(output);
    }
}
