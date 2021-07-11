import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //sc.nextLine();
        String b = sc.nextLine();
        String first = "";
        String second = "";
        //System.out.println(b.replaceAll("\\s",""));   removes all the whitespaces within the string
        // a = a.replaceAll("\\s","");
        // b = b.replaceAll("\\s","");
        
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) != ' ') {
                 first = first + a.charAt(i);   
            }
        }
        
        for(int i=0; i<b.length(); i++) {
            if(b.charAt(i) != ' ') {
                second = second + b.charAt(i);
            }
        }
        System.out.println(first);
        System.out.println(second);
        char[] ar1 = first.toLowerCase().toCharArray();
        char[] ar2 = second.toLowerCase().toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(ar1.length == ar2.length) {
            //System.out.println("Yes");
            boolean result = Arrays.equals(ar1,ar2);
            if(result) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
        else {
            System.out.println("no");
        }
    }
}


/*
Without using sort function and  arrays
*/

import java.util.*;
public class Anagrams {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String s1 = "";
        String s2 = "";
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i)!=' ') {
                s1 = s1 + a.charAt(i);
            }
        }
        for(int i=0; i<b.length(); i++) {
            if(b.charAt(i)!=' ') {
                s2 = s2 + b.charAt(i);
            }
        }
        //System.out.println(s1);
        //System.out.println(s2);
        if(s1.length() == s2.length()) {
            for(int i=0; i<s1.length(); i++) {
                for(int j=0; j<s2.length(); j++) {
                    if(s1.charAt(i) == s2.charAt(j)) {
                        String z = "";
                        z = z+s1.charAt(i);
                        s2 = s2.replaceFirst(z,"");//replaceFirst only replaces the first occurence of given character while replace will remove all occurrence in single string
                        //strnew = str.replaceFirst(String parameter, char to replace with);
                        //System.out.print(s2 + " ");
                    }
                }
            }
            if(s2.equals("")) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
        else {
            System.out.println("no");
        }
        // String z = "";
        // z=z+s1.charAt(0);
        // System.out.println(s2.replaceFirst(z,""));

    }
}
