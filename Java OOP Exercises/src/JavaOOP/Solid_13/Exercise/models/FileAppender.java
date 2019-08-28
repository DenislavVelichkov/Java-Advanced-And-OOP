package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.enums.ReportLevel;
import JavaOOP.Solid_13.Exercise.interfaces.File;
import JavaOOP.Solid_13.Exercise.interfaces.Layout;

public class FileAppender extends AppenderImpl {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    public FileAppender(Layout layout, ReportLevel reportLevel) {
        super(layout, reportLevel);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        if (this.file == null) {
            throw new IllegalCallerException("File not set!");
        }

        if (this.canAppend(reportLevel)) {
            file.append(this.getLayout().format(time, message, reportLevel));
        }
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", File size; " +
                this.file.getSize();
    }
}
