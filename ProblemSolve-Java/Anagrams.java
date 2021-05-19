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
