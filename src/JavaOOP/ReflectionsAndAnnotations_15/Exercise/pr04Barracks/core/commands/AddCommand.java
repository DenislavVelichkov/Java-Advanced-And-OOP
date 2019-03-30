package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.core.commands;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.UnitFactory;

public class AddCommand extends CommandImpl {

    protected AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        this.getRepository().addUnit(
            this.getUnitFactory().createUnit(this.getData()[1])
        );

        return this.getData()[1] + " added!";
    }
}
