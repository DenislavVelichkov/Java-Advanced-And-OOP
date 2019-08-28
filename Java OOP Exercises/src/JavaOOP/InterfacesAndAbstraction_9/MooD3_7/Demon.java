package JavaOOP.InterfacesAndAbstraction_9.MooD3_7;

public class Demon extends Character<Integer> {
    private static final String CHARACTER_TYPE = "Demon";
    Demon(String username, int level, Double specialPoints) {
        super(username, CHARACTER_TYPE, level, specialPoints);
    }

    @Override
    public Integer getHashedPassword() {
        return this.getUsername().length() * 217;
    }

    @Override
    String getSpecialPointsByLevel() {
        return String.format("%.1f",
                this.getSpecialPoints().doubleValue() * this.getLevel());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
