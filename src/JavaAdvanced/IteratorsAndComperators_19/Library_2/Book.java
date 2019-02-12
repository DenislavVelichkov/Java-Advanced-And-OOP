package JavaAdvanced.IteratorsAndComperators_19.Library_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> author;

    public Book(String title, int year, String... author) {
        setTitle(title);
        setYear(year);
        setAuthor(author);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = new ArrayList<>();

        if (author.length != 0) {
//            throw new IllegalArgumentException("No authors provided");
            this.author.addAll(Arrays.asList(author));
        }

    }
}
