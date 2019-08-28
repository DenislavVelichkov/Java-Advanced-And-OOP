package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;
import java.util.ArrayList;

public class SerializeArrayList_10 {

    public static void main(String[] args) throws IOException {
        ArrayList<Double> list = new ArrayList<>() {{
            add(3.14);
            add(10.14);
            add(42.14);
            add(22.14);
        }};

        FileOutputStream outputStream = new FileOutputStream("list.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }
}
