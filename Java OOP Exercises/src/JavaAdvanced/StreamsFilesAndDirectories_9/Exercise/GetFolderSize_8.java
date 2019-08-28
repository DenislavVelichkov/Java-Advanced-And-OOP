package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class GetFolderSize_8 {

    public static void main(String[] args) throws IOException {
//        FileWriter writer = new FileWriter("folderSize.txt"); // не добавя нов ред в новия файл
        PrintWriter writer = new PrintWriter("folderSize.txt"); // добавя нов ред във файла
        File file = new File("src\\JavaAdvanced\\StreamsFilesAndDirectories_9\\Exercise");

        long sum = Arrays.stream(Objects.requireNonNull(file.listFiles()))// Folder Size
                .filter(e -> !e.isDirectory())
                .mapToLong(File::length)
                .sum();
        System.out.println(sum);

        /*int sum = 0;
        for (File f : file.listFiles()) {
            if (f.isFile()) {
                sum += f.length();
            }
        }

        writer.printLn(sum + "");
        writer.close();*/
    }
}
