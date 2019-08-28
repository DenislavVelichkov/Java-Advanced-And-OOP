package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.core.commands;

import jdk.jshell.spi.ExecutionControl;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Inject;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.contracts.Repository;

public class RetireCommand extends CommandImpl {
    @Inject
    private Repository repository;

    protected RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        try {
            this.repository.removeUnit(this.getData()[1]);
            return this.getData()[1] + " retired!";
        } catch (ExecutionControl.NotImplementedException e) {
          return e.getMessage();
        }
    }
}
