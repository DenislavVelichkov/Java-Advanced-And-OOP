package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.core.commands;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.UnitFactory;

public class ReportCommand extends CommandImpl{


    protected ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return this.getRepository().getStatistics();
    }
}
