package JavaAdvanced.IteratorsAndComperators_19.Lab_Zad1234;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = new ArrayList<>();

        if (authors.length != 0) {
            this.authors.addAll(Arrays.asList(authors));
        } else {
            this.authors.add("anonymous");
        }
    }
}
