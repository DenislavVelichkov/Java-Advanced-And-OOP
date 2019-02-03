package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;

public class SumLinesAndWriteToFile_1 {
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
            //записване във файл
            writer.write(sum + System.lineSeparator()); // заради рализкзата в OS и това как четат новите редове
            line = reader.readLine();
        }

        writer.close();
    }
}
