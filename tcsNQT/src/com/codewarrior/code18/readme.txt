A single currency note(N) and a coin(R) are given. The task is to find in how many ways can make the value that is equal to the currency note using the coin.The coin can be used in the following ways:
The value of the coin represents the maximum range values(1,R) that can be used to make the sum equal to N. Each integer value up to the range R can be used multiple times to make the sum.
Constraints:
 1< =N<=100
 1<=R <=100
The Input format for testing
•The candidate has to write the code to accept 2 input(s)
•First Input - Accept value for input N.
•Second Input - Accept value for input R.

The Output format for testing
•The output should be a value which is Maximum combinations using values up to R to get the sum equal to N. (Check the output in Example 1, Example 2)
Example 1:
Input:
8 -> Value of N
2 -> Value of R
Output:
5→Maximum combinations using values up to R to get the sum equal to N

Explanation:
The various combinations the currency note N=8 can be formed using the values upto range 2 are:
1+1+1+1+1+1+1+1=8
2+1+1+1+1+1+1=8
2+2+1+1+1+1=8
2+2+2+1+1=8
2+2+2+2=8
Hence there are 5 ways the coin with range up to 2 can be used to get the value of currency note i.e 8

Example 2:
Input:
2 -> Value of N
2-> Value of R
Output:
2→Maximum combinations using values up to R to get the sum equal to N
Explanation:
The various combinations the currency note N=2 can be formed using the values upto range 2 are:
R={1,2}
1+1=2
Hence there are 2 ways the coin with range up to 2 can be used to get the value of currency note i.e 2
