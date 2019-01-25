package JavaAdvanced.StreamsFilesAndDirectories_9;

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException {
        String basePath = "";
        String inputPath = "";
        String outputPath = "";


        BufferedReader reader = null;
        PrintWriter writer = null;
        int row = 1;

        try {
            reader = new BufferedReader(new FileReader(inputPath));
            writer = new PrintWriter(new FileWriter(outputPath));
            String line = reader.readLine();

            while (line != null) {
                if (row % 3 == 0) {
                    writer.println(line);
                }

                row++;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
