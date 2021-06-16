/*
Such Six Numbers

Description

You are given   N  integers, your task is to count group of six such numbers among those   N  integers which follow this equation:


Image

d ≠ 0

Input

Input Format :

First line contains integer N

Next N line contains N distinct integers (one integer per line)

Constraints :

1 ≤ N ≤ 100

Numbers present in array range between -30000 and 30000

Output

Output the total number of plausible group of six numbers.

Sample Input 1

3
5
7
10

Sample Output 1

10

Problem -2
Minimum Array Update Required

Description

You are given an array having N integer values. You are also provided an integer K. You can update every element of the array by incrementing it by 1 in 1 second. Your task is to write a program that calculates the minimum time required (in seconds) to make every element of the array greater than or equal to K.

Input

Input Format:

First line of the input contains two integer N and K

Second line contains N elements separated by space.

Constraints:

N < 100000

K < 100000

Output

Output one number, which is the minimum number of steps required to make every element of the array greater than or equal to K.

Sample Input 1

3 4
1 2 5

Sample Output 1

3

*/
  /*
https://oj.masaischool.com/contest/1085/problem/17
*/
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(k>arr[0]?k-arr[0]:0);
  }
}

//Another approach using count
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    
    int max_count=0;
    for(int i=0; i<n; i++){
      int count=0;
      while(arr[i]<k){
        arr[i]++;
       // System.out.print(arr[i]+" ");
        count++;
      }
      if(count>max_count) max_count=count;

    }
     
   System.out.println(max_count);
        

  }
}

//using k-min value of array
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    int min=arr[0];
    for(int i=0; i<n; i++){
		if(arr[i]<min) min=arr[i];
    }
    int min_step=0;
    if(min<k) min_step=k-min;
    System.out.print(min_step);

  }
}
