package com.codewarrior.code5;
import java.util.Scanner;

public class TimeTravelCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        scanner.close();

        int currentTotalMinutes = H * 60 + M;

        int timeLeftMinutes = 24 * 60 - currentTotalMinutes;

        int timeLeftHours = timeLeftMinutes / 60;
        int timeLeftMins = timeLeftMinutes % 60;
        System.out.println(timeLeftHours + "::" + timeLeftMins);

    }
}
