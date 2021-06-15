/*
Problem-1
World Test Championship

Description

India & Australia just finished a Test Series, which was part of the inaugural world test championship. Now, you are given the points of the two teams, print the name of the teams which has more points. If the points of both the teams are same, the winner is the team which has played lesser number of games. If the number of matches played by the two teams is also same, then print "Play another game!".

Input


The input consists of 4 lines where the first line consists, the first line indicates the points of the India, the second line consists the points of the Australia, the next line contains the matches played by India, and the final line contains the matches played by Australia.


Constraints

1 < Points < 1500

1 < Matches <= 15

Output

Print the name of the team which has more points, if the points of the two team are same, print the name of the team which has played lesser number of games, else print "Play another game!".

Sample Input 1

580
500
12 
10

Sample Output 1

India

Sample Input 2

500
500
12 
12

Sample Output 2

Play another game!

Hint

In the first sample test case, the points of India are 580 and that of Australia are 500, therefore the output is India.

In the second test case, the points of Australia & India are same, and both the teams have played the same number of games, therefore, the output is "Play another game!".
*/

import java.util.Scanner;

public class WorldTestChampionship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ind_sc = sc.nextInt();
        int aus_sc = sc.nextInt();
        int ind_matches = sc.nextInt();
        int aus_matches = sc.nextInt();
        if(ind_sc>aus_sc) {
            System.out.println("India");
        }
        else if(ind_sc<aus_sc) {
            System.out.println("Australia");
        }
        else {
            if(ind_matches>aus_matches) {
                System.out.println("India");
            }
            else if(ind_matches<aus_matches) {
                System.out.println("Australia");
            }
            else {
                System.out.println("Play Another Match!");
            }
        }
    }
}

/*
Problem-2
Feel Good Strings

Description

Tom loves vowels. Any string which have half of the characters vowels make him feel good. You are given a string of length N, where N is an even number. If the number of vowels in the string, are more than or equal to N/2, print "Feel good!", else print "Feel bad!". (All the letters in the string are in lower case).

Note : The letters a, e, i, o, and u are said to be vowels.

Input

The first line of the input contains N, the length of the string. The next line contains a string of size N.


Constraints

1 <= N <= 50

Output

Print "Feel good!", if the number of vowels in the string is more than or equal to N/2, else print "Feel bad!".

Sample Input 1

4
uuuu

Sample Output 1

Feel good!

Sample Input 2

4
abcd

Sample Output 2

Feel bad!

Hint

In the first sample test case, the number of vowels in the string are 4, which is more than N/2 i.e. 2, therefore the output is "Feel good!".

In the second sample test case, the number of vowels in the string are 1, which is less than N/2 i.e 2, therefore the output is "Feel bad!".
*/
import java.util.Scanner;

public class FeelGoodStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        if(count>=n/2) {
            System.out.println("Feel Good!");
        }
        else {
            System.out.println("Fees Bad!");
        }
    }
}

/*
Problem-3
Beach Fun

Description

You are on a vacation in Goa, and you want to visit a beach. Now you have two options, you can either go to "RK Beach", or "RU Beach". You are short on time, so you can visit only one beach. You are given the position of the two beaches, RK Beach is located at coordinate 1, and RU Beach is located at coordinate 49. You are given your current position X, find the beach which is closer to you. If both the beaches are at same distance from your position, print "Go Anywhere!".

Input

The first and the only line of the input contains X, your current position.


Constraints

1 <= X <= 49

Output

Print the name of the beach which is closer to the current position, if both the beaches are equidistant to your current position, then print "Go Anywhere!".

Sample Input 1

23

Sample Output 1

RK Beach

Sample Input 2

29

Sample Output 2

RU Beach

Hint

In the first sample test case, the position X is 23, therefore the distance from RK Beach is 23 - 1 = 22, and the distance from RU Beach is 49 - 23 = 26. Therefore, the beach closer to you is RK Beach.

In the second sample test case, the position X is 29, therefore the distance from RK Beach is 29 - 1 = 28, and the distance from RU Beach is 49 - 29 = 20. Therefore, the beach closer to you is RU Beach.
*/

