/*
1. Add Numbers
Problem

    Write a function named addNumbers which takes two numbers as input and return their sum
    Use the function to calculate the sum of given three numbers
*/ 
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(addNums(a,b));
        System.out.println(addNums(addNums(a,b),c));
    }
    private static int addNums(int a, int b) {
        int sum = a+b;
        return sum;
    }
}




/*
2. Absolute Difference
Problem

    Write a function to find the absolute difference of two numbers
    Sample Input-1 12,4
    Sample Output-1 8
    Sample Input-2 4,18
    Sample Output-2 14
*/
import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(absolute(a,b));
    }
    private static int absolute(int a, int b) {
        //int sum = a-b;
        int sum = Math.abs(a-b);
        return sum;
    }
}





/*
3. isOdd Check
Problem

    Write a function isOdd which returns a boolean value based the number is odd or not
    Use this function to print the odd numbers from 0 to a given limit(included)
*/

import java.util.Scanner;
//import java.lang.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            if(isOdd(i)) {
                System.out.println(i);
            }
        }
        
    }
    private static boolean isOdd(int n) {
        if(n%2==1) {
            return true;
        }
        else {
            return false;
        }
    }
}



/*
4. Array Average
Problem

    Write a function to calculate the average of an array
    If there are no items in the array it should return 0
*/

import java.util.Scanner;
//import java.lang.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        //System.out.println(n);
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();    
        }
        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        System.out.print(avg(arr));
    }
    private static int avg(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum/arr.length;
        return average;
    }
}



/*    
5.Word to lower case
Problem

    Write a function to convert a character to lower case
    Use this function to convert a given word to lower case
*/



6. Mirror Image
Problem

    Print the mirror image of the given lowercase string ayzb should become zbay
    Note: mirror image does not mean reverse (The mirror image of a is z, b is y, c is x ...)






