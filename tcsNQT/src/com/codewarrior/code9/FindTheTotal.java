package com.codewarrior.code9;
import java.util.ArrayList;
import java.util.Scanner;

public class FindTheTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(scanner.nextInt());
        }
        int total = 0;

        while (!arr.isEmpty()) {
            int minIndex = 0;
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) < arr.get(minIndex)) {
                    minIndex = i;
                }
            }

            total += arr.get(minIndex);
            int left = minIndex - 1;
            int right = minIndex + 1;

            if (left < 0) {
                left = minIndex;
            }
            if (right >= arr.size()) {
                right = minIndex;
            }
            for (int i = right; i >= left; i--) {
                arr.remove(i);
            }
        }

        System.out.println(total);
        scanner.close();
    }
}