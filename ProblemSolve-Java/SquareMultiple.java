/*
Square Multiple

Description

Given an integer N, for all the numbers in the range [1, N], print the first N multiples of each of them. Please refer to the sample I/O for the same

Input

The first line contains a number N.

Constraints:

1 <= N <= 10

Output

Print a pattern for N.

Sample Input 1

2

Sample Output 1

1 2
2 4

Sample Input 2

4

Sample Output 2

1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16

*/

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
