/*
Problem -1

   A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.

Example 2:

Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.

Example 3:

Input: s = "c"
Output: ""
Explanation: There are no nice substrings.

Example 4:

Input: s = "dDzeE"
Output: "dD"
Explanation: Both "dD" and "eE" are the longest nice substrings.
As there are multiple longest nice substrings, return "dD" since it occurs earlier.
*/


import java.util.HashSet;
import java.util.Scanner;

public class NiceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestNiceSubstring(str));
    }

    public static String longestNiceSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i=0; i<s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (int i=0; i<s.length(); i++) {
            var f_char = Character.toLowerCase(s.charAt(i));
            var s_char = Character.toUpperCase(s.charAt(i));
            if (set.contains(f_char) && set.contains(s_char)) {
                continue;
            } else {
                var prev_string = longestNiceSubstring(s.substring(0, i));
                var next_string = longestNiceSubstring(s.substring(i + 1));
                return prev_string.length() >= next_string.length() ? prev_string : next_string;
            }
        }
        return s;
    }
}


/*
  Problem -2
  
    A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3". Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
*/

import java.util.Scanner;

public class shuffledSentence {
    public static void main(String[] aargs) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        String[] str_ar = str.split(" ");
        String[] new_str_ar = new String[str_ar.length];
        for(int i=0; i<str_ar.length; i++) {
            String ar_str = str_ar[i];
            String temp_str = ar_str.substring(0,ar_str.length()-1);
            int index = Integer.parseInt(ar_str.substring(ar_str.length()-1));
            new_str_ar[index-1] = temp_str;
            //numbers are provided in between 1 to 9
        }
        result += new_str_ar[0];
        for(int i=1; i<new_str_ar.length; i++) {
            result += " " + new_str_ar[i];
        }
        System.out.println(result);
    }
}



/*
 Problem -3
  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]
*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class arraySortExceptZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        ar = sortArray(ar);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<ar.length; i++) {
            result.add(ar[i]);
        }
        System.out.println(result);
    }
    public static int[] sortArray(int[] ar) {
        int n = ar.length;
        int[] new_ar = new int[n];
        for(int i=0,j=0; i<n; i++) {
            if(ar[i]!=0) {                     //since every element of array is initialized at 0
                new_ar[j++] = ar[i];
            }
        }
        return new_ar;
    }

}


/*
Problem -4   
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new array.

Example 1:

Input: nums = [1,1,2]
Output:  nums = [1,2]

Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: nums = [0,1,2,3,4]
*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(ar));
    }
    public static List<Integer> removeDuplicates(int[] ar) {
        int n = ar.length;
        HashSet<Integer> set = new HashSet<>();
        for(int a:ar) {
            set.add(a);
        }
        ArrayList<Integer> new_ar = new ArrayList<>();
        int i = 0;
        for(int a:set) {
            new_ar.add(a);
        }
        return new_ar;
    }
}