import java.util.Scanner;

public class BeachFun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int RK_Beach = 1;
        int RU_Beach = 49;
        int mid = (RK_Beach+RU_Beach)/2;
        System.out.println(X>mid ? "RU Beach" : X<mid ? "RK Beach" : "Go Anywhere!");
    }
}


/*
Problem -4
Birthday Chocolates Shopping

Description

Your birthday is coming, and to celebrate it, you want to give chocolates to all the students of your class. There are M students in your class, and you have N rupees to spend on the chocolates. Now, you can buy  "Dairy Milk", "Shots" or "Eclairs". The cost of Dairy Milk is 5 Rs per chocolate, and the cost of Shots is 2 Rs per chocolate, and the cost of Eclairs is 1 Rs per chocolate. You only have N rupees saved from your pocket money, and you want to buy the most expensive chocolate possible for your classmates.

Print "Dairy Milk", if you can buy M of them within N rupees, else if you can buy M Shots within N rupees, print "Shots", else if you can buy M eclairs within N rupees, print "Eclairs", else print "No Chocolates".

Input

The first line of input contains N, the amount of money you have. Next line contains M, the number of students in your class.


Constraints

1 <= N <= 200

1 <= M <= 100

Output

Print "Dairy Milk", if you can afford M of them within N rupees, else if you can buy M Shots within N rupees, print "Shots", else if you can buy M eclairs within N rupees, print "Eclairs", else print "No Chocolates".

Sample Input 1

100
15

Sample Output 1

Dairy Milk

Sample Input 2

10
15

Sample Output 2

No Chocolates

Hint

In the first sample test cases, you can buy 15 Dairy Milk chocolates, in 75 rupees, and you have 100 rupees to spend, so the answer will be "Dairy Milk".

In the second test case, you cannot buy any of the chocolates in the required quantity of 15, so the output is "No Chocolates"
*/

import java.util.Scanner;

public class BirthdayChocolateShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//Money
        int M = sc.nextInt();//Students
        int dairymilk = 5;
        int shots = 2;
        int eclairs = 1;
        //System.out.println(N/dairymilk>=M ? "Dairy Milk" : N/shots>=M ? "Shots" : N/eclairs>=M ? "Eclairs" : "No Chocolates");
        System.out.println(M*dairymilk<=N ? "Dairy Milk" : M*shots<=N ? "Shots" : M*eclairs<=N ? "Eclairs" : "No Chocolates");
    }
}


/*
Problem -5
Social Networking for Everyone

Description

You are designing a social networking website that makes everyone make friends in their neighborhood. But, the distance within which people can make friends depends on their age. If a person is of age less than 13, they can make friends within 1 Kms of their area, if the age of person is greater than or equal to 13 but less than 18, they can make friends within 5 Kms of their area, and if the age of the person is greater than or equal to  18 but less than 30, then they can make friends within 10 Kms of their area, else the person can make friends from anywhere.

If the age of the person is less than 13 print "1 Kms", else if the age of the person is more than or equal to 13, and less than 18, then print "5 Kms", else if the age of the person is greater than or equal to 18 and less than 30, then print "10 Kms", else print "You can have friends from anywhere".

Input

The first and the only line of the input contains N, the age of the person.


Constraints

1 <= N <= 65

Output

Print the output as mentioned in the question.

Sample Input 1

15

Sample Output 1

5 Kms

Sample Input 2

30

Sample Output 2

You can have friends from anywhere

Hint

In the first sample test case, the age of the person is 15, therefore, the output  is "5 Kms".

In the sample test case, the age of the person is 30, therefore, the output is "You can have friends from anywhere".
*/

import java.util.Scanner;

public class SocialNetworkingForEveryone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n<13?"1 kms":n>=13&&n<18?"5 kms":n>=18&&n<30?"10 kms":"you can have friends from anywhere");
    }
}


