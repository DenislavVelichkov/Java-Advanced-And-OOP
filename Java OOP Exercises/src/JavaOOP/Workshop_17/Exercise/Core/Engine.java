package JavaOOP.Workshop_17.Exercise.Core;

import JavaOOP.Workshop_17.Exercise.hardwareComponents.HeavyHardware;
import JavaOOP.Workshop_17.Exercise.hardwareComponents.PowerHardware;
import JavaOOP.Workshop_17.Exercise.softwareComponents.ExpressSoftware;
import JavaOOP.Workshop_17.Exercise.softwareComponents.LightSoftware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine {
    private ComputerSystem computerSystem;

    public Engine(ComputerSystem computerSystem) {
        this.computerSystem = computerSystem;
    }

    public void run() throws IOException {
        BufferedReader reader =
            new BufferedReader(
            new InputStreamReader(System.in));
        String input = reader.readLine();

        while (!input.equalsIgnoreCase("System Split")) {
            String command = input.substring(0, input.indexOf("("));
            String[] cmdArgs =
                input.substring(
                    input.indexOf("(") + 1, input.length() - 1)
                    .split(", ");

            switch (command) {
                case "RegisterPowerHardware":
                    this.computerSystem.addHardware(new PowerHardware(
                        cmdArgs[0],
                        Integer.parseInt(cmdArgs[1]),
                        Integer.parseInt(cmdArgs[2])
                    ));
                    break;
                case "RegisterHeavyHardware":
                    this.computerSystem.addHardware(new HeavyHardware(
                        cmdArgs[0],
                        Integer.parseInt(cmdArgs[1]),
                        Integer.parseInt(cmdArgs[2])
                    ));
                    break;
                case "RegisterExpressSoftware":
                    this.computerSystem.addSoftwareComponent(
                        cmdArgs[0],
                        new ExpressSoftware(
                            cmdArgs[1],
                            Integer.parseInt(cmdArgs[2]),
                            Integer.parseInt(cmdArgs[3])));
                    break;
                case "RegisterLightSoftware":
                    this.computerSystem.addSoftwareComponent(
                        cmdArgs[0],
                        new LightSoftware(
                            cmdArgs[1],
                            Integer.parseInt(cmdArgs[2]),
                            Integer.parseInt(cmdArgs[3])));
                    break;
                case "ReleaseSoftwareComponent":
                    this.computerSystem.releaseSoftwareComponent(cmdArgs[0], cmdArgs[1]);
                    break;
                case "Analyze":
                    System.out.println(this.computerSystem.analyze());
                    break;
                default:
                    break;
            }

            input = reader.readLine();
        }
    }
}
