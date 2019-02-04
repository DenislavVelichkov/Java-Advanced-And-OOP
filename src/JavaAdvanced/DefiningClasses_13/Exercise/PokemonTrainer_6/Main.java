package JavaAdvanced.DefiningClasses_13.Exercise.PokemonTrainer_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        ArrayList<Object> trainers = new ArrayList<>();

        while (!line.equals("Tournament")) {
            String[] data = line.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName);

            if (!trainerName.equals(trainer.getName())) {
                trainer.getPokemonCollection().add(pokemon);
                trainers.add(trainer);
            } else {
                break;
            }

            line = reader.readLine();
        }

        line = reader.readLine();

        while (!line.equals("End")) {
            String element = line;

            if () {
                // TODO: check for atleast 1 Pokemon with given el
                // gains 1 badge
            } else {
                // all his pokemons lose health
                //if a pokemon drops below 0, he get removed from the list
            }



            line = reader.readLine();
        }

        //print all trainers sorted by their badges DECSEnding
        //if they have eq num of badges, they are sorted
        //by appearance in the input;
        //<TrainerName> <Badges> <NumberOfPokemon>
    }
}
