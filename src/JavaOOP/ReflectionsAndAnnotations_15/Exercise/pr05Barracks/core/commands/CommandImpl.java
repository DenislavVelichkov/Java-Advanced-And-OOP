package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.core.commands;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Executable;

public abstract class CommandImpl implements Executable {
    private String[] data;

    protected CommandImpl(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return this.data;
    }
}
