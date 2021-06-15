/*
Problem-12
Odds and Evens

Description
You are given an array A of size N.
You need to change all even numbers in array to 1 and odd numbers to -1, and print array

Input
First line contains T, no of test cases.
First line of each test case contains N, size of array
Second line of each test case contains N spaced integers of array A.

Constraints
1 <= T <= 10
1 <= N <= 100
1 <= A[i] <= 1000

Output
For each test case, print array,on new line

Sample Input 1
2
3
1 3 2
5
3 3 2 9 7
Sample Output 1
-1 -1 1
-1 -1 1 -1 -1

Hint
For test case 1:
1 is changed to -1.
3 is changed to -1
2 is changed to 1.
*/

import java.util.Scanner;

public class OddsandEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(ar[j]%2==0) {
                    ar[j] = 1;
                }
                else {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}
