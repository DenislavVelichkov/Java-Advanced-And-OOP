package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.contracts;

import jdk.jshell.spi.ExecutionControl;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Unit;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
