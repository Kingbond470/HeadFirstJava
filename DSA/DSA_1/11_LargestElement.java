/*
Problem-11
Largest Element

Description
You are given an array A of size N.
You need to change alloccurrences of the maximum element in array to -1. and print array. Check sample input/output.

Input
First line contains T, no of test cases.
First line of each test case contains N, size of array
Second line of each test case contains N spaced integers of array A.

Constraints
1 <= T <= 10
1 <= N <= 100
1 <= A[i] <= 1000

Output
For each test case, print array, on new line

Sample Input 1
2
3
1 3 2
5
3 3 2 6 7
Sample Output 1
1 -1 2 
3 3 2 6 -1

Hint
For test case 1, maximum element is 3.
Change all occurrences of maximum element to -1.
*/

import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            int max = -10;
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(max<ar[j]) {
                    max = ar[j];
                }
            }
            for(int j=0; j<n; j++) {
                if(ar[j] == max) {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
            //System.out.println();
        }
    }
}
