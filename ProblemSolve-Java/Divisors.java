/*
Masai Divisors


Description

You are provided 3 integers: *left*, *right* and *k*. Your task is to write a program that finds out the count of all such numbers between *left* and *right* (both inclusive) which are divided by *k*.

Input

Input Format

First line contains 3 space separated integers which are left, right and k respectively.

Constraints

l,r,k<10000

Output

Output the count of such numbers

Sample Input 1

1 10 1

Sample Output 1

10
*/

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int i = 0;
        for(i=l; i<=r; i++) {
            if(i % k == 0) {
                count = count + 1;
            }
        } 
        System.out.println(count);       
    }
}
