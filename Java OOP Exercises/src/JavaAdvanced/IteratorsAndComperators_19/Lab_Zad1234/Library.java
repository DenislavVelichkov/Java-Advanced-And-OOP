package JavaAdvanced.IteratorsAndComperators_19.Lab_Zad1234;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new Iterator<>() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return this.count < books.length;
            }

            @Override
            public Book next() {
                while (hasNext()) {
                    return books[this.count++];
                }
                return null;
            }
        };
    }
}
