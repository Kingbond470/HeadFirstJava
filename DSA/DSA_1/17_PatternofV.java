/*
Problem -17
V

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
\/

Sample Input 2
4
Sample Output 2
\      /
 \    /
  \  /
   \/
*/

import java.util.Scanner;
public class PatterofV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<2*n; j++) {
                //System.out.print(i+""+j+" ");
                if(i==j || i+j==2*n-1) {
                    System.out.print(i==j?"\\":"/");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
00 01 02 03 04 05 06 07
10 11 12 13 14 15 16 17
20 21 22 23 24 25 26 27
30 31 32 33 34 35 36 37
\      /
 \    /
  \  /
   \/
 */
