A safety and security services agency communicates to its employees only in secret messages in case of emergency. The employee sends the message with a secret code(key). Here, the code will be same combination of characters in both the messages(strings) sent. The task is to find the combination of letters(key) that is present both the strings.
Input format for testing:
The candidate has to write the code to accept 2 inputs.
First Input- Accept a string value consisting of only literal characters.
Second Input-Accept a string value consisting of only characters.
Output format for testing:
The output should be string of characters which is same in both the input strings (check the output in Example 1 and 2)
The output should be generated in alphabetic order sequence.
Additional message in output cause the failure of test cases.



Constraints:
Str 1= {a-z}
Str 2= {a-z}
0<size of str 1 <20
0< size of str 2 <20
Example1:
Input:
beads -> value for str1
leaps → value for str2
Output:
aes -> the key ‘aes’ is present in both strings

Example2:
Input:
abcdefgh -> value for str1
abcdxyz → value for str2
Output:
abcd –> key ‘abcd’ is present in both the strings
