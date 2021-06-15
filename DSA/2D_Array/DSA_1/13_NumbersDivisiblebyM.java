/*
Problem-13
Numbers divisible by M

Description
You are given an array A of size N and integer M.
You need to change all numbers in array which are divisible by M to -1, and print array

Input
First line contains T, no of test cases.
First line of each test case contains N, size of array, and M, a integer.
Second line of each test case contains N spaced integers of array A.

Constraints
1 <= T <= 10
1 <= N,M <= 100
1 <= A[i] <= 1000

Output
For each test case, print array,on new line

Sample Input 1
2
3 3
1 3 2
5 3
3 3 2 9 7
Sample Output 1
1 -1 2 
-1 -1 2 -1 7

Hint
For test case 1:
1 is not divisible by 3, so remains same.
3 is divisible by 3, so changes to -1.
2 is not divisible by 3, so remains same.
*/

import java.util.Scanner;
public class NumberDivisiblebyM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(ar[j]%m==0) {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}
