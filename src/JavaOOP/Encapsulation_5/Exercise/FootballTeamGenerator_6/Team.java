package JavaOOP.Encapsulation_5.Exercise.FootballTeamGenerator_6;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.players = new ArrayList<>();
        this.setName(name);
    }

    private double rating() {
        double sumOfOverallSkillLevel = 0d;

        for (Player player : this.players) {
            sumOfOverallSkillLevel += player.overallSkillLevel();
        }

        return sumOfOverallSkillLevel / this.players.size();
    }

    public double getRating() {
        return this.rating();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.contains(" ") || name.isEmpty()) {
            throw new InvalidParameterException(
                    "A name should not be empty."
            );
        }

        this.name = name;
    }

    public void addPlayer(Player player) {
       boolean isPresent = this.players
                .stream()
                .anyMatch(players -> players.getName().equals(player.getName()));

        if (!isPresent) {
            this.players.add(player);
        }

    }

    public void removePlayer(String playerName) {
        this.players
                .stream()
                .filter(player -> player.getName().equals(playerName))
                .findAny()
                .ifPresentOrElse(
                        player -> this.players.remove(player),
                        () -> { throw new InvalidParameterException(
                                String.format("Player %s is not in %s team.",
                                        playerName, this.getName()));
                        });

    }
}
