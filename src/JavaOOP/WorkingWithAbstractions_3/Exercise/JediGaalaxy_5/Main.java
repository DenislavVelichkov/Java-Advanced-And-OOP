package JavaOOP.WorkingWithAbstractions_3.Exercise.JediGaalaxy_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] dimensions = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Galaxy galaxy = new Galaxy(dimensions[0], dimensions[1]);
        StarsManipulator starsManipulator = new StarsManipulator(galaxy);

        String line = reader.readLine();
        long sum = 0;

        while (!line.equalsIgnoreCase("Let the Force be with you")) {
            int[] playerPosition = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            line = reader.readLine();

            int[] enemyPosition = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();

            starsManipulator.destroyStars(enemyPosition);
            sum += starsManipulator.sumOfStars(playerPosition);
            line = reader.readLine();
        }

        System.out.println(sum);
    }
}
