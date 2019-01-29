package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;

public class GetFolderSize_8 {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("folderSize.txt");
        File file = new File("D:\\SoftUni\\Advanced Modules\\Java Fundamentals\\Java Advanced\\Streams,Files and Directories-09\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        /*Arrays.stream(file.listFiles())
                .filter(e -> e.isFile())
                .*/
        int sum = 0;
        for (File f : file.listFiles()) {
            if (f.isFile()) {
                sum += f.length();
            }
        }

        writer.write(String.valueOf(sum));
        writer.close();
    }
}
