package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.contracts;

import jdk.jshell.spi.ExecutionControl;
import pr0304Barracks.contracts.Unit;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
