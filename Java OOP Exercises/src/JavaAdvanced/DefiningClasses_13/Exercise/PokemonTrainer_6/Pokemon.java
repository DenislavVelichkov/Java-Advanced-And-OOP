package JavaAdvanced.DefiningClasses_13.Exercise.PokemonTrainer_6;

class Pokemon {
    private String name;
    private String element;
    private int health;

    Pokemon(String pokemonName, String pokemonElement, int health) {
        this.name = pokemonName;
        this.element = pokemonElement;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public String getElement() {
        return this.element;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health += health;
    }
}
