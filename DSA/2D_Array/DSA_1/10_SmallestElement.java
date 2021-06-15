/*
Problem-10
Smallest Element

Description
You are given an array A of size N.
You need to change all occurrences the smallest element in array to -1, and print array

Input
First line contains T, no of test cases.
First line of each test case contains N, size of array
Second line of each test case contains N spaced integers of array A.
Constraints
1 <= T <= 10
1 <= N <= 100
1 <= A[i] <= 1000

Output
For each test case,print array, on new line

Sample Input 1
2
3
1 3 2
5
3 3 2 1 1
Sample Output 1
-1 3 2 
3 3 2 -1 -1

Hint
For test case 1:-
1 is smallest element.
Change all occurrences of 1 to -1.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            int min = 1000;
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(min>ar[j]){
                    min = ar[j];
                }
            }
//            int min = ar[0];
//            for(int j=0; j<n; j++) {
//                if(min>ar[j]) {
//                    min = ar[j];
//                }
//            }
            //System.out.println(min);
            for(int j=0; j<n; j++) {
                //System.out.print(ar[j]+" before ");
                if(ar[j] == min) {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
//            for(int j=0; j<n; j++) {
//                System.out.print(ar[j]);
//            }
            System.out.println();
        }
    }
}
