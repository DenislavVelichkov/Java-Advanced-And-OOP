package JavaOOP.ReflectionsAndAnnotations_15.Exercise.pr05Barracks.models.units;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    protected Gunner() {
        super(Gunner.GUNNER_HEALTH, Gunner.GUNNER_DAMAGE);
    }
}
