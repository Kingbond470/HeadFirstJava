/*
Mirror Image
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
