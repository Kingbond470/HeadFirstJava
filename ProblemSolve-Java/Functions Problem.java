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

import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(toLowerCase(word));
    }
    public static String toLowerCase(String word) {
        String output ="";
        for(int i=0; i<word.length(); i++) {
            output = output + toLower(word.charAt(i));
        }
        return output;
    }
    public static char toLower(char c) {
        int a = (int)c;
        char s1;
        //65 to 90 -- ASCII values of A to Z
        if(a>64 && a<91) {
            a = (int)c + 32;
            s1 = (char)a;
        }
        else {
            s1 = c;
        }
        return s1;
    }
}



/*
6. Mirror Image
Problem

    Print the mirror image of the given lowercase string ayzb should become zbay
    Note: mirror image does not mean reverse (The mirror image of a is z, b is y, c is x ...)
*/

import java.util.Scanner;
public class MirrorImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        mirror(str);
    }
    public static void mirror(String str) {
        //ASCII -- 65(A) to 90(Z)  &&  97(a) to 122(z)
        //char[] ch = str.toCharArray();
        String strRevSmall = "zyxwvutsrqponmlkjihgfedcba";
        String strRevCaps = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char a = str.charAt(i);
            int n = (int)a;
            if(n>=65 && n<=90) {
                result = result + strRevCaps.charAt(str.charAt(i) - 'A');
            }
            else if(n>=97 && n<=122) {
                result = result + strRevSmall.charAt(str.charAt(i) - 'a');
            }
            else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}


