package com.codewarrior.code10;
import java.util.Scanner;

public class MaximumProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L1 = scanner.nextInt();
        int R1 = scanner.nextInt();
        int L2 = scanner.nextInt();
        int R2 = scanner.nextInt();

        int maxProduct = findMaxProduct(L1, R1, L2, R2);

        System.out.println(maxProduct);

        scanner.close();
    }

    public static int findMaxProduct(int L1, int R1, int L2, int R2) {

        int product1 = L1 * L2;
        int product2 = L1 * R2;
        int product3 = R1 * L2;
        int product4 = R1 * R2;

        // Find the maximum product
        int maxProduct = Math.max(Math.max(product1, product2), Math.max(product3, product4));

        return maxProduct;
    }
}