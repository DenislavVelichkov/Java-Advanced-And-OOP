package JavaOOP.WorkingWithAbstractions_3.Exercise.JediGaalaxy_5;

public class StarsManipulator {
    private Galaxy galaxy;

    public StarsManipulator(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public void destroyStars(int[] enemyPosition) {
        int enemyRow = enemyPosition[0];
        int enemyCol = enemyPosition[1];

        while (enemyRow >= 0 && enemyCol >=0) {
            if (isInRange(enemyRow, enemyCol)) {
                this.galaxy.setStars(enemyRow, enemyCol, new Star(0));
            }
            enemyRow--;
            enemyCol--;
        }
    }

    private boolean isInRange(int row, int col) {
        return row >= 0
                && row < this.galaxy.getRows()
                && col >= 0
                && col < this.galaxy.getColumns(0);
    }

    public long sumOfStars(int[] playerPosition) {
        int row = playerPosition[0];
        int col = playerPosition[1];
        long sum = 0;

        while (row >= 0 && col < this.galaxy.getColumns(0)) {
            if (isInRange(row, col)) {
                sum += this.galaxy.getStarValue(row, col);
            }
            row--;
            col++;
        }
        return sum;
    }
}
