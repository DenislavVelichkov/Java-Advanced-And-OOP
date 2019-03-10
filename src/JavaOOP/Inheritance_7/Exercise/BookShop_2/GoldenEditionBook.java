package JavaOOP.Inheritance_7.Exercise.BookShop_2;

public class GoldenEditionBook extends Book {
    private static final double GOLDEN_BOOK_PRICE_MODIFIER = 1.30;

    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price * GOLDEN_BOOK_PRICE_MODIFIER);
    }

    public double getPrice() {
        return super.getPrice();
    }

    public String getAuthor() {
        return super.getAuthor();
    }

    public String getTitle() {
        return super.getTitle();
    }
}
