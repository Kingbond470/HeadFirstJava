/*
Problem-15
Decode the message

Description
Your friend sent you an encrypted message consisting of characters A, C, G and T only .You know the decoded message is the longest repetition in the sequence. That is a maximum-length substring containing only one kind of character. Can you decode it?

Input
Input Format
The only input line contains a string of n characters.

Constraints
1 <= n <= 10^6

Output
Print one integer: the length of the longest repetition.

Sample Input 1
ATTCGGGA
Sample Output 1
3

Hint
Sample Input 1 Explanation
In the given string , substring GGG of length 3 is the longest.
*/

import java.util.Scanner;
public class DecodetheMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i-1) == (str.charAt(i))) {
                count++;
                if(count>max) {
                    max = count;
                }
            }
            else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
