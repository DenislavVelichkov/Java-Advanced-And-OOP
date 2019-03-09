package JavaOOP.Encapsulation_5.Exercise.FootballTeamGenerator_6;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private double rating() {
        return Math.round(this.players
                .stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0) / this.players.size());
    }

    public double getRating() {
        return this.rating();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new InvalidParameterException(
                    "A name should not be empty."
            );
        }

        this.name = name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        this.players
                .stream()
                .filter(player -> player.getName().equals(playerName))
                .findAny()
                .ifPresentOrElse(
                        player -> this.players.remove(player),
                        () -> {
                            throw new InvalidParameterException(
                                    String.format("Player %s is not in %s team.",
                                            playerName, this.getName()));
                        });

    }
}
