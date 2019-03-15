package demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Printable doc = new Document();
        Screen scr = new Screen();
        Reader reader = new Reader();

        doc.print();
        scr.print();

        List<Printable> printables = new ArrayList<>();
        printables.add(doc);
        printables.add(scr);

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
