package JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.application;

import JavaOOP.InterfacesAndAbstraction_9.Exercise.MillitaryElite_6.interfaces.Soldier;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Soldier> soldiers;

    public Army(){
        this.soldiers = new ArrayList<>();
    }

    public void addSoldier(Soldier soldier){
        this.soldiers.add(soldier);
    }

    public List<Soldier> getSoldiers(){
        return this.soldiers;
    }
}
