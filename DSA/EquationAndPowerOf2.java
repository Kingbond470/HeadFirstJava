
/*
Problem -1
Count Possible Pairs

Description

You are given a system of equations:

x^2 + y = n

y^2 + x = m

You have to count, how many there are pairs of integers (x, y) (0 ≤ x, y) which satisfy the system.

Input

Input Format :

A single line contains two integers n, m

Constraints :

1 ≤ n, m ≤ 1000

Output

On a single line print the count

Sample Input 1

9 3

Sample Output 1

1

Hint

Output Explanation :

In the first sample the suitable pair is integers (3, 0)
*/

import java.util.Scanner;

public class CountPossiblePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //equation 1 -->  x^2 + y = n
        //equation 2 -->  y^2 + x = m
        int count = 0;
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=m; j++) {
                int eq1 = i*i + j;
                int eq2 = j*j + i;
                if(n==eq1 && m==eq2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


/*
Problem -2
is it a power of 2

Description

Given a number n, print YES if it is a power of 2 else print NO.

Input

1<=T<=10

1<=N<=100000000

Output

output a single integer, the answer to the question.

Sample Input 1

3
1
2
100

Sample Output 1

YES
YES
NO
*/

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
//      Using Bitwise Operator to check power of 2
        for(int i=0; i<testCase; i++) {
            int n = sc.nextInt();
            String s = "No";
            if((n&(n-1))==0) {
                s = "Yes";
            }
            System.out.println(s);
        }
    }
}


/*
Problem -3
Make array even

Description

Given an array, you are allowed to do a single kind operation as many times as you want, choose 2 coordinates i, j

and reassign , ai = aj . Can you make the Sum of the array even. print YES or NO

Input

1<=T<=10

1<=N<=100000

0<=Ai<=100000

Output

output YES or NO as the question states

Sample Input 1

2
1
2
3
1 2 3

Sample Output 1

YES
YES
*/

import java.util.Scanner;

public class MakeArrayEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i=0; i<testCase; i++) {
            int len = sc.nextInt();
            int[] ar = new int[len];
            boolean b = false;
            for(int j=0; j<len; j++) {
                ar[j] = sc.nextInt();
            }
            int sum = Arraysum(ar);
            if(sum%2==0) {
                b = true;
            }
            else {
                for(int j=0; j<len; j++) {
                    if(ar[j]%2==0) {
                        b = true;
                        //break;   --> not necessary since it will only enter 'if condition' when num is even
                    }
                }
//                for(int j=0; j<len; j++) {
//                    int[] temp_ar = Arrayfill(ar);
//                    if(temp_ar[j]%2!=0) {
//                        if(j==len-1) {
//                            temp_ar[j] = temp_ar[j-1];
//                        } else {
//                            temp_ar[j] = temp_ar[j+1];
//                        }
//                    }
//                    if(Arraysum(temp_ar)%2==0) {
//                        b = true;
//                        break;
//                    }
//
//                }
            }
            if(b) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static int Arraysum(int[] ar) {
        int sum = 0;
        for(int i=0; i<ar.length; i++) {
            sum+=ar[i];
        }
        return sum;
    }
//    public static int[] Arrayfill(int[] ar) {
//        int[] temp_ar = new int[ar.length];
//        for(int i=0; i<ar.length; i++) {
//            temp_ar[i] = ar[i];
//        }
//        return temp_ar;
//    }

}

