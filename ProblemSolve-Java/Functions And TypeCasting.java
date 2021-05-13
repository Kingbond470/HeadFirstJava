
//     Given a number write a function to find if it is divisible by 5
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    divide(n);
        
    }
    private static void divide(int n) {
        if(n%5==0) {
            System.out.println("Divisible of 5");
        }
        else {
            System.out.println("Not divisible by 5");
        }
    }
}


//     Given a single character in upper case convert to lower case (Don't use inbuilt functions)

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    U_l(ch);

    }
    public static void U_l(char ch) {

        int num  = (int)ch + 32;
        char lo = (char)num;
        System.out.println(lo);
    }
}

//     Write a function to check if a number is not a prime

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    isPrime(n);
    }
    public static void isPrime(int n) {
    if(n==0 || n==1) {
        System.out.println(n+" is not a prime number");
    }
    else {
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                System.out.println(n+" is not a prime number");
                break;
            }
            else {
                System.out.println(n+" is a prime number");
                break;
            }
        }
    }
    }
}


//     Given a string remove the consonants from the string

//Given a string remove the consonants from the string
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String word=sc.nextLine();      //mausam=== m a u s a m
    String output="";
    int length=word.length();
    for(int i=0; i<length; i++){
        if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U'){
            output=output+word.charAt(i);
        }
    }System.out.print(output);  // \n space
    }
}


//     Given a number write a function to find if it is divisible by 7

//Given a string remove the consonants from the string
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    seven(n);
    
    }
    public static void seven(int n) {
        if(n%7==0) {
            System.out.println("Divisible by 7");
        }
        else{
            System.out.println("Not divisible by 7");
        }
    }
}

//     Given a word in upper case convert to lower case (Don't use inbuilt functions)

//Given a word in upper case convert to lower case (Don't use inbuilt functions)
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        l_U(s);    
    }
    public static void l_U(char s) {
        int n = (int)s-32;
        char ch = (char)n;
        System.out.println(ch);
    }
}


//     Write a function to remove even numbers from the given array of numbers

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        sc.nextLine();
        for(int i=0; i<n; i++) {
            ar[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(ar[i]%2!=0) {
                System.out.print(ar[i]+" ");
            }
        }
    }
}

//     Given a string remove a given character from the string


//     Given a number write a function to find if it is divisible by 3
//     Use the function in the above statement to print the multiples of 3 till given limit
//     Given a single character in lower case convert to upper case (Don't use inbuilt functions)
//     Write a function to check if a number is a prime
//     Given a string remove the vowels from the string

