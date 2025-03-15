package com.codewarrior.code7;
import java.util.Scanner;

public class ReduceToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int operations = 0;
        while (N > 1) {
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N -= 1;
            }
            operations++;
        }
        System.out.println(operations);
        scanner.close();
    }
}