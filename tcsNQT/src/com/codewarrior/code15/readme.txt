Joe is playing a game where there are N group of balloons. He is given a gun which can shoot one round per minute.
For each round it can hit 1 balloon in K groups each.If the group has zero balloons left, then we say that particular group is destroyed completely, and it would not be counted. The gun is deactivated if the number of groups falls below K.
Find the maximum number of minutes the gun will be activated based on the above factors.
Let us try to understand it with an example.
Let say there are N groups N=5 and K = 3 means if there are less than 3 groups the gun will be de-activated. In order to stay in the game for longer time, he will play optimally. Also note that the K group may be formed arbitrary selecting K members from N groups.
Each of the 5 groups has below number of balloons :
B = [4,3,5,6,7]


So, in the beginning this is the configuration of all groups with their respective balloons: 4 3 5 6 7
Below the timeline:
Minute 1: the gun takes 1 shot, and it will hit 1 balloon in k=3 groups, now the configuration of each group will be: 4 3 4 5 6
Minute 2: the gun takes 1 shot, and it will hit 1 balloon in K =3 group, now the configuration of each group will be: 4 3 3 4 5
Minute 3: the gun takes 1 shot a -3 group, now the configuration of each group will be 4 3 2 3 4
Minute 4: the gun takes 1 shot, and it will hit 1 balloon in K =3 group, now the configuration of each group will be: 3 3 2 2 3
Minute 5:the gun takes 1 shot, and it will hit 1 balloon in K =3 group, the configuration of each group will be: 3 3 1 1 2.
Minute 6: the gun takes 1 shot, and it will hit 1 balloon in K =3 group, now the configuration of each group will be: 2 2 1 1 1

Minute 7: the gun takes 1 shot, and it will hit 1 balloon in K=3 group, now the configuration of each group will be 1 1 0 1 1
Minute 8: the gun takes 1 shot, and it will hit 1 balloon in K =3 group, now the configuration of each group will be:0 0 0 0 1
Now there are less than K-3 groups, other have lost all their balloons. And the maximum time Joe was busy was 8 minutes.

So, the final answer is 8

The input format for testing:
First Input-Accept value of Integer, N
Second Input -Accept value of Integer, K (Next Line)
Next 'N' Lines-Elements of sequence B

The Output format for testing:

The output is an integer value as per above logic (Check the output in Example 1, Example 2)
Additional messages in output will cause the failure of test cases.

Constraints:
1<= N<=1000
1 <= K<=N
1<=B[]<=100000
Only integer values
Example 1:
Input:
2-> Input integer N
2-> Input integer K
2 -> Input integer, B[]
3 ->Input integer, B[]

Output:
2 ->output

Explanation:
In the above example, there are K=2 groups which a gun can fire at a time.
Initial configuration of each group: 2 3
Minute 1: the gun takes 1 shot, and it will hit 1 balloon in k -2 groups, now the configuration of each group will be: 1 2
Minute 2: the gun takes 1 shot, and it will hit 1 balloon in K -2 group, now the configuration of each group will be: 0 1
Now there are less than K-2 groups, other have lost all their balloons. And the maximum time Joe was busy was 2 minutes.

Example 2:
Input:
5-> Input integer N
3-> Input integer K
4 -> Input integer, B[]
3 ->Input integer, B[]
5 ->Input integer, B[]
6 ->Input integer, B[]
7 ->Input integer, B[]

Output:

8 ->output
