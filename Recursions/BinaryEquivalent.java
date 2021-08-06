Binary Equivalent - Recursive

Description

Given an integer n, you need to find out its binary representation using recursion.

Here multiple test cases exist and the expected time complexity is - O(t*logn) where is t is the number of test cases.

Input

The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 100000) — the number.

Output

For each test case, print the answer: The binary representation of the integer.

Sample Input 1

2
15
128

Sample Output 1

1111
10000000


  
  /*
  import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      String res="";
      String output=binaryValue(n,res);
      String res1="";
      for(int i=output.length()-1; i >=0; i--) res1=res1+output.charAt(i);
      System.out.println(res1);
    }
  }
  
  
  public static String binaryValue(int n, String res){
    if(n==0) return res;
    else{
      res=res+n%2;
      n=n/2;
      return binaryValue(n,res);
    }
  }
  
}
*/
