package com.codewarrior.code17;
import java.util.Scanner;

public class LastNonZeroDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = lastNonZeroDigit(N);

        System.out.println(result);
    }

    public static int lastNonZeroDigit(int N) {
        int lastDigit = 1;
        int countOfTwos = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;
            while (num % 5 == 0) {
                num /= 5;
                countOfTwos++;
            }
            while (num % 2 == 0) {
                num /= 2;
                countOfTwos--;
            }

            lastDigit = (lastDigit * num) % 10;
        }

        for (int i = 0; i < countOfTwos; i++) {
            lastDigit = (lastDigit * 2) % 10;
        }

        return lastDigit;
    }
}