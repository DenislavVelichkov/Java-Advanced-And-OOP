package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumLines_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(
                Paths.get("D:\\SoftUni\\Advanced Modules\\Java Fundamentals\\" +
                        "Java Advanced Source Code\\src\\JavaAdvanced\\StreamsFilesAndDirectories_9\\" +
                        "Exercise\\input.txt"));

        String line = reader.readLine();


        while (line != null) {
            int sum = 0;

            for (char c : line.toCharArray()) {
                sum += c;
            }
            System.out.println(sum);
            line = reader.readLine();
        }
    }
}
