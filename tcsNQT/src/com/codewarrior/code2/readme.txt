Q.2)
One day Bob is playing Zombie World video game.
In Zombie World game each round will contain N zombies and each zombie's energy is Zi (where 1<=i<=N). Bob will start the round with B energy. In order to move to the next level Bob need to kill all the N zombie's but Bob can select any one among N Zombie's. If energy of Bob (B) is less than Zombie energy (Zi) then Bob will die and lose the round else Bob will won, during the fighting with zombie, Bob will lose his energy by (Zi%2)+(Zi/2). At any point of game Bob will play optimally. Now your task is to find out whether Bob can reach to the next level or not.

Input Format: The first line of input contain B and N, where B is the energy of Bob and N is the number of Zombies. The second line of input contain Zi, where Zi is a list containing energy of zombies separated by space.
Output Format: Print "YES" or "NO" depending upon whether Bob can reach the next level or not.
Constraints: 1<=N<=10^4, 1<=B<=10^9, 1<=Zi<=10^5
Sample Test Case :
Input: 35 3
           5 9 6
Output: YES
