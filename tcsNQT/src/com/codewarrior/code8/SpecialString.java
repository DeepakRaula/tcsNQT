package com.codewarrior.code8;
import java.util.Scanner;

public class SpecialString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        int specialCount = 0;
        for (int i = 0; i < T; i++) {
            String s = scanner.nextLine();
            if (isSpecial(s)) {
                specialCount++;
            }
        }
        System.out.println(specialCount);
        scanner.close();
    }

    public static boolean isSpecial(String s) {
        int n = s.length();
        if (s.charAt(0) != 'a' || s.charAt(n - 1) != 'b') {
            return false;
        }
        int splitPoint = -1;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
                splitPoint = i;
                break;
            }
        }
        if (splitPoint == -1) {
            return false;
        }
        for (int i = 0; i <= splitPoint; i++) {
            if (s.charAt(i) != 'a') {
                return false;
            }
        }
        for (int i = splitPoint + 1; i < n; i++) {
            if (s.charAt(i) != 'b') {
                return false;
            }
        }
        return true;
    }
}