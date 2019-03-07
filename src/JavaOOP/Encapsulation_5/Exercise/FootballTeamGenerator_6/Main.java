
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  private static Map<String, Integer> teamIndexes = new LinkedHashMap<>();
  private static List<Team> teams = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> input =
                Arrays.stream(reader.readLine().split(";"))
                        .collect(Collectors.toCollection(ArrayList::new));


        int index = 0;


        while (!input.get(0).equals("END")) {
            try {
                inputParser(input, teamIndexes, teams, index, input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            input = Arrays.stream(reader.readLine().split(";"))
                            .collect(Collectors.toCollection(ArrayList::new));
        }
    }

    private static void inputParser(ArrayList<String> input, Map<String, Integer> teamIndexes, List<Team> teams, int index, ArrayList<String> inputPlayers) {
        String teamName = input.get(1);
        int getTeamIndex = 0;

        if (validateTeamName(teamName)) {

            switch (inputPlayers.get(0)) {

                case "Team":
                    createATeam(input, teamIndexes, teams, index);
                    break;

                case "Add":

                    try {
                        createAPlayer(input, teamName);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case "Remove":
                    getTeamIndex = teamIndexes.get(teamName);

                    try {
                        teams.get(getTeamIndex).removePlayer(input.get(2));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "Rating":
                    teamName = input.get(1);
                    getTeamIndex = teamIndexes.get(teamName);
                    double ratingToBeFormatted = teams.get(getTeamIndex).getRating();

                    System.out.println(String.format("%s - %.0f",
                            teamName, Math.ceil(ratingToBeFormatted)));

                    break;

                default:
                    break;
            }
        } else {
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }

    private static boolean validateTeamName(String teamName) {
        boolean isValid;
        if (teamName.contains(" ") || teamName.isEmpty()) {
            isValid = false;
        } else {
            isValid = true;
        }

        return isValid;
    }

    private static void createAPlayer(ArrayList<String> input, String teamName) {
        int index = teamIndexes.get(teamName);

        if (!teamIndexes.containsKey(teamName)) {
            throw new IllegalArgumentException(
                    String.format("Team %s does not exist.", teamName)
            );
        }

        try {
            Player player = new Player(input.get(2),
                    Integer.parseInt(input.get(3)),
                    Integer.parseInt(input.get(4)),
                    Integer.parseInt(input.get(5)),
                    Integer.parseInt(input.get(6)),
                    Integer.parseInt(input.get(7))
            );
            teams.get(index).addPlayer(player);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void createATeam(ArrayList<String> input, Map<String, Integer> teamIndexes, List<Team> teams, int index) {
        while (true) {
            if (input.size() == 1) {
                break;
            }

            try {
                Team team = new Team(input.get(1));
                if (!teamIndexes.containsKey(team.getName())) {
                    teamIndexes.put(input.get(1), index++);
                    teams.add(team);
                    input.remove(1);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


        }
    }
}
