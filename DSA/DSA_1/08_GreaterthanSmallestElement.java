/*
Problem-8
Greater than smallest element

Description
You are given an array A of size N.
Change all elements greater than the smallest element in the array to -1, and print the array.

Input
First line contains T, no of test cases.
First line of each test case contains N, size of array
Second line of each test case contains N spaced integers of array A.

Constraints
1 <= T <= 10
1 <= N <= 100
1 <= A[i] <= 1000

Output
Print the array in new line for each test case

Sample Input 1
2
3
1 3 2
5
3 2 2 1 1
Sample Output 1
1 -1 -1
-1 -1 -1 1 1

Hint
For test case 1.
Minimum element is 1.
All elements more than 1 are converted to -1.
*/


import java.util.Scanner;
public class GreaterthanSmallestelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<T; i++) {
            //System.out.println("\n"+i+" start");
            int n = sc.nextInt();
            sc.nextLine();
            //System.out.println(n+"n is taken");
            int[] ar = new int[n];
            //System.out.println("array formed");
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                //System.out.print(ar[j]+" entered the loop    ");//press enter to print next output
            }
            //System.out.println("\n1st loop completed");
            int min = ar[0];
            for(int j=0; j<n; j++) {
                if(ar[j]<min) {
                    min = ar[j];
                }
            }
            //System.out.println("2nd loop completed");
            for(int j=0; j<n; j++) {
                if(min<ar[j]) {
                    ar[j] = -1;
                }
            }
            //System.out.println("3rd loop completed");
            for(int j=0; j<n; j++) {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
            //System.out.println("4th loop completed");
           // System.out.println("\nend--------------------------");
        }
    }
}
