package JavaOOP.Inheritance_7.Exercise.BookShop_2;

import java.security.InvalidParameterException;

public class Book {
    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    public String getAuthor() {
        return this.author;
    }

    private void setAuthor(String author) {
        String secondName = author.substring(author.indexOf(" "));

        if (Character.isDigit(secondName.trim().charAt(0))) {
            throw new InvalidParameterException("Author not valid!");
        }

        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        if (title.length() < 3) {
            throw new InvalidParameterException("Title not valid!");
        }

        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    private void setPrice(double price) {
        if (price < 1d) {
            throw new InvalidParameterException("Price not valid!");
        }

        this.price = price;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append(String.format("Price: %.1f", this.getPrice()))
                .append(System.lineSeparator());
        return sb.toString();

    }
}
