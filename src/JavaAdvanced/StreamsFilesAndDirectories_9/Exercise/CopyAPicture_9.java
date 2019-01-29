package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;

public class CopyAPicture_9 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("java.jpg");
        byte[] buffer = inputStream.readAllBytes();

        FileOutputStream outputStream = new FileOutputStream("copy-java.jpg");

        outputStream.write(buffer);
        outputStream.close();
    }
}
