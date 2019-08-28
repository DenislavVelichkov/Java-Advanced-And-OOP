package JavaAdvanced.StacksAndQueues_3.Exercise;

import java.util.Scanner;

public class RecursiveFibonacci_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long[] fibMemory = new long[n + 1];

        long fibResult = calculateFibonacci(n, fibMemory);
        System.out.println(fibResult);
    }

    private static long calculateFibonacci(int n, long[] memory) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memory[n] != 0) { //memorization
            return memory[n];
        }

        long prev = calculateFibonacci(n - 1, memory);
        long prevPrev = calculateFibonacci(n - 2, memory);
        long result = prev + prevPrev;
        memory[n] = result;
        return result;
    }
}