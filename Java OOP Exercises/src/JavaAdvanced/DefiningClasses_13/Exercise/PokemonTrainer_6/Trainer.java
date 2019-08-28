package JavaAdvanced.DefiningClasses_13.Exercise.PokemonTrainer_6;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private ArrayList<Pokemon> pokemonList;

    private Trainer() {
        this.pokemonList = new ArrayList<>();
        this.numberOfBadges = 0;
    }

    Trainer(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getBadgesCount() {
        return this.numberOfBadges;
    }

    public ArrayList<Pokemon> getPokemonCollection() {
        return this.pokemonList;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public void addBadge() {
        this.numberOfBadges += 1;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.numberOfBadges, this.pokemonList.size());
    }
}
