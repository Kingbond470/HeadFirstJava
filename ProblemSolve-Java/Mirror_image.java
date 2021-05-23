/*
Mirror Image
    Print the mirror image of the given lowercase string ayzb should become zbay
    Note: mirror image does not mean reverse (The mirror image of a is z, b is y, c is x ...)
*/

//Program-1
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
            int n = (int)a;//    --------------------- int n --> will store the ASCII number of given character
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


//Program-2
import java.util.Scanner;

public class MirrorImage_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        mirror(str);
    }
    public static void mirror(String str) {
        //ASCII -- 65(A) to 90(Z)  &&  97(a) to 122(z)
        //char[] ch = str.toCharArray();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            int a = (int)c;//    --------------------- int a --> will store the ASCII number of given character
            if(a>=65 && a<=90) {
                int b = 155-a;//   -------------------  65(A) + 90(Z) = 155
                result = result + (char)b;
            }
            else if(a>=97 && a<=122) {
                int b = 219-a;//   --------------------   97(a) + 122(z) = 219
                result = result + (char)b;
            }
            else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

