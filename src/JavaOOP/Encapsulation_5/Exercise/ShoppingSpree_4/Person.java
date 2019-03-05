package JavaOOP.Encapsulation_5.Exercise.ShoppingSpree_4;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.products = new ArrayList<>();
        this.setName(name);
        this.setMoney(money);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.contains(" ")) {
            throw new IllegalArgumentException(
                    "Name cannot be empty"
            );
        }

        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException(
                    "Money cannot be negative"
            );
        }

        this.money = money;
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalArgumentException(
                    String.format("%s can't afford %s",
                    this.name, product.getName())

            );
        }

        this.products.add(product);
        this.money -= product.getCost();
        System.out.printf("%s bought %s%n", this.name, product.getName());
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        String result;

        str.append(this.getName());
        str.append(" - ");

        if (this.products.size() == 0) {
            str.append("Nothing bought");
            result = str.toString();
        } else {

            for (Product product : this.products) {
                str.append(product.getName()).append(", ");
            }

            result = str.toString().substring(0, str.length() - 2);
        }

        return result;
    }
}