/*
problem -6

New Year Resolution 2021

Description

You have taken a new year resolution that you will walk a distance of N meters everyday in a park. Now, there are three parks around your area, Park A, Park B, Park C, and all of them arranged in the form of squares. The walking perimeter is made along the perimeter of the square parks. You have a weird condition that you will not do more than one round of any park while walking, so you want to select a park whose walking perimeter is greater than or equal to  N meters.

If the walking area of Park A is more than or equal N meters, print "Park A", else if the walking area of Park B is more than or equal to N meters, print "Park B", else if the walking area of Park C is more than or equal to N meters, print "Park C", else print "Resolution Failed".

Note : Park A has a higher priority than Park B, while Park B has a higher priority than Park C

Note : The perimeter of a square is given by 4*a, where a is the side of the square.

Input

The first three line of the inputs contain X, Y , Z, the length of the sides of the square parks A, B and C.

The next line contains N, the distance you have decided as your new year resolution.

Constraints

1 <= X,Y,Z <= 10

1 <= N <= 50

Output

Print the output as mentioned in the problem statement.

Sample Input 1

5
6 
7
15

Sample Output 1

Park A

Sample Input 2

1
1
1
10

Sample Output 2

Resolution Failed

Hint

In the first sample test case, the perimeter of the first park is 5*4 = 20, therefore, Park A can be selected to walk 15 meters. Therefore, the output is "Park A".

In the second sample test case, the perimeter of all the parks is 4, therefore no park can be selected to walk 10 meters. Therefore, the output is "Resolution Failed".
*/

import java.util.Scanner;

public class NewYearResolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parkA = sc.nextInt();
        int parkB = sc.nextInt();
        int parkC = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(parkA*4>=d ? "Park A" : parkB*4>=d ? "Park B" : parkC*4>=d ? "Park C" : "Resolution Failed");
    }
}

/*
Problem -7

Find the Thief

Description

Recently, a robbery happened at the Royal Bank of Masai. The thief, transferred an amount N into his own account. The manager has a doubt on three individuals, Person A, Person B, and Person C. You have the account balance of these three individuals. If the account balance of Person A is greater than N, print "Person A", else if the account balance of Person B is greater than N, print "Person B", else if the account balance of Person C is greater than N, print "Person C", else print "Not found".

Input

The first line of the input contains the account balance of Person A, the next line contains the account balance of Person B, and the third line contains the account balance of Person C. The last line of the input contains N, the amount stolen.

Constraints

1000 <= A,B,C,N <= 50000

Output

Print the output as mentioned in the problem statement.

Sample Input 1

30000
12000
43000
31000

Sample Output 1

Person C

Sample Input 2

4000
3000
2000
5000

Sample Output 2

Not found

Hint

In the first sample test case, the account balance of Person C is greater than N i.e. 31000, therefore, the output is "Person C".

In the second sample test case, none of the individuals have an account statement greater than N i.e. 5000, therefore, the output is "Not found".
*/

import java.util.Scanner;

public class FindtheThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(a>n ? "Person A" : b>n ? "Person B" : c>n ? "Person C" : "Not Found");
    }
}


/*
Problem-8
Greater than smallest element

Description

You are given an array A of size N.

Change all elements greater than the smallest element in the array to -1, and print the array.

Input

First line contains T, no of test cases.

First line of each test case contains N, size of array

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= N <= 100

1 <= A[i] <= 1000

Output

Print the array in new line for each test case

Sample Input 1

2
3
1 3 2
5
3 2 2 1 1

Sample Output 1

1 -1 -1
-1 -1 -1 1 1

Hint

For test case 1.

Minimum element is 1.

All elements more than 1 are converted to -1.
*/

