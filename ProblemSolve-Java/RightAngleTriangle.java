/*
Right Angle Triangle

Description

Given an integer n, you need to print right-angled triangle patterns as given in sample input/output.

Input

The first line contains a number N.

Constraints:

2 <= N <= 10

Output

Print a right-angled triangle for N.

Sample Input 1

4

Sample Output 1

      *
    * *
  * * *
* * * *

Sample Input 2

2

Sample Output 2

  *
* *

*/

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                if(i+j==n || i+j>n) {
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
