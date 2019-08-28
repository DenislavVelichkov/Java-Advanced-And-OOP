package JavaAdvanced.DefiningClasses_13.Exercise.PokemonTrainer_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {

    private static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        ArrayList<Trainer> trainersList = new ArrayList<>();

        BiPredicate<ArrayList<Pokemon>, String> testForUniquePokemon =
                (pokemon, name) -> pokemon.stream().anyMatch(pokemonName -> pokemonName.getName().equals(name));

        BiPredicate<ArrayList<Trainer>, String> testForUniqueTrainer =
                (trainers, name) -> trainers.stream().anyMatch(trainerName -> trainerName.getName().equals(name));

        BiFunction<ArrayList<Trainer>, String, Trainer> getExistingTrainer =
                (trainers, o) -> trainers.stream().filter(trainer -> trainer.getName().equals(o)).findFirst().get();


        while (!line.equals("Tournament")) {
            String[] data = line.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (!testForUniqueTrainer.test(trainersList, trainerName)) {
                trainer.addPokemon(pokemon);
                trainersList.add(trainer);
            } else {
                Trainer tempTrainer = getExistingTrainer.apply(trainersList, trainerName);
                if (!testForUniquePokemon.test(tempTrainer.getPokemonCollection(), pokemonName)) {
                    tempTrainer.addPokemon(pokemon);
                }
            }

            line = reader.readLine();
        }

        line = reader.readLine();

        while (!line.equals("End")) {
            String element = line;

            for (Trainer trainer : trainersList) {
                for (Pokemon pokemon : trainer.getPokemonCollection()) {
                    if (pokemon.getElement().equals(element)) {
                        flag = true;
                        trainer.addBadge();
                        break;
                    }
                }

                if (!flag) {
                    try {
                        trainer.getPokemonCollection().forEach(pokemon -> {
                            pokemon.setHealth(-10);
                            if (pokemon.getHealth() <= 0) {
                                trainer.getPokemonCollection().remove(pokemon);
                            }
                        });
                    } catch (ConcurrentModificationException e) {
                    }
                }

                flag = false;
            }

            line = reader.readLine();
        }

        trainersList
                .stream()
                .sorted((o1, o2) -> {
                    int result = Integer.compare(o2.getBadgesCount(), o1.getBadgesCount());
                    return result != 0 ? result : Integer.compare(trainersList.indexOf(o1), trainersList.indexOf(o2));
                })
                .forEach(trainer -> System.out.printf("%s%n", trainer.toString()));
    }
}
