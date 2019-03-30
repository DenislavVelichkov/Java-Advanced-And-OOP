package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.core.commands;

import jdk.jshell.spi.ExecutionControl;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.Repository;
import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.contracts.UnitFactory;

public class RetireCommand extends CommandImpl {
    protected RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        try {
            this.getRepository().removeUnit(this.getData()[1]);
            return this.getData()[1] + " retired!";
        } catch (ExecutionControl.NotImplementedException e) {
          return e.getMessage();
        }
    }
}
