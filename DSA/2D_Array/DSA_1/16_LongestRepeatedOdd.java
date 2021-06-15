/*
Problem-16
Longest Repeated Odd

Description
You are given an array A of N integers. Your task is to find the maximum number of times an odd number is continuously repeated in the array.

Input
Input Format
First line contains N which is the number of element present in the array.
Second line contains N integers which are the values of array.

Constraints
N<100

Output
Output Format
Output one integer which the maximum number of times an odd number is repeated in array.

Sample Input 1
12
1 1 1 1 2 2 2 2 2 1 1 1
Sample Output 1
4

Hint
Sample 1 Explanation
1 is repeated 4 times from index 0 to index 3 => 4 times
2 is repeated 5 times from index 4 to index 8 => 5 times
1 is repeated 3 times from index 9 to index 11 => 3 times
So, the output is 4 since 1 is odd.
*/

import java.util.Scanner;
public class LongestRepeatedOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int count = 0;
        int max = 0;
        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
            if(ar[i]%2==1) {
                count++;
                if(count>max) {
                    max = count;
                }
            }
            else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
