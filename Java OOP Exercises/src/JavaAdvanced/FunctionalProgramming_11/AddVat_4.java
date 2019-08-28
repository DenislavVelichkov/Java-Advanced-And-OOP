package JavaAdvanced.FunctionalProgramming_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class AddVat_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] prices = reader.readLine().split(", ");

        UnaryOperator<Double> addVat = d -> 1.2 * d;
        System.out.println("Prices with VAT:");
        Arrays.stream(prices)
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(num -> System.out.printf("%.2f%n", num));
    }
}
