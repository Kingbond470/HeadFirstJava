/*
Square Pattern

Description

Given an integer N, you need to print a square pattern as given in sample input/output.

Input

The first line contains a number N.

Constraints:

3 <= N <= 10

Output

Print a square pattern for N.

Sample Input 1

4

Sample Output 1

* * * *
*     *
*     *
* * * *

Sample Input 2

3

Sample Output 2

* * *
*   *
* * * 

*/

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(i==0 || j==0 || i==n-1 || j==n-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
