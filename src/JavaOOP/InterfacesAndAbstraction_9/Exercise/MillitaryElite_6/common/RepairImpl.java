package JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.common;
import JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.interfaces.Repair;

public class RepairImpl implements Repair {
    private String partName;
    private int hoursWorked;

    public RepairImpl(String partName, int hoursWorked){
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", this.partName, this.hoursWorked);
    }
}
