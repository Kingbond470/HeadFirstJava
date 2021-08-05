/*
Given a string return the length of the given String without using length built-in function

*/

//using try catch
import java.util.*;
public class StringLengthUsingRecursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "rohit sharma";
        int count = 0;
        System.out.println(len(str, count));
    }
    public static int len(String str, int n) {
        try {
            if(str.charAt(n) == -1) {
                return n;
            } else {
                return len(str, n+1);
            }
        }
        catch(Exception e) {
            return n;
        }


    }
}


//using empty String
import java.util.Scanner;

public class StringLengthUsingRecursion_emptyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String st = "";
        int count = 0;
        System.out.println(len(str, st, count));
    }

    private static int len(String str, String st, int count) {
        if(str.equals(st)) {
            return count;
        }
        else {
            st+=str.charAt(count);
            return len(str, st,count+1);
        }
    }
}


/*

input --> rohit
output --> 5
*/
