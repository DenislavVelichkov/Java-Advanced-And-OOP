package JavaAdvanced.DefiningClasses_13.Exercise.PokemonTrainer_6;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private ArrayList<Object> pokemons = new ArrayList<>();

    Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBadgesCOunt() {
        return this.numberOfBadges;
    }

    public ArrayList<Object> getPokemonCollection() {
        return this.pokemons;
    }

    public void addPokemon(Object pokemon) {
        addBadge();
        this.pokemons.add(pokemon);
    }

    public void addBadge() {
        this.numberOfBadges += 1;
    }
}
