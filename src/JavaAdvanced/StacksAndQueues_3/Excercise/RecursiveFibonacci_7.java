package JavaAdvanced.StacksAndQueues_3.Excercise;

import java.util.Scanner;

public class RecursiveFibonacci_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        long[] fibonaccies = new long[n + 1];

        long fib8 = fibonacci(n, fibonaccies);
        System.out.println(fib8);
    }

    private static long fibonacci(int n, long[] fibonacci) {
        if (n == 0 || n == 1)
            return 1;
        if (fibonacci[n] != 0) {
            return fibonacci[n];
        }

        long prev = fibonacci(n - 1, fibonacci);
        long prevPrev = fibonacci(n - 2, fibonacci);
        long result = prev + prevPrev;
        fibonacci[n] = result;
        return result;
    }
}