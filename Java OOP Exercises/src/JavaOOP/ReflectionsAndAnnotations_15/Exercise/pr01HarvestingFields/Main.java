package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr01HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Field[] fields = RichSoilLand.class.getDeclaredFields();
        Consumer<Field> printer = f -> System.out.println(String.format("%s %s %s",
            Modifier.toString(f.getModifiers()),
            f.getType().getSimpleName(),
            f.getName()));

        while (!input.equalsIgnoreCase("harvest")) {
            String finalInput = input;

            Field[] requestedFields =
                Arrays.stream(fields)
                    .filter(field -> Modifier.toString(
                        field.getModifiers()).equalsIgnoreCase(finalInput)
                    )
                    .toArray(Field[]::new);

            if (requestedFields.length != 0) {
                Arrays.stream(requestedFields).forEach(printer);
            } else {
                Arrays.stream(fields).forEach(printer);
            }

            input = sc.nextLine();
        }
    }
}
