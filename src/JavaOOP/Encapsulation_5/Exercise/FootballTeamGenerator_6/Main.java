package JavaOOP.Encapsulation_5.Exercise.FootballTeamGenerator_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Team> teams = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(";");

        while (!input[0].equals("END")) {
            try {
                inputParser(input, teams);
            } catch (InvalidParameterException e) {
                System.out.println(e.getMessage());
            }

            input = reader.readLine().split(";");
        }
    }

    private static void inputParser(String[] input, List<Team> teams) {
        String teamName = input[1];
        int teamIndex;


        switch (input[0]) {

            case "Team":
                createATeam(input, teams);
                break;

            case "Add":

                try {
                    createAPlayer(input, teamName);
                } catch (InvalidParameterException e) {
                    System.out.println(e.getMessage());
                }

                break;

            case "Remove":
                teamIndex = getTeamIndex(teams, teamName);

                try {
                    teams.get(teamIndex).removePlayer(input[2]);
                } catch (InvalidParameterException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case "Rating":
                teamName = input[1];
                teamIndex = getTeamIndex(teams, teamName);
                double ratingToBeFormatted;

                try {
                    ratingToBeFormatted = teams.get(teamIndex).getRating();
                } catch (IndexOutOfBoundsException e) {
                    System.out.printf("Team %s does not exist.", teamName);
                    break;
                }

                if (String.valueOf(ratingToBeFormatted).equals("NaN")) {
                    ratingToBeFormatted = 0;
                }

                System.out.println(String.format("%s - %.0f",
                        teamName, Math.ceil(ratingToBeFormatted)));

                break;

            default:
                break;
        }
    }

    private static int getTeamIndex(List<Team> teams, String teamName) {
        int index = -1;

        for (Team team : teams) {
            if (team.getName().equals(teamName)) {
                index = teams.indexOf(team);
            }
        }

        return index;
    }

    private static void createAPlayer(String[] input, String teamName) {
        int index = getTeamIndex(teams, teamName);


        if (index == -1) {
            throw new InvalidParameterException(
                    String.format("Team %s does not exist.", teamName)
            );
        }

        try {
            Player player = new Player(input[2],
                    Integer.parseInt(input[3]),
                    Integer.parseInt(input[4]),
                    Integer.parseInt(input[5]),
                    Integer.parseInt(input[6]),
                    Integer.parseInt(input[7])
            );
            teams.get(index).addPlayer(player);

        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void createATeam(String[] input, List<Team> teams) {
        for (int i = 1; i < input.length; i++) {
            try {
                Team team = new Team(input[i]);
                teams.add(team);

            } catch (InvalidParameterException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
