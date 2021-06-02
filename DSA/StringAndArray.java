/*
Problem -1
Longest Repeated Odd

Description

You are given an array A of N integers. Your task is to find the maximum number of times an odd number is continuously repeated in the array.

Input

Input Format

First line contains N which is the number of element present in the array.

Second line contains N integers which are the values of array.

Constraints

N<100

Output

Output Format

Output one integer which the maximum number of times an odd number is repeated in array.

Sample Input 1

12
1 1 1 1 2 2 2 2 2 1 1 1

Sample Output 1

4

Hint

Sample 1 Explanation

1 is repeated 4 times from index 0 to index 3 => 4 times

2 is repeated 5 times from index 4 to index 8 => 5 times

1 is repeated 3 times from index 9 to index 11 => 3 times

So, the output is 4 since 1 is odd.
*/

import java.util.Scanner;
public class LongestContinuousRepeatedOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
        }
        int count=0;
        int max=0;

        for(int i=0; i<ar.length; i++) {
            if(ar[i]%2==1) {
                if(i==0) {
                    count=1;
                }
                else if(ar[i]==ar[i-1]) {
                    if(count==0) {
                        count = 1;
                    }
                    count++;
                }
            }
            else{
                count=0;
                continue;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}



/*
Problem -2
  Masai Palindromic Substring

Description

You are provided a string S. Write a program that returns length of the longest palindromic substring of that string.

Input

Input Format

You are provided with a string

Constraints

Length of string < 100

Output

Output Format

Output one number which is length of the longest substring which is a palindrome

Sample Input 1

thisracecarisgood

Sample Output 1

7

Hint

Sample 1 Explanation
*/

package StringAndArray;

import java.util.Scanner;
public class PalindromicSubstring {
    public static boolean isPalindrome(String string) {
        String reverse_string = "";
        boolean b = false;
        for(int i=string.length()-1; i>=0; i--) {
            reverse_string = reverse_string + string.charAt(i);
        }
        if(string.equals(reverse_string)) {
            b = true;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        int max_count = 0;
        for (int i = 0; i<str.length(); i++) {
            for(int j=i; j<str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    String temp_string = str.substring(i,j+1);
                    //System.out.println(temp_string);
                    if(isPalindrome(temp_string)) {
                        count = temp_string.length();
                        if(count>max_count) {
                            max_count = count;
                        }
                    }
                }
            }
        }
        System.out.println(max_count);
    }
}



/*
Problem -3
  Day of the Week

Description

Given the current day, and a number N, find what day will it be after N days.

Note:Current day will be from the set ->{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}

Input

The first line of the input contains the name of the current day.

The second line of the input contains N.

Constraints

1 <= N <= 1000

Output

Print the name of the day, which will occur after N days.

Sample Input 1

Wednesday
8

Sample Output 1

Thursday

Hint

In the sample test case, the current day is Wednesday. After N = 8 days, it will be Thursday.
*/

import java.util.Scanner;

public class DayOftheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given_day = sc.next();
        int given_num = sc.nextInt();
        int toFind = given_num%7;
        int n=0;
        switch(given_day) {
            case("Monday"):n=0;break;
            case("Tuesday"):n=1;break;
            case("Wednesday"):n=2;break;
            case("Thursday"):n=3;break;
            case("Friday"):n=4;break;
            case("Saturday"):n=5;break;
            case("Sunday"):n=6;break;
        }
        toFind = toFind + n;
        toFind = toFind%7;
        switch(toFind) {
            case 0:System.out.println("Monday");break;
            case 1:System.out.println("Tuesday");break;
            case 2:System.out.println("Wednesday");break;
            case 3:System.out.println("Thursday");break;
            case 4:System.out.println("Friday");break;
            case 5:System.out.println("Saturday");break;
            case 6:System.out.println("Sunday");break;
        }
    }
}


/*
problem -4
 Rotate the array - easy version

Description

You are given an array of n elements and an integer k, you need to rotate the array by k units towards right direction ( => ).

Input

1<=T<=10

1<=N<=1000, 0<=K<=1000

1 <= Ai <= 1000000

Output

out put N elements, elements of the array , rotated by K units

Sample Input 1

3
3 1
1 2 3
2 2
1 2
2 3
1 2

Sample Output 1

3 1 2
1 2
2 1
*/


import java.util.Scanner;

public class RotatetheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0; i<testCases; i++) {
            int len = sc.nextInt();
            int toRotate = sc.nextInt();
            int[] ar = new int[len];
            for(int j=0; j<ar.length; j++) {
                ar[j] = sc.nextInt();
            }
            for(int j=0; j<toRotate; j++) {
                int last = ar[ar.length-1];
                for(int k=ar.length-1; k>0; k--) {
                    //int temp = ar[k];
                    ar[k] = ar[k-1];
                    //ar[k-1] = temp;
                }
                ar[0] = last;
            }
            for(int j=0; j<ar.length; j++) {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}

