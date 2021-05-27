/*
Anagram Words Submitted
Problem-1

    Given two words (small case) if they are anagrams print "TRUE" otherwise "FALSE" https://en.wikipedia.org/wiki/Anagram
    Sample Input 1 - den , end
    Sample Output 1 - TRUE
    Sample Input 2 - hello, heloo
    Sample Output 2 - FALSE

Submission Image/Video Instructions
Screenshot of the output for the words (listen, silent) , (here, heir), (wind, dwine)
*/

import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        /*
        if(str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if(str1.charAt(i) == str2.charAt(j)) {
                        String b = "";
                        b = b + str2.charAt(j);
                        str2 = str2.replaceFirst(b,"");
                        //System.out.println(str2+" "+b);
                    }
                }
            }
            if(str2 == "") {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        } else {
            System.out.println("Not an Anagram");
        }
        */
        ArrayList<Character> s1 = new ArrayList<Character>();
        ArrayList<Character> s2 = new ArrayList<Character>();
        for(char ch:str1.toCharArray()) {
            s1.add(ch);
        }
        for(char ch:str2.toCharArray()) {
            s2.add(ch);
        }
        if(s1.size() == s2.size()) {
            for(int i=0; i<s1.size(); i++) {
                for(int j=0; j<s2.size(); j++) {
                    if(s1.get(i) == s2.get(j)) {
                        s2.remove(j);
                    }
                }
            }
            if(s2.size() == 0) {
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not an Anagram");
            }
        }
        else {
            System.out.println("Not an Anagram");
        }
    }
}

/*
Phone Numbers Dictionary Submitted
Problem-2

Given user's names and their phone numbers , query the given user and find the phone number .

Input

Yogesh 915678
Nrupul 512345
Prateek 213456
Aman 120987
Madhukar 009871

Output

Example 1

user = Aman

120987

Example 2

user = Rahul

No user found

Submission Image/Video Instructions

Print the output for the below inputs

Input 1

Ajay 21345
RamDas 32146
Rohith 23522
Nihal 98743

Query the user Nihal

Input 2

Ajay 21342
RamDas 32146
Rohith 23522
Nihal 98743

Query the user Mani
*/
import java.util.*;
import java.util.regex.Pattern;

public class PhoneNumberDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> phone_dict = new HashMap<String, Integer>();
//        phone_dict.put("Yogesh", 915678);
//        phone_dict.put("Nrupul", 512345);
//        phone_dict.put("Prateek", 213456);
//        phone_dict.put("Aman", 120987);
//        phone_dict.put("Madhukar", 009871);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String name = sc.next();
            int num = sc.nextInt();
            phone_dict.put(name, num);
        }
        //System.out.println(phone_dict);
        sc.nextLine();
        System.out.println("Enter the name you want to Search:");
        String to_search = sc.nextLine();
        //sc.close();
        Pattern p = Pattern.compile(to_search);
        boolean value = true;
        for (Map.Entry<String, Integer> map : phone_dict.entrySet()) {
            if(p.matcher(map.getKey()).matches()) {
               System.out.println(map.getValue());
               value = false;
                //System.out.println(phone_dict.values());     //for all values
            }
        }

//        for(Map.Entry<String, Integer> map: phone_dict.entrySet()) {
//            if(to_search.equals(map.getKey())) {
//                System.out.println(map.getValue());
//                value = false;
//            }
//        }
        if(value) {
            System.out.println("No user found");
        }

    }
}


/*
Find Array pairs Pending
Problem -3

Given an array and sum value , find pair with given sum.

Given sum = 10

Input

8 4  6  2  1  3

Output

(8,2)
(4,6)


Find the pairs for the given array = { 1, 3 , 5 , 2 , 7} , sum = 8
*/
import java.util.Scanner;

public class findPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = { 1, 3 , 5 , 2 , 7};
        /*
        //for custom array
        * int n = sc.nextInt();
        * int[] ar = new int[n];
        * for(int i=0; i<n; i++) {
        *   ar[i] = sc.nextInt();
        * }
        * */
        int sum = sc.nextInt();
        for(int i=0; i<ar.length; i++) {
            for(int j=i; j<ar.length; j++) {
                if(i!=j && ar[i]+ar[j]==sum) {
                    System.out.println("("+ar[i]+","+ar[j]+")");
                }
            }
        }
    }
}



