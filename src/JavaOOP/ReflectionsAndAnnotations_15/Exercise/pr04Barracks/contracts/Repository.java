package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts;

import jdk.jshell.spi.ExecutionControl;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	String removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
