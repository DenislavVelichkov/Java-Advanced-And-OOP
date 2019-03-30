package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.core.commands;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.UnitFactory;

public class FightCommand extends CommandImpl {

    protected FightCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
