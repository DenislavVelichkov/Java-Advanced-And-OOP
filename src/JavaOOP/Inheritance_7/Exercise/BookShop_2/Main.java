package JavaOOP.Inheritance_7.Exercise.BookShop_2;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String author = sc.nextLine();
        String title = sc.nextLine();
        double price = Double.parseDouble(sc.nextLine());

        try {

            Book book = new Book(author,
                    title,
                    price);

            GoldenEditionBook goldenEditionBook =
                    new GoldenEditionBook(author,
                            title,
                            price);


            System.out.println(book);
            System.out.println(goldenEditionBook);

        } catch (InvalidParameterException ex) {
            System.out.println(ex.getMessage());
            return;
        }
    }
}
