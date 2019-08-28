package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumBytes_2 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(
                "D:\\SoftUni\\Advanced Modules\\Java Fundamentals\\" +
                        "Java Advanced Source Code\\src\\JavaAdvanced\\" +
                        "StreamsFilesAndDirectories_9\\Exercise\\input.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // read file

        String line = reader.readLine();
        int totalSum = 0;

        while (line != null) {
            int sum = 0;

            for (char c : line.toCharArray()) {
                sum += c;
            }

            totalSum += sum;

            line = reader.readLine();
        }

        System.out.println(totalSum);
    }
}