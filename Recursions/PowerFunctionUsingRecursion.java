/*
Make a Math.pow function using Recursion
*/

import java.util.*;
public class PowerFunctionUsingRecursion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    System.out.println(power(n, p));
  }
  public static int power(int n, int p) {
    if(p == 0) {
      return 1;
    }
    return n*power(n, p-1);
  }
}
