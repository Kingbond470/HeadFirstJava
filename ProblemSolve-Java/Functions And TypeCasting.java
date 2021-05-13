
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
Input 
RoHIT sHARmA

Output
rohit sharma
*/



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

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char a = sc.next().charAt(0);
        removeCharacter(word,a);
        //System.out.println(word);
        //System.out.println(a);
    }
    
    public static void removeCharacter(String word, char a) {
        String output = "";
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) != a) {
                output = output + word.charAt(i);
            }
        }
        System.out.println(output);
    }
}
/*
Input
GeeksforGeEks
e

Output
GksforGEks
*/

//     Given a number write a function to find if it is divisible by 3

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    three(n);
    
    }
    public static void three(int n) {
        if(n%3==0) {
            System.out.println("Divisible by 3");
        }
        else{
            System.out.println("Not divisible by 3");
        }
    }
}
//     Use the function in the above statement to print the multiples of 3 till given limit


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    multipleOFthree(n);
    
    }
    public static void multipleOFthree(int n) {
        for(int i=1; i<=n; i++) {
            if(i%3==0) {
                System.out.print(i+" ");
            }
        }
    }
}



//     Given a single character in lower case convert to upper case (Don't use inbuilt functions)

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

//     Write a function to check if a number is a prime

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


//     Given a string remove the vowels from the string

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String word=sc.nextLine();
    String output="";
    int length=word.length();
    for(int i=0; i<length; i++){
        if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U'){
            continue;
        }
        else {
            output=output+word.charAt(i);
        }
    }
    System.out.print(output);
    }
}
