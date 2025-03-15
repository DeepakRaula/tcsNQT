
Mike came up with a new way of sorting a string. What he does is he takes all the unique alphabets from the string and sorts it in that order. Let say there is a string "apple", now it contains a p l e as distinct alphabets.

He sorts the string apple based on his own keys let say eapl. So, first all "e" will be picked from the string "apple", and then all "a", and so on till "T". Hence the final sorted word becomes "eappl".

The Input format for testing
The candidate has to write the code to accept 2 input(s)
•First Input - Accept value for input string.
•First Input - Accept value for input key.

The Output format for testing

Mike came up with a new way of sorting a string. What he does is he takes all the unique alphabets from the string and sorts it in that order. Let say there is a string "apple", now it contains a p l e as distinct alphabets.

He sorts the string apple based on his own keys let say eapl. So, first all "e" will be picked from the string "apple", and then all "a", and so on till "T". Hence the final sorted word becomes "eappl".

The Input format for testing
The candidate has to write the code to accept 2 input(s)
•First Input - Accept value for input string.
•First Input - Accept value for input key.

The Output format for testing

•The output should be a sorted string based on the input key given by the user as mentioned in the above criteria. (Check the output in Example 1, Example 2)

•Additional messages in output will cause the failure of test cases.

Constraints:
0<length(input String)<=50
Input key should contain all the alphabets of input strings
No duplicates in input keys.

Example 1:
Input:
apple->Input string
eapl -> Input string, sorting key value


Output:
eappl->output string with sorted value based on the user keys.

Explanation:
The input by the user is "apple” and the key is "eapl". So, as per the key, all "e" has to be sorted first. Then all the a's and the all the p's, and finally all the l’s .Note that here we have 2 p's so they will be sorted together in the output. Putting everything together the final string comes as “eappl”

Example 2:

Input:
welcome ->input string
lowmec -> input key value

Output:

lowmeec ->output string with sorted value based on the user keys.

Explanation:

The input by the user is “welcome” and the key is “lowmec". So, as per the key, all l’s has to be sorted first,then all the o's and then all the w's and then all the m's ,the all the e's, and finally all the c’s .Note that here we have 2 e's so they will be sorted together in the output. Putting everything together the final string comes as “lowmeec”
