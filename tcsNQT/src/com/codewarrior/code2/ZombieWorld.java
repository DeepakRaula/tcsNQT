package com.codewarrior.code2;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieWorld {
    public static boolean WillBobWin(int B, int N, int[] Zi){
        Arrays.sort(Zi);
        boolean canWin = true;
        for (int i = 0; i < N; i++) {
            if (B >= Zi[i]) {
                B -= (Zi[i] % 2) + (Zi[i] / 2);
            } else {
                canWin = false;
                break;
            }
        }

        return canWin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int N = scanner.nextInt();

        int[] Zi = new int[N];
        for (int i = 0; i < N; i++) {
            Zi[i] = scanner.nextInt();
        }

        Arrays.sort(Zi);

        boolean WinOrLoose =  WillBobWin(B,N,Zi);

        if (WinOrLoose){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        scanner.close();
    }
}