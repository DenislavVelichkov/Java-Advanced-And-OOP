package JavaOOP.Encapsulation_5.Exercise.FootballTeamGenerator_6;

import java.security.InvalidParameterException;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSpring(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty() || name.contains(" ")) {
            throw new InvalidParameterException(
                    "A name should not be empty."
            );
        }

        this.name = name;
    }

    private void setShooting(int shooting) {
        if (validateStats(shooting)) {
            throw new InvalidParameterException(
                    "Shooting should be between 0 and 100."
            );
        }

        this.shooting = shooting;
    }

    private void setPassing(int passing) {
        if (validateStats(passing)) {
            throw new InvalidParameterException(
                    "Passing should be between 0 and 100."
            );
        }

        this.passing = passing;
    }

    private void setDribble(int dribble) {
        if (validateStats(dribble)) {
            throw new InvalidParameterException(
                    "Dribble should be between 0 and 100."
            );
        }

        this.dribble = dribble;
    }

    private void setSpring(int sprint) {
        if (validateStats(sprint)) {
            throw new InvalidParameterException(
                    "Sprint should be between 0 and 100."
            );
        }

        this.sprint = sprint;
    }

    private void setEndurance(int endurance) {
        if (validateStats(endurance)) {
            throw new InvalidParameterException(
                    "Endurance should be between 0 and 100."
            );
        }

        this.endurance = endurance;
    }

    public double overallSkillLevel() {
        double sumOfStats = this.dribble
                + this.endurance
                + this.sprint
                + this.passing
                + this.shooting;

        return sumOfStats / 5;
    }

    private boolean validateStats(int stat) {
        return stat < 0 || stat > 100;
    }
}
