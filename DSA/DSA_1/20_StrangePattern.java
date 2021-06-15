/*
Problem-20
Strange Pattern

Description
You need to print pattern as given in Sample Input.

Input
First line contains N and M . (1<= N,M <= 10)

Output
Print pattern for N and M.

Sample Input 1
1 2
Sample Output 1
+/\/\+
+\/\/+

Sample Input 2
3 4
Sample Output 2
+/\/\/\/\+
+\/\/\/\/+
+/\/\/\/\+
+\/\/\/\/+
+/\/\/\/\+
+\/\/\/\/+

Hint
For N, there would be 2*N lined pattern.
*/

//Method-1
import java.util.Scanner;
public class StrangePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        n=n*2;m=m+2;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(j==0 || j==m-1) {
                    System.out.print("+");
                } else {
                    System.out.print(i%2!=0?"\\/":"/\\");
                }
            }
            System.out.println();
        }
    }
}
/*
00 01 02 03 04 05
10 11 12 13 14 15
20 21 22 23 24 25
30 31 32 33 34 35
40 41 42 43 44 45
50 51 52 53 54 55

3 4
+/\/\/\/\+
+\/\/\/\/+
+/\/\/\/\+
+\/\/\/\/+
+/\/\/\/\+
+\/\/\/\/+
*/


//Method-2
import java.util.Scanner;
public class StrangePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        n=n*2;m=m*2+2;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(j==0 || j==m-1) {
                    System.out.print("+");
                } else {
                    if(i%2==1) {
                        System.out.print(j%2!=0?"\\":"/");
                    } else {
                        System.out.print(j%2!=0?"/":"\\");
                    }
                }
            }
            System.out.println();
        }
    }
}
/*
00 01 02 03 04 05 06 07 08 09 010
10 11 12 13 14 15 16 17 18 19 110
20 21 22 23 24 25 26 27 28 29 210
30 31 32 33 34 35 36 37 38 39 310
40 41 42 43 44 45 46 47 48 49 410
50 51 52 53 54 55 56 57 58 59 510

3 4
+/\/\/\/\+
+\/\/\/\/+
+/\/\/\/\+
+\/\/\/\/+
+/\/\/\/\+
+\/\/\/\/+
*/

