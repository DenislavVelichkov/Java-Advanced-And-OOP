package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException;
}