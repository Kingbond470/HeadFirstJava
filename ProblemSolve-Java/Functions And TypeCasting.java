
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


//     Given a number write a function to find if it is divisible by 7
//     Given a word in upper case convert to lower case (Don't use inbuilt functions)
//     Write a function to remove even numbers from the given array of numbers
//     Given a string remove a given character from the string


//     Given a number write a function to find if it is divisible by 3
//     Use the function in the above statement to print the multiples of 3 till given limit
//     Given a single character in lower case convert to upper case (Don't use inbuilt functions)
//     Write a function to check if a number is a prime
//     Given a string remove the vowels from the string

