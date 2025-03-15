Q.9)

Find the total
Problem Statement
You are given an array arr of N numbers. Each time the minimum number in the array is selected, its adjacent elements and the number itself are deleted. This process is repeated until there are no numbers left in the array. You are supposed to find and print the total of the minimum numbers being deleted from the array.


Note:
If  we have a minimum number at different indexes, we have to choose the number with the least index. If we have an element with one adjacent element only then the element itself and the single adjacent element will be deleted.

For example, we have an array of 4 numbers, 4,3,2,1. We will first choose the minimum, i.e. 1, and add it to the total, after which 2 and 1 are deleted. Then, we will choose the minimum from the remaining elements, i.e. 3, and add it to the total, after which 3 and 4 will be deleted, and the total in the end will be 4.


Input Format:
The input is in the following format:
The first line contains an integer, i.e. N.
 Each of the next N lines has a single element denoting the elements of the array arr.
Output Format:
Print the total of the minimum numbers being deleted from the array arr.
Constraints:
3 ≤ N ≤ 2000.
1 ≤ arr[i] ≤ 10^5.
