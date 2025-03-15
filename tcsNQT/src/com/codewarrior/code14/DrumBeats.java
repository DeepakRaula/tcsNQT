package com.codewarrior.code14;
import java.util.Arrays;
import java.util.Scanner;

public class DrumBeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] board = new int[N];
        for (int i = 0; i < N; i++) {
            board[i] = scanner.nextInt();
        }
        int[] students = new int[N];
        for (int i = 0; i < N; i++) {
            students[i] = i + 1;
        }
        int[] originalStudents = Arrays.copyOf(students, N);

        int beats = 0;

        do {
            int[] newStudents = new int[N];

            for (int i = 0; i < N; i++) {
                newStudents[i] = students[board[i] - 1];
            }
            students = newStudents;
            beats++;

        } while (!Arrays.equals(students, originalStudents));
        System.out.println(beats);
    }
}