import java.util.Scanner;
public class GreaterthanSmallestelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<T; i++) {
            //System.out.println("\n"+i+" start");
            int n = sc.nextInt();
            sc.nextLine();
            //System.out.println(n+"n is taken");
            int[] ar = new int[n];
            //System.out.println("array formed");
            for(int j=0; j<n; j++) {

                ar[j] = sc.nextInt();
                //System.out.print(ar[j]+" entered the loop    ");//press enter to print next output
            }
            //System.out.println("\n1st loop completed");
            int min = ar[0];
            for(int j=0; j<n; j++) {
                if(ar[j]<min) {
                    min = ar[j];
                }
            }
            //System.out.println("2nd loop completed");
            for(int j=0; j<n; j++) {
                if(min<ar[j]) {
                    ar[j] = -1;
                }
            }
            //System.out.println("3rd loop completed");
            for(int j=0; j<n; j++) {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
            //System.out.println("4th loop completed");
           // System.out.println("\nend--------------------------");
        }
    }
}



/*
Problem -9
Smaller than largest element

Description

You are given an array A of size N.

You need to change all elements smaller than the largest element in the array to -1, and print array

Input

First line contains T, no of test cases.

First line of each test case contains N, size of array

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= N <= 100

1 <= A[i] <= 1000

Output

Print the array in new line for each test case

Sample Input 1

2
3
1 3 2
5
3 3 2 1 1

Sample Output 1

-1 3 -1 
3 3 -1 -1 -1

Hint

For test case 1.

Maximum element is 3.

All elements less than 3 are converted to -1.
*/

import java.util.Scanner;

public class SmallerthanLargestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<T; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] ar = new int[n];
            for(int j=0; j<n; j++) {

                ar[j] = sc.nextInt();
                //System.out.print(ar[j]+" entered the loop    ");//press enter to print next output
            }
            //System.out.println("\n1st loop completed");
            int max = ar[0];
            for(int j=0; j<n; j++) {
                if(ar[j]>max) {
                    max = ar[j];
                }
            }
            //System.out.println("2nd loop completed");
            for(int j=0; j<n; j++) {
                if(max>ar[j]) {
                    ar[j] = -1;
                }
            }
            //System.out.println("3rd loop completed");
            for(int j=0; j<n; j++) {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
            //System.out.println("4th loop completed");
           // System.out.println("\nend--------------------------");
        }
    }
}


/*

Problem-10
Smallest Element

Description

You are given an array A of size N.

You need to change all occurrences the smallest element in array to -1, and print array

Input

First line contains T, no of test cases.

First line of each test case contains N, size of array

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= N <= 100

1 <= A[i] <= 1000

Output

For each test case,print array, on new line

Sample Input 1

2
3
1 3 2
5
3 3 2 1 1

Sample Output 1

-1 3 2 
3 3 2 -1 -1

Hint

For test case 1:-

1 is smallest element.

Change all occurrences of 1 to -1.
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            int min = 1000;
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(min>ar[j]){
                    min = ar[j];
                }
            }
//            int min = ar[0];
//            for(int j=0; j<n; j++) {
//                if(min>ar[j]) {
//                    min = ar[j];
//                }
//            }
            //System.out.println(min);
            for(int j=0; j<n; j++) {
                //System.out.print(ar[j]+" before ");
                if(ar[j] == min) {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
//            for(int j=0; j<n; j++) {
//                System.out.print(ar[j]);
//            }
            System.out.println();

        }
    }
}


/*
Problem-11
Largest Element

Description

You are given an array A of size N.

You need to change alloccurrences of the maximum element in array to -1. and print array. Check sample input/output.

Input

First line contains T, no of test cases.

First line of each test case contains N, size of array

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= N <= 100

1 <= A[i] <= 1000

Output

For each test case, print array, on new line

Sample Input 1

2
3
1 3 2
5
3 3 2 6 7

Sample Output 1

1 -1 2 
3 3 2 6 -1

Hint

For test case 1, maximum element is 3.

Change all occurrences of maximum element to -1.
*/

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            int max = -10;
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(max<ar[j]) {
                    max = ar[j];
                }
            }
            for(int j=0; j<n; j++) {
                if(ar[j] == max) {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
            //System.out.println();
        }
    }
}



/*
Problem-12

Odds and Evens

Description

You are given an array A of size N.

You need to change all even numbers in array to 1 and odd numbers to -1, and print array

Input

First line contains T, no of test cases.

First line of each test case contains N, size of array

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= N <= 100

1 <= A[i] <= 1000

Output

For each test case, print array,on new line

Sample Input 1

2
3
1 3 2
5
3 3 2 9 7

Sample Output 1

-1 -1 1
-1 -1 1 -1 -1

Hint

For test case 1:

1 is changed to -1.

3 is changed to -1

2 is changed to 1.
*/

import java.util.Scanner;

public class OddsandEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(ar[j]%2==0) {
                    ar[j] = 1;
                }
                else {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}


/*
Problem-13
Numbers divisible by M

Description

You are given an array A of size N and integer M.

You need to change all numbers in array which are divisible by M to -1, and print array

Input

First line contains T, no of test cases.

First line of each test case contains N, size of array, and M, a integer.

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= N,M <= 100

1 <= A[i] <= 1000

Output

For each test case, print array,on new line

Sample Input 1

2
3 3
1 3 2
5 3
3 3 2 9 7

Sample Output 1

1 -1 2 
-1 -1 2 -1 7

Hint

For test case 1:

1 is not divisible by 3, so remains same.

3 is divisible by 3, so changes to -1.

2 is not divisible by 3, so remains same.
*/

import java.util.Scanner;
public class NumberDivisiblebyM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(ar[j]%m==0) {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}



/*
Problem-14

Numbers not divisible by M

Description

You are given an array A of size N and integer M.

You need to change all numbers in array which are not divisible by M to -1, and print array

Input

First line contains T, no of test cases.

First line of each test case contains N, size of array, and M, a integer.

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= N,M <= 100

1 <= A[i] <= 1000

Output

For each test case, print array,on new line

Sample Input 1

2
3 3
1 3 2
5 3
3 3 2 9 7

Sample Output 1

-1 3 -1 
3 3 -1 9 -1 

Hint

For test case 1:

1 is not divisible by 3, so changes to -1.

3 is divisible by 3, so remains same.

2 is not divisible by 3, so changes to -1.
*/


import java.util.Scanner;
public class NumberNotDivisiblebyM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n; j++) {
                ar[j] = sc.nextInt();
                if(ar[j]%m!=0) {
                    ar[j] = -1;
                }
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}


/*
Problem-15
Decode the message

Description

Your friend sent you an encrypted message consisting of characters A, C, G and T only .You know the decoded message is the longest repetition in the sequence. That is a maximum-length substring containing only one kind of character. Can you decode it?

Input

Input Format

The only input line contains a string of n characters.

Constraints

1 <= n <= 10^6

Output

Print one integer: the length of the longest repetition.

Sample Input 1

ATTCGGGA

Sample Output 1

3

Hint

Sample Input 1 Explanation

In the given string , substring GGG of length 3 is the longest.
*/

import java.util.Scanner;
public class DecodetheMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i-1) == (str.charAt(i))) {
                count++;
                if(count>max) {
                    max = count;
                }
            }
            else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}



/*
Problem-16
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
public class LongestRepeatedOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int count = 0;
        int max = 0;
        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
            if(ar[i]%2==1) {
                count++;
                if(count>max) {
                    max = count;
                }
            }
            else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}


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



/*
Problem-19
Prayers

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

/\

Sample Input 2

4

Sample Output 2

   /\
  /  \
 /    \
/      \

Hint

No of lines in output would be N.
*/


import java.util.Scanner;

public class PatternofPrayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0,k=n-1; i<n; i++,k--) {
            for(int j=0; j<2*n; j++) {
                if(j==k || j==2*n-1-k) {
                    System.out.print(j==k?"/":"\\");
                }
                else {
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
   /\
  /  \
 /    \
/      \
 */



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

Sample Input 1
1 2
Sample Output 1
+/\/\+
+\/\/+
 */


