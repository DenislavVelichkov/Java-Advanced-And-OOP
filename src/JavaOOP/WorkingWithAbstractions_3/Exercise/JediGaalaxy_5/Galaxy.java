package JavaOOP.WorkingWithAbstractions_3.Exercise.JediGaalaxy_5;

public class Galaxy {
    private Star[][] stars;

    public Galaxy(int rows, int cols) {
        this.stars = new Star[rows][cols];
        this.fillStars();
    }

    public int getRows() {
        return this.stars.length;
    }

    public int getColumns(int row) {
        return this.stars[row].length;
    }

    private void fillStars() {
        int starValue = 0;

        for (int row = 0; row < this.stars.length; row++) {
            for (int col = 0; col < this.stars[row].length; col++) {
                this.stars[row][col] = new Star(starValue++);
            }
        }
    }

    public void setStars(int row, int col, Star star) {
        if (isInRange(row, col)) {
            this.stars[row][col] = star;
        }
    }

    private boolean isInRange(int row, int col) {

        return row >= 0
                && row < this.stars.length
                && col >= 0
                && col < this.stars[row].length;
    }

    public int getStarValue(int row, int col) {
        if (isInRange(row, col)) {
           return this.stars[row][col].getValue();
        }

        return 0;
    }
}
