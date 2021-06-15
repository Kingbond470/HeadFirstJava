/*
Problem-2
Feel Good Strings

Description
Tom loves vowels. Any string which have half of the characters vowels make him feel good. You are given a string of length N,
where N is an even number. If the number of vowels in the string, are more than or equal to N/2, print "Feel good!", else print "Feel bad!".
(All the letters in the string are in lower case).

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
