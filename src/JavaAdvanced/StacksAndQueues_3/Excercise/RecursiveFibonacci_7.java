package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.util.Scanner;

public class RecursiveFibonacci_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long[] fibMemory = new long[n + 1];

        long fibResult = calculateFibonacci(n, fibMemory);
        System.out.println(fibResult);
    }

    private static long calculateFibonacci(int n, long[] memmory) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memmory[n] != 0) { //memorization
            return memmory[n];
        }

        long prev = calculateFibonacci(n - 1, memmory);
        long prevPrev = calculateFibonacci(n - 2, memmory);
        long result = prev + prevPrev;
        memmory[n] = result;
        return result;
    }
}