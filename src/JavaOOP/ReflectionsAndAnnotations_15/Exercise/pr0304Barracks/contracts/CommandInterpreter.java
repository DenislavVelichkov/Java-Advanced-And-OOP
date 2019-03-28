package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.contracts;

import pr0304Barracks.contracts.Executable;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
