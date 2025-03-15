package com.codewarrior.code4;

import java.util.Scanner;

public class TicketNumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();

        String result = processTicketNumber(str1);

        System.out.println(result);

        scanner.close();
    }

    public static String processTicketNumber(String str1) {
        str1 = str1.replace("EF", "");

        str1 = str1.replace("G", "");
        return str1;
    }
}