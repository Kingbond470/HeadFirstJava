/*
you are given a string consisting of lower cased letters and integer n, you have to shift each characters in the string n times.

example:
String -- abc
int n -- 2
 a = a-> b-> c
 b = b-> c-> d
 c = c-> d ->e
 
 output : cde
 
 Sample input
 abz
 2
 
 Sample output
 cda

*/
import java.util.Scanner;

public class ShiftingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = sc.nextInt();

//        String st= "abz";
//        int n=2;

        //String atoz = "abcdefghijklmnopqrstuvwxyz";
      
      //Method 1-----------
        StringBuilder str= new StringBuilder();
        for(int i=0; i<st.length(); i++) {
            int a = (st.charAt(i) - 'a' + n)%26 + 'a';
            char ch = (char)a;
            str.append(ch);
        }
        System.out.println(str);

        //Method 2-----
//        for(int i=0;i<st.length();i++){
//            char s= (char) (st.charAt(i));
//            if(st.charAt(i)==122){
//                s=(char) 96;
//            }
//            s=(char)(s+n);
//
//            str=str+s;
//            // System.out.println(str);
//        }
//        System.out.println(str);


        //Method 3-----
//        for(int i=0; i<st.length(); i++) {
//            for(int j=0; j<atoz.length(); j++) {
//                if(st.charAt(i) == atoz.charAt(j)) {
//                    str += atoz.charAt((j+n)%26);
//                }
//            }
//        }
//        System.out.println(str);
    }
}
