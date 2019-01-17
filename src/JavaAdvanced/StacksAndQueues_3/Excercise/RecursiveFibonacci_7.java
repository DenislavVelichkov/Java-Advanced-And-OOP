package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.util.Scanner;

public class RecursiveFibonacci_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long[] fibList = new long[n + 1];

        long fibResult = calculateFibonacci(n, fibList);
        System.out.println(fibResult);
    }

    private static long calculateFibonacci(int n, long[] fibonacci) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (fibonacci[n] != 0) {
            return fibonacci[n];
        }

        long prev = calculateFibonacci(n - 1, fibonacci);
        long prevPrev = calculateFibonacci(n - 2, fibonacci);
        long result = prev + prevPrev;
        fibonacci[n] = result;
        return result;
    }
}