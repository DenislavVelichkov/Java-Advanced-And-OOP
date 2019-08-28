package JavaAdvanced.FunctionalProgramming_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split(" ");

        Predicate<String> startWithCapital = word -> Character.isUpperCase(word.charAt(0));

        List<String> capitalWords = Arrays.stream(words)
                .filter(startWithCapital)
                .collect(Collectors.toList());

        System.out.println(capitalWords.size());
        capitalWords
                .forEach(x -> System.out.printf("%s%n", x));

    }
}
