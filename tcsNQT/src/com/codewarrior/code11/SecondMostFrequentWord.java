package com.codewarrior.code11;
import java.util.*;
import java.util.Scanner;

public class SecondMostFrequentWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        TreeSet<Map.Entry<String, Integer>> treeSet = new TreeSet<>(
                (a, b) -> {
                    int freqCompare = b.getValue().compareTo(a.getValue()); // Sort by frequency (descending)
                    if (freqCompare == 0) {
                        return a.getKey().compareTo(b.getKey()); // If frequencies are equal, sort by word (ascending)
                    }
                    return freqCompare;
                }
        );
        treeSet.addAll(frequencyMap.entrySet());


        if (treeSet.size() >= 2) {
            treeSet.pollFirst();
            String secondMostFrequentWord = treeSet.pollFirst().getKey();
            System.out.println(secondMostFrequentWord);
        } else {
            System.out.println("");
        }
    }
}