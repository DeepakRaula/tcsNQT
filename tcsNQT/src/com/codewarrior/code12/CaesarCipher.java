package com.codewarrior.code12;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plaintext = scanner.nextLine();
        int key = scanner.nextInt();
        String encryptedText = encryptCaesarCipher(plaintext, key);
        System.out.println(encryptedText);
    }

    public static String encryptCaesarCipher(String plaintext, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : plaintext.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shiftedChar = (char) (base + (ch - base + key) % 26);
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }
}