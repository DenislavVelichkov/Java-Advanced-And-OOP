package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.core;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Executable;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Runnable;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {
    private static final String COMMAND_PACKAGE = "pr05Barracks.core.commands.";

    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String result = interpretCommand(data);

                if (result.equals("fight")) {
                    break;
                }

                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    private String interpretCommand(String[] data) {
        String commandName = Character.toUpperCase(data[0].charAt(0)) +
                                 data[0].substring(1) + "Command";
        String result = "";

        try {
            Class<? extends Executable> commandClass =
                (Class<? extends Executable>)
                    Class.forName(Engine.COMMAND_PACKAGE + commandName);

            Constructor constructor =
                commandClass.getDeclaredConstructor(
                    String[].class, Repository.class, UnitFactory.class
                );
            constructor.setAccessible(true);

            Executable executable = (Executable) constructor.newInstance(new Object[]{
                data, this.repository, this.unitFactory});// или само: data, this.repository, this.unitFactory
            //Object[]{...} има функцията на args, МОже да му се подават различен брой аргументи.
            result = executable.execute();

        } catch (ClassNotFoundException |
                              NoSuchMethodException |
                              InstantiationException |
                              IllegalAccessException |
                              InvocationTargetException e) {
            e.printStackTrace();
        }

        return result;
    }
}
