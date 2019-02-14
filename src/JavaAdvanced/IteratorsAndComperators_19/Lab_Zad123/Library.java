package JavaAdvanced.IteratorsAndComperators_19.Lab_Zad123;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    @SafeVarargs
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
                return books[this.count++];
            }
        };
    }
}
