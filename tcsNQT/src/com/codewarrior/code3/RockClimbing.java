package com.codewarrior.code3;
import java.util.Scanner;

public class RockClimbing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int I = scanner.nextInt();
        int X = scanner.nextInt();
        int ways = countWaysToReachPeak(N, I, X);

        System.out.println(ways);
        scanner.close();
    }

    public static int countWaysToReachPeak(int N, int I, int X) {
        if (I == N) {
            return 1;
        }
        if (I > N) {
            return 0;
        }

        int ways = 0;

        for (int step = 1; step <= X; step++) {
            ways += countWaysToReachPeak(N, I + step, X);
        }
        return ways;
    }
}