package JavaAdvanced.IteratorsAndComperators_19.Library_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Pesho", 1999, "Gosho");
        Book book1 = new Book("Pesho", 1999, "Gosho");
        Book book2 = new Book("Pesho", 1999, "Gosho", "Pesho", "Stamo");

        List<Book> library = new ArrayList<>();
        library.add(book);
        library.add(book1);
        library.add(book2);

    }
}
