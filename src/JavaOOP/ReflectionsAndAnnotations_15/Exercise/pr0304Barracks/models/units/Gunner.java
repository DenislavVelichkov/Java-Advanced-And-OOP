package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.models.units;

import pr0304Barracks.models.units.AbstractUnit;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    protected Gunner() {
        super(Gunner.GUNNER_HEALTH, Gunner.GUNNER_DAMAGE);
    }
}
