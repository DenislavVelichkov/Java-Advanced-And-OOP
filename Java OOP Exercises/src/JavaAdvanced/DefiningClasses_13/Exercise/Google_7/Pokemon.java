package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

public class Pokemon {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.join(" ", this.name, this.type);
    }
}
