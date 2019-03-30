package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.core.commands;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Executable;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.UnitFactory;

public abstract class CommandImpl implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected CommandImpl(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    public String[] getData() {
        return this.data;
    }

    public Repository getRepository() {
        return this.repository;
    }

    public UnitFactory getUnitFactory() {
        return this.unitFactory;
    }
}
