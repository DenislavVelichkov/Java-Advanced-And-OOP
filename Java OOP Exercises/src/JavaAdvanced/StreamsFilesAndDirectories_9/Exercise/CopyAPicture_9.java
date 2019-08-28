package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;

public class CopyAPicture_9 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("src\\JavaAdvanced\\" +
                "StreamsFilesAndDirectories_9\\Exercise\\Roarin Lion.jpg"); //get picture Bytes

        byte[] buffer = inputStream.readAllBytes();

        FileOutputStream outputStream = new FileOutputStream("copy-RoaringLion.jpg");

        outputStream.write(buffer);
        outputStream.close();
    }
}