/*
Users Age Filter Pending
Problem -4

    Given a list of user data with name and age, create a list of key-value pairs from the input
    From the generated data, print the users whose age is more than 30
    Sample Input

    Nrupul 32
    Prateek 30
    Aman 26
    Albert 28
    Yogesh 44

    Sample Data Stored [] - List {} - Key-Value Pairs

    [
      {name: "Nrupul", age: 32},
      {name: "Prateek" , age: 30},
      {name: "Aman" , age: 26},
      {name: "Albert" , age: 28},
      {name: "Yogesh" , age: 44},
    ]

    Sample Output

    Nrupul
    Yogesh


Nrupul 32
Prateek 30
Aman 26
Ankur 34
Albert 28
Yogesh 44
Sidharth 22
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgeFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        //int i=0;
//
//        while(sc.hasNext()) {
//            String name = sc.next();
//            int age = sc.nextInt();
//            sc.nextLine();
//            hashmap.put(name,age);
//            if(sc.equals("")) {
//                break;
//            }
//            //i++;
//        }
        int n = sc.nextInt();
        while(n>0) {
            String name = sc.next();
            int age = sc.nextInt();
            hashmap.put(name,age);
            n--;
        }
        //System.out.println(hashmap);
        for(Map.Entry<String, Integer> map:hashmap.entrySet()) {
            if(map.getValue()>30) {
                System.out.println(map.getKey());
            }
        }
    }
}


/*
User Skill Finder Pending
Problem-5

    Given a list of user data with name and skill, create key-value pairs from the input as mentioned below
    From the generated data, print the users who have the desired skill
    Sample Input

    Nrupul cmd
    Prateek js
    Aman ds
    Nrupul python
    Albert js
    Albert react
    Aman algo
    Prateek html
    Nrupul sql

    Sample Data Stored [] - List {} - Key-Value Pairs

    {
      Nrupul : ["cmd", "python", "sql"],
      Prateek: ["js", "html"],
      Aman: ["ds", "algo"],
      Albert: ["js", "react"]
    }

    Sample Output for skill js

    Prateek
    Albert


Nrupul cmd
Prateek js
Aman ds
Nrupul python
Albert js
Albert react
Aman algo
Prateek html
Nrupul sql
*/


Problem -6
 Given an array of string , print the occurrence of each and every character.

Sample Input

String[] names = {"Masai","School"};

Sample Output

M - 1
a - 2
s-1
i -1
S - 1
c - 1
h - 1
o - 2
l - 1


Problem -7
    Create a list of any five tourist places and store it inside an ArrayList. Print the tourist places whose length is >5.

Sample Input

Wayanad
Ooty
Pondichery
Goa
Munnar

Sample Output

Wayanad
Pondichery
Munnar


Problem -8

    Given an array of int , find unique elements

Sample Input

[10,20,30,20,10,40]

Sample Output

30
40


Problem -9

    Given the below array of String, remove repeated words

Sample Input

["Masai","School","is","Awesome","but","Masai","is","intense"]

Sample Output

Masai
School
is 
Awesome
but
intense


Probelm  -10

    Around 50 people are playing Housie Housie in a function. There are prizes if anyone will complete the fastest five numbers in top row, middle row, bottom row. Your task is to use the right collection data structure and generate the data in the below format.

    {
    "top_row" : {"ram","ayush","nrupul"},
    "bottom_row": {"floyd","leo"},
    "middle_row":{"sita","laxman","jaydev","surya"}
    }

    The above data represents the name of the winners. Your task is to calculate the winner in the top_row whose name size is greater than 4. Assume that the data is static . (keyboard input is not necessary)

Sample Output

ayush
nrupul


Problem -11


    Create a class Scores which has the below details
        there is one member variable scores which stores an array of int
        create a method called findScore(int index, int[] scores)  which will print the score based on the index passed
            if the index is found in the array then print the score at that index
            if the index is not found then handle the exception and print a message saying Array index out of Bounds

