/*
Given a 2D matrix print the elements of matrix in spiral form


Sample Input :-
1 2 3
4 5 6
7 8 9

Sample Output :-
1 4 7 8 9 6 3 2 5

Explanation :-

00 01 02 03 04
10 11 12 13 15
20 21 22 23 24
30 31 32 33 34

ans-
00 10 20 30 31 32 33 34 24 15 04 03 02 01 11 21 22 23 13 12

*/
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      //user input
      int n=sc.nextInt();
      int m=sc.nextInt();
      int[][] arr=new int[n][m];
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          arr[i][j]=sc.nextInt();
        }
      }
      
     int total_element=m*n;
      int count=0;
      int left_col=0, right_col=m-1;
      int bottom_row=n-1, top_row=0;
      while(count<total_element){
        
        //top most unvisited element
        for(int i=top_row; i<=bottom_row && count<total_element; i++){
          System.out.print(arr[i][left_col]+" ");
          count++;
        }
        left_col++;
        
        //bottom most univisited element
        for(int i=left_col; i<=right_col && count<total_element; i++){
          System.out.print(arr[bottom_row][i]+" ");
          count++;
        }
        bottom_row--;
        
        //right most univisited element
        for(int i=bottom_row; i>=top_row && count<total_element; i--){
          System.out.print(arr[i][right_col]+" ");
          count++;
        }
        right_col--;
        
        //top most unvisited element
        
        for(int i=right_col; i>=left_col && count<total_element; i--){
          System.out.print(arr[top_row][i]+" ");
          count++;
        }
        top_row++; 
        
      }
		System.out.println();      
    }//end of test case
  }
}
