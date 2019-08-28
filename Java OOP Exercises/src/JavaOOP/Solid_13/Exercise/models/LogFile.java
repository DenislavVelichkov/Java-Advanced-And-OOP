package JavaOOP.Solid_13.Exercise.models;

import JavaOOP.Solid_13.Exercise.interfaces.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class LogFile implements File {
    private static final String DEFAULT_PATH_AND_NAME = "output.txt";
    private StringBuilder text;
    private int size;
    private String filePathAndName;

    public void setFilePathAndName(String filePathAndName) {
        this.filePathAndName = filePathAndName;
    }

    public LogFile() {
        this.text = new StringBuilder();
        this.size = 0;
        this.filePathAndName = LogFile.DEFAULT_PATH_AND_NAME;
    }

    public LogFile(String filePathAndName) {
        this();
        this.filePathAndName = filePathAndName;
    }

    @Override
    public boolean write() {

        try {
            Files.write(
                Paths.get(
                    this.filePathAndName),
                    this.text.toString().getBytes(),
                    StandardOpenOption.APPEND);
            return true;

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    private int calculateSize() {
        return Arrays.stream(
                new char[][]{
                        this.text.toString().toCharArray()}).map(String::valueOf)
                        .filter(s -> Character.isAlphabetic(s.charAt(0)))
                        .mapToInt(value -> value.charAt(0)).sum();
    }

    @Override
    public void append(String text) {
        this.text.append(text);
    }
}
