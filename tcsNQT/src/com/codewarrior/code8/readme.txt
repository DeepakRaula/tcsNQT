Q.8)

Special String
Problem Statement
A string is called special if it can be written as the concatenation of two non-empty strings 's1' and 's2' such that 's1' contains all characters equal to ‘a’ , and 's2 contains all characters equal to b'.
You are provided with T test cases and for each test case, you are provided with string s. Your task is to find and print the number of special strings
Note:
• Each string contains only lowercase characters.
Input Format:
The input is given in the following format:
-> The first line contains T.
-> Each of the T subsequent lines contains string s
Output Format:
Print the number of special strings.
Constraints:
 	1 ≤ T ≤ 100.
 	1 ≤ string length ≤ 5000.

Example:
Input:
4
ab
xyz
aab
axb
Output:
2

Explanation:
For the third test case, we can have s1= "aa" and s2="b". Since the given strings are the concatenation of s1 and s2, where s1 contains all characters as ‘a’, and s2 contains all characters as ‘b’', and both s1 and s2 are non-empty, hence, this is a special string.
A similar explanation can be framed for the first test case as well, and those are the only two special strings in the given list of strings, and hence, the answer is 2.


