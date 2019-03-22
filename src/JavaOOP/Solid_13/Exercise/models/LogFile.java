package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.interfaces.File;

public class LogFile implements File {
    private StringBuilder text;
    private int size;

    public LogFile() {
        this.text = new StringBuilder();
        this.size = 0;
    }

    @Override
    public boolean write() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void append(String text) {
        this.text.append(text);
    }
}
