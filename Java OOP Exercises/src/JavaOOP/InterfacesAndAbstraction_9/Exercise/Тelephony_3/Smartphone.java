package JavaOOP.InterfacesAndAbstraction_9.Exercise.Тelephony_3;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone() {
        this.numbers = new ArrayList<>();
        this.urls = new ArrayList<>();
    }

    public Smartphone(List<String> numbers, List<String> urls) {
        this();
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : this.urls) {
            boolean isDigit = false;

            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))) {
                    isDigit = true;
                    break;
                }
            }

            if (!isDigit) {
                sb.append("Browsing: ")
                        .append(url).append("!")
                        .append(System.lineSeparator());
            } else {
                sb.append("Invalid URL!")
                        .append(System.lineSeparator());
            }

        }

        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String number : this.numbers) {
            boolean isDigit = true;

            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    isDigit = false;
                    break;
                }
            }

            if (isDigit) {
                sb.append("Calling... ")
                        .append(number)
                        .append(System.lineSeparator());
            } else {
                sb.append("Invalid number!")
                        .append(System.lineSeparator());
            }
        }

        return sb.toString();
    }
}
