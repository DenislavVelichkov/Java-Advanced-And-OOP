package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileOwnerAttributeView;

public class SumLines_1 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(
                "D:\\SoftUni\\Advanced Modules\\Java Fundamentals\\" +
                        "Java Advanced Source Code\\src\\JavaAdvanced\\" +
                        "StreamsFilesAndDirectories_9\\Exercise\\input.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // read file

        String line = reader.readLine();

        FileWriter writer = new FileWriter("sumLines.txt");

        while (line != null) {
            int sum = 0;

            for (char c : line.toCharArray()) {
                sum += c;
            }
            writer.write(sum + System.lineSeparator()); // заради рализкзата в OS и това как четат новите редове
            line = reader.readLine();
        }
    }
}
