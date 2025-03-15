Q.11)
You are given a string consisting of multiple words separated by spaces. Your task is to find and print the second most frequent word in the string. If there is no second most frequent word, print an empty string.
Input Format:
A single line containing space-separated words.
Output Format:
Print the second most frequent word in the given string.
If no second most frequent word exists, print an empty string.
Constraints:
The string contains only lowercase English letters and spaces.
The length of the string will be at most 10⁵ characters.
Each word will have at most 100 characters.
Example 1:
Input: “apple banana apple orange banana banana”
Output: apple
Explanation:
Frequency of words: apple → 2, banana → 3, orange → 1
The most frequent word is "banana" (3 times).
The second most frequent word is "apple" (2 times).
Example 2:
Input: “cat dog elephant dog cat dog tiger”
Output: cat

Explanation:
Word frequencies: cat → 2, dog → 3, elephant → 1, tiger → 1
Most frequent word: "dog" (3 times).
Second most frequent word: "cat" (2 times).
