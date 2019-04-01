package JavaOOP.Workshop_17.Exercise;

import JavaOOP.Workshop_17.Exercise.Core.Engine;
import JavaOOP.Workshop_17.Exercise.Core.ComputerSystem;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ComputerSystem computerSystem = new ComputerSystem();
        Engine engine = new Engine(computerSystem);
        engine.run();
        System.out.print(computerSystem.toString());
    }
}
