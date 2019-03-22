package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.interfaces.File;

public class LogFile implements File {
    private StringBuilder text;

    public LogFile() {
        this.text = new StringBuilder();
    }

    @Override
    public boolean write() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
