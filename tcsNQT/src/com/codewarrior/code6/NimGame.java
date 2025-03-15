package com.codewarrior.code6;

import java.util.Scanner;

public class NimGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();

        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = scanner.nextInt();
        }

        int xorSum = 0;
        for (int pile : piles) {
            xorSum ^= pile;
        }

        if (xorSum != 0) {
            System.out.println(t == 1 ? 1 : 2);
        } else {
            System.out.println(t == 1 ? 2 : 1);
        }

        scanner.close();
    }
}