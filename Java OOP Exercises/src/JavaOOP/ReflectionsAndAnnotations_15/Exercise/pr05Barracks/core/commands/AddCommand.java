package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.core.commands;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Inject;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.UnitFactory;

public class AddCommand extends CommandImpl {

    @Inject
    private Repository repository;
    @Inject
    private UnitFactory unitFactory;

    protected AddCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        this.repository.addUnit(
            this.unitFactory.createUnit(this.getData()[1])
        );

        return this.getData()[1] + " added!";
    }
}
