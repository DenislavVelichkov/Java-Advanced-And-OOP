package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.models.units;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.models.units.AbstractUnit;

public class Archer extends AbstractUnit {
    private static final int ARCHER_HEALTH = 25;
    private static final int ARCHER_DAMAGE = 7;

    public Archer() {
        super(ARCHER_HEALTH, ARCHER_DAMAGE);
    }
}
