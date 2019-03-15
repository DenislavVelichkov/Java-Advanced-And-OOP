package JavaOOP.InterfacesAndAbstraction_9.MooD3_7;

public abstract class Character<T> implements GameObject<T> {
    private String username;
    private String characterType;
    private Number specialPoints;
    private Integer level;
    private T hashedPassword;

    Character() {}

    public Character(String username, String characterType, int level, Number specialPoints) {
        this.username = "\"" + username + "\"";
        this.characterType = characterType;
        this.specialPoints = specialPoints;
        this.level = level;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getCharacterType() {
        return this.characterType;
    }

    @Override
    public Number getSpecialPoints() {
        return this.specialPoints;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setHashedPassword(T password) {
        this.hashedPassword = password;
    }

    abstract String getSpecialPointsByLevel();

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n%s",
                this.getUsername(),
                this.getHashedPassword(),
                this.getCharacterType(),
                this.getSpecialPointsByLevel());
    }
}
