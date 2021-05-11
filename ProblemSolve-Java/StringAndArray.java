/*
Average-of-all

Description

You are given an array which has integer elements. Write a program to print the ceil (Ref :https://en.wikipedia.org/wiki/Floor_and_ceiling_functions) average of elements (numbers) present in the array.

Input

Input Format :

First line contains n, which is the number of elements present in array.

Second line contains n space separated integers


Constraints :

n<100

Output

Output should be the ceil ( Ref :https://en.wikipedia.org/wiki/Floor_and_ceiling_functions) of the average of numbers present in array

Sample Input 1

4
2 5 0 9

Sample Output 1

4

Hint

Output Explanation :

N here is 4.

So, you are getting 4 elements in the array.

The ceil of average of elements of array is 4.
*/

//Program 


import java.util.Scanner;
public class String
{
    public static void main(java.lang.String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            sum = sum + sc.nextInt();
        }
        double avg = sum/n;
        System.out.println(Math.ceil(avg));

    }
}

                           
/*                           
 Question -2
Smallest and Largest of all

Description

Given an array, A, of N integers, print the smallest and largest element present in the array

YOU MUST NOT USE ANY BUILT-IN FUNCTION

Input

Input Format

The first line contains an integer, N (the number of integers in A). The second line contains N space separated integers describing A.

Constraints

N<100

Output

Output Format

Print 2 integers in different lines where first integer represents the minimum of all elements and second integer represents the maximum of all

Sample Input 1

4
-2 0 8 4

Sample Output 1

-2
8
*/
//program

import java.util.ArrayList;
import java.util.Scanner;
public class String
{
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int max = -1000;
        int min = 1000;
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            ar.add(sc.nextInt());
        }
        //System.out.println(ar);
        for(int i=0; i<n; i++) {
            if(ar.get(i)>max) {
                max = ar.get(i);
            }
            if(ar.get(i)<min) {
                min = ar.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);


    }
}

/*
  Question -3
  Missing Integer

Description

You are given an array of N-1 integers and integers are in the range of 1 to N. There are no duplicates in the array. One of the integers is missing in the array. Find the missing integer

Input

Input Format

The first and only line contains N-1 integers

Constraints

N<100

Output

Print the one number belonging from 1 to N which is not present in the array

Sample Input 1

4 5 1 3

Sample Output 1

2
*/
//program



/*
Question -4
Battle of Odd & Even

Description

You are given an array A of N integers. Your task is to write a programme that prints "Odd" (without quotes) if the sum of all odd numbers present in the array is greater than sum of all the even numbers present in the array. In all other cases, print "Even" (without quotes).

Input

Input Format :

First line contains N which is the number of elements present in the array.

Second line contains N space separated integers which are the elements of array.


Constraints :

N<100

Output

Print either "Odd" or "Even" depending upon the condition mentioned above.

Sample Input 1

4
1 2 3 4

Sample Output 1

Even

Hint

Output Explanation :

Odd numbers present are 1 and 3, whose sum is 4

Even numbers present in array are 2 and 4, whose sum is 6

Since 6>4, Even is the required output.
*/
  
//program


import java.util.ArrayList;
import java.util.Scanner;
public class String
{
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int even = 0;
        int odd = 0;
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            ar.add(sc.nextInt());
        }
        //System.out.println(ar);
        for(int i=0; i<n; i++) {
            if(ar.get(i)%2==0) {
                even = even + ar.get(i);
            }
            if(ar.get(i)%2==1) {
                odd = odd + ar.get(i);
            }
        }
        System.out.println(even>odd?"Even":"Odd");
    }
}

/*

Question -5
  Reverse Array 12

Description

You are given an array A of length n. Your task is to write a program that prints the array in reversed form.

Input

Input Format

First line contains n (number of elements present in the array)

Second line contains n space separated integers which are the elements of the array.

Constraints

n< 100


Output

Output the elements of the array in the reversed form (separated by space)

Read sample test case explanation for better understanding

Sample Input 1

5
12 34 11 9 18

Sample Output 1

18 9 11 34 12


 Question -6
  Equal to 42 or not!

Description

You are given an array of N integers. Output "Yes" if 42 is present in array, else print "No".

Input

Input Format :

First line contains number of integers N present in the array.

Second line contains  N  space separated integers.

Constraints :

N<100

Output

Output Yes/No based on condition mentioned above.

Sample Input 1

5
3 7 0 9 8

Sample Output 1

No

Question -7
 Sum and Conditions

Description

You are given an array of  N integers. Write a program that prints "Greater" (without quote) if the sum of all elements present in the array is greater than 100, else print "Lesser" (without quotes).

Input

Input format

First line contains N

Second line contains N space separated integers which are elements of the array.

Constraints

n<1000

Output

Output Format

Output Greater/Lesser depending upon the sum

Sample Input 1

5
21 24 2 54 8

Sample Output 1

Greater

Hint

Sample 1 Explanation

Since, sum of all elements in array is 109, therefore Greater

Question -8
 Negativity

Description

You are given an array of N integers. Find the total count of negative elements present in the array.

Input

Input Format:

First line contains N integers

Second line contains N space separated integers which constitute the array.

Constraints:

N < 100

Output

Output the number of negative integers present in the array

Sample Input 1

5
-3 0 -5 9 8

Sample Output 1

2

Question -9
 Product of array problem

Description

You are given an array of N positive integers. Write a program to output the product of all the elements present in the array.

Input

Input Format:

First line contains N.

Second line contains N space separated integers

Constraints:

N<100

Output

Output one number which is the product of all elements.

Sample Input 1

5
3 5 2 9 4

Sample Output 1

1080

