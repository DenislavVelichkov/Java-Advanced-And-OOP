package JavaAdvanced.DefiningClasses_13.Exercise.PokemonTrainer_6;

class Pokemon {
    private String name;
    private String element;
    private int health;

    Pokemon(String pokemonName, int health) {
        this.name = pokemonName;
        this.health = health;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
