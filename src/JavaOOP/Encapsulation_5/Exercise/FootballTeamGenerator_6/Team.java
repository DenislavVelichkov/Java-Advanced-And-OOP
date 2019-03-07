
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private double teamRating;

    public Team(String name) {
        this.players = new ArrayList<>();
        this.teamRating = 0d;
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
        double result = this.rating();

        if (!Character.isDigit(String.valueOf(result).charAt(0))) {
            result = 0d;
        }

        return this.teamRating = result;
    }

    public String getName() {
        return this.name;
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    private void setName(String name) {
        if (name.isEmpty() || name.contains(" ")) {
            throw new IllegalArgumentException(
                    "A name should not be empty."
            );
        }

        this.name = name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        if (this.players
                .stream()
                .anyMatch(player -> player.getName().equals(playerName))) {

            for (Player player : this.players) {
                if (player.getName().equals(playerName)) {
                    this.players.remove(player);
                    break;
                }
            }

        } else {
            throw new IllegalArgumentException(
                    String.format("Player %s is not in %s team.",
                            playerName, this.getName())
            );
        }
    }
}
