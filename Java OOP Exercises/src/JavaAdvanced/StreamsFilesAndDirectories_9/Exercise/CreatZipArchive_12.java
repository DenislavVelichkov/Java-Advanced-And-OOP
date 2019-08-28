package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreatZipArchive_12 {

    public static void main(String[] args) throws IOException {

        FileOutputStream outputStream = new FileOutputStream("file.zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        FileInputStream fileInputStream = new FileInputStream("list.ser");

        zipOutputStream.putNextEntry(new ZipEntry("list.ser"));
        zipOutputStream.write(fileInputStream.readAllBytes());

        outputStream.close();
        zipOutputStream.close();
        fileInputStream.close();

    }
}
