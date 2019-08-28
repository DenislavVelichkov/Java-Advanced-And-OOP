package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.core.factories;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Unit;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
        "pr05Barracks.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        Unit unit = null; // initialize new instance from object with reflection

        try {
            Class<? extends Unit> unitClass =
            (Class<? extends Unit>) Class.forName(
            UnitFactoryImpl.UNITS_PACKAGE_NAME + unitType
            );

            Constructor constructor = unitClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            unit = (Unit) constructor.newInstance();

        } catch (ClassNotFoundException
                 | ClassCastException
                 | NoSuchMethodException
                 | InstantiationException
                 | IllegalAccessException
                 | InvocationTargetException e) {

            e.printStackTrace();
        }

        return unit;
        /*throw new ExecutionControl.NotImplementedException("message");*/
    }
}
