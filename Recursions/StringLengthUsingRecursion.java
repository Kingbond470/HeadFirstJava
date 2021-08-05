import java.util.*;
public class StringLengthUsingRecursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello World!");
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

/*

input --> rohit
output --> 5
*/
