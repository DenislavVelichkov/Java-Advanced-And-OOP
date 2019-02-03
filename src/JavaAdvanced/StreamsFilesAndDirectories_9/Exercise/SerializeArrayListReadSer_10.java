package JavaAdvanced.StreamsFilesAndDirectories_9.Exercise;

import java.io.*;
import java.util.ArrayList;

public class SerializeArrayListReadSer_10 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream inputStream = new FileInputStream("list.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Object list = objectInputStream.readObject();
        ArrayList temp = (ArrayList) list;

        for (Object o : temp) {
            System.out.println(o);
        }
    }
}
