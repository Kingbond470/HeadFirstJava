/*
Range of 2

Description

You are given two integers, L and R. You have to print all the numbers between L and R, L and R inclusive, such that the current number is the double of the previous number. Refer the sample I/O for better understanding.

Input

The first and the only line of the input contains L and R, the two numbers.


Constraints

1 <= L,R <= 300

Output

Print all the values between the range of L and R, such that the current value is the double of the previous value.

Sample Input 1

4 10

Sample Output 1

4 8

Hint

In the sample test case, the value of L and R is 4 and 10 respectively. Starting from L, the values need to be doubled until R is crossed. Therefore, the output is 4 followed by 8.
*/


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        for (int i=L; i<=R; i++) {
            System.out.printf(i+" ");
            i = i + i - 1;
        }
        
    }
}
