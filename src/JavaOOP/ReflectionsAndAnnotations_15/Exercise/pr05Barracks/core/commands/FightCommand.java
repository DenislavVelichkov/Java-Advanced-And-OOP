package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.core.commands;

public class FightCommand extends CommandImpl {

    protected FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
