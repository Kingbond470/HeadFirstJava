/*
Problem-18
Pattern of W

Description
You need to print pattern as given in Sample Input.
Note:- Make sure to check for spaces. In output, there is no spaces at end of each line.

Input
First line contains N. (1<= N <= 10)

Output
Print pattern for N.

Sample Input 1
1
Sample Output 1
\/\/

Sample Input 2
4
Sample Output 2
\      /\      /
 \    /  \    /
  \  /    \  /
   \/      \/
   
Hint
Self Explanatory
*/

import java.util.Scanner;
public class PatternofW {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n*4; j++) {
                if(i==j || 2*n+i==j) {
                    System.out.print("\\");
                } else if(i+j==2*n-1 || i+j==4*n-1) {
                    System.out.print("/");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
00 01 02 03 04 05 06 07 08 09 010 011 012 013 014 015
10 11 12 13 14 15 16 17 18 19 110 111 112 113 114 115
20 21 22 23 24 25 26 27 28 29 210 211 212 213 214 215
30 31 32 33 34 35 36 37 38 39 310 311 312 313 314 315
\      /\      /
 \    /  \    /
  \  /    \  /
   \/      \/
 */
