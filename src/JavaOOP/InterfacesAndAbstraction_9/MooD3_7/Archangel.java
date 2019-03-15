package JavaOOP.InterfacesAndAbstraction_9.MooD3_7;

public class Archangel extends Character<String> {
    private static final String CHARACTER_TYPE = "Archangel";
    Archangel(String username, int level, Integer specialPoints) {
        super(username, CHARACTER_TYPE, level, specialPoints);
    }

    @Override
    public String getHashedPassword() {
        StringBuilder sb = new StringBuilder(this.getUsername());

        return sb
            .reverse()
            .append(this.getUsername().length() * 21)
            .toString();
    }

    @Override
    String getSpecialPointsByLevel() {
        return String.format("%d",
                this.getSpecialPoints().intValue() * this.getLevel());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
