package JavaAdvanced.IteratorsAndComperators_19.Lab_Zad123;


import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        return result != 0 ? result : Integer.compare(o2.getYear(), o1.getYear());
    }
}
