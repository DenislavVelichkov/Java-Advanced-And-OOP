package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.core.commands;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Inject;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Repository;

public class ReportCommand extends CommandImpl {
    @Inject
    private Repository repository;

    protected ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }
}
