package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.models.units;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.models.units.AbstractUnit;

public class Swordsman extends AbstractUnit {
    private static final int SWORDSMAN_HEALTH = 40;
    private static final int SWORDSMAN_DAMAGE = 13;

    public Swordsman() {
        super(SWORDSMAN_HEALTH, SWORDSMAN_DAMAGE);
    }
}
