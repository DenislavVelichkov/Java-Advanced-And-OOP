package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr0304Barracks.models.units;

import JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr04Barracks.models.units.AbstractUnit;

public class Horseman extends AbstractUnit {
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    protected Horseman() {
        super(Horseman.HORSEMAN_HEALTH, Horseman.HORSEMAN_DAMAGE);
    }
}
