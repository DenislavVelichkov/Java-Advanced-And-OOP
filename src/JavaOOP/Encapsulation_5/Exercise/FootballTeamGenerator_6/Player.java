
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

    public int getEndurance() {
        return this.endurance;
    }

    public int getSprint() {
        return this.sprint;
    }

    public int getDribble() {
        return this.dribble;
    }

    public int getPassing() {
        return this.passing;
    }

    public int getShooting() {
        return this.shooting;
    }

    private void setName(String name) {
        if (name.isEmpty() || name.contains(" ")) {
            throw new IllegalArgumentException(
                    "A name should not be empty."
            );
        }

        this.name = name;
    }

    private void setShooting(int shooting) {
        if (shooting < 0 || shooting > 100) {
            throw new IllegalArgumentException(
                    "Shooting should be between 0 and 100."
            );
        }

        this.shooting = shooting;
    }

    private void setPassing(int passing) {
        if (passing < 0 || passing > 100) {
            throw new IllegalArgumentException(
                    "Passing should be between 0 and 100."
            );
        }

        this.passing = passing;
    }

    private void setDribble(int dribble) {
        if (dribble < 0 || dribble > 100) {
            throw new IllegalArgumentException(
                    "Dribble should be between 0 and 100."
            );
        }

        this.dribble = dribble;
    }

    private void setSpring(int sprint) {
        if (sprint < 0 || sprint > 100) {
            throw new IllegalArgumentException(
                    "Sprint should be between 0 and 100."
            );
        }

        this.sprint = sprint;
    }

    private void setEndurance(int endurance) {
        if (endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException(
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
}
