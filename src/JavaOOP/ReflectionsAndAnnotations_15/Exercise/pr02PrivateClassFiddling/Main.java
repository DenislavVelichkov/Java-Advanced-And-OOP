package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr02PrivateClassFiddling;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr02PrivateClassFiddling.com.BlackBoxInt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        BlackBoxInt blackBoxInt;

        Constructor constructor = BlackBoxInt.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        blackBoxInt = (BlackBoxInt) constructor.newInstance();
        while (!input.equals("END")) {
            String[] tokens = input.split("_");
            String command = tokens[0];
            int number = Integer.parseInt(tokens[1]);


            Method method = blackBoxInt.getClass()
                                .getDeclaredMethod(command, int.class);

            method.setAccessible(true);
            method.invoke(blackBoxInt, number);

            Field field = blackBoxInt.getClass().getDeclaredField("innerValue");

            field.setAccessible(true);
            System.out.println(field.get(blackBoxInt));

            input = sc.nextLine();
        }
    }
}
