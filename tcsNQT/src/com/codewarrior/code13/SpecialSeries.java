package com.codewarrior.code13;
import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int nthTerm = findNthTerm(N);
        System.out.println(nthTerm);
    }

    public static int findNthTerm(int N) {
        if (N % 2 == 1) {
            return (int) Math.pow(2, (double) (N - 1) / 2);
        } else {
            return (int) Math.pow(3, ((double) N / 2) - 1);
        }
    }
}