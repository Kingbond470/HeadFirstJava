/*
Problem -1
Result or Tie - Tic Tac Toe

Description

You are given a 3*3 matrix (2-dimensional array) that represents the final situation of a Tic Tac Toe.

Your task is to write a program that finds out the winner in case the match ended in a win. If the winner is 'x', print 'x'(without quotes).

If the winner is 'o', print 'o' (without quotes)

In case the match ended in a tie, print "Tie" (without quotes)

Input

InputFormat

The input contains 3 lines where each line has 3 space separated characters which represent the final status of tic tac toe

Constraints

The input contains either of the 2 alphabets: 'x' and 'o'

Output

Print Tie/x/o depending on the end result of the game.

Sample Input 1

x o x
o x x
o o o

Sample Output 1
*/

//Using For Loop ***************************************************************

package twoDarray;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[][] ar = new String[3][3];//since, it's a tic tac toe --> 3X3 matrix
        String[][] ar = {{"x","o","x"},{"o","x","x"},{"o","o","o"}};
//        for(int i=0; i<ar.length; i++) {
//            for(int j=0; j<ar.length; j++) {
//                ar[i][j] = sc.next();
//            }
//        }
        /*
        x o x
        o x x
        o o o
         */
        String result = "No One";
        int count = 0;
        int sum = 2;
        for(int i=0; i<ar.length; i++) {
            int count_x = 0;
            int count_o = 0;
            for(int j=0; j<ar.length; j++) {
                if(ar[i][j].equals("x")) {
                    count_x++;
                    if(count_x==3) {
                        result = "x";
                        break;
                    }
                    count_o = 0;
                } else if(ar[i][j].equals("o")) {
                    count_o++;
                    if(count_o==3) {
                        result = "o";
                        break;
                    }
                    count_x = 0;
                }
                if(i==j && i>0 && j>0) {
                    if(ar[i][j].equals(ar[i-1][j-1])) {
                        count++;
                    } else count = 0;
                    if(count == 2) {
                        result = ar[i][j];
                        break;
                    }
                }
                if ((i+j==sum) && i>0 && j>0) {
                    if(ar[i][j] == ar[i-1][j+1]) {
                        count++;
                    }
                    else count = 0;
                    if(count == 2) {
                        result = ar[i][j];
                        break;
                    }
                }
            }
            for(int j=0; j<ar.length; j++) {
                if(ar[j][i].equals("x")) {
                    count_x++;
                    if(count_x==3) {
                        result = "x";
                        break;
                    }
                    count_o = 0;
                } else if(ar[j][i].equals("o")) {
                    count_o++;
                    if(count_o==3) {
                        result = "o";
                        break;
                    }
                    count_x = 0;
                }
            }
        }

        System.out.println(result+" Wins");
    }
}

//Using If-Else  ******************************************************************

package twoDarray;

import java.util.Scanner;

public class TicTacToeUsingIF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[][] ar = new String[3][3];//since, it's a tic tac toe --> 3X3 matrix
        String[][] ar = {{"x","o","x"},{"o","x","x"},{"o","o","o"}};
//        for(int i=0; i<ar.length; i++) {
//            for(int j=0; j<ar.length; j++) {
//                ar[i][j] = sc.next();
//            }
//        }
        /*
        x o x
        o x x
        o o o
         */
        if(ar[0][0].equals(ar[0][1]) && ar[0][1].equals(ar[0][2])) {
            System.out.println(ar[0][0]+" wins");
        } else if(ar[1][0].equals(ar[1][1]) && ar[1][1].equals(ar[1][2])) {
            System.out.println(ar[1][0]+" wins");
        } else if(ar[2][0].equals(ar[2][1]) && ar[2][1].equals(ar[2][2])) {
            System.out.println(ar[2][0]+" wins");
        } else if(ar[0][0].equals(ar[1][0]) && ar[1][0].equals(ar[2][0])) {
            System.out.println(ar[0][0]+" wins");
        } else if(ar[0][1].equals(ar[1][1]) && ar[1][1].equals(ar[2][1])) {
            System.out.println(ar[0][1]+" wins");
        } else if(ar[0][2].equals(ar[1][2]) && ar[1][2].equals(ar[2][2])) {
            System.out.println(ar[0][2]+" wins");
        } else if(ar[0][0].equals(ar[1][1]) && ar[1][1].equals(ar[2][2])) {
            System.out.println(ar[0][0]+" wins");
        } else if(ar[0][2].equals(ar[1][1]) && ar[1][1].equals(ar[2][0])) {
            System.out.println(ar[0][2]+" wins");
        } else {
            System.out.println("Tie");
        }
    }
}



/*
Problem -2
Transpose the Matrix

Description

The transpose of a matrix is an operator which flips a matrix over its diagonal, that is it switches the row and column of the matrix by producing another matrix.

See sample test case for better understanding

So, given an array of n rows and m columns, generate the transpose of the matrix.

Input

Input Format:

First line contains two integers n and m

Next n lines contain m integers which represents each row of 2d array

Constraints:

n,m <= 500

Output

Print the transposed array

Sample Input 1

5 4
0 0 0 0
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4

Sample Output 1

0 1 2 3 4 
0 1 2 3 4 
0 1 2 3 4 
0 1 2 3 4
*/

package twoDarray;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
        //int[][] ar = new int[m][n];
        int[][] ar = {{0,0,0,0},{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
//        for(int i=0; i<ar.length; i++) {
//            for(int j=0; j<ar[i].length; j++) {
//                ar[i][j] = sc.nextInt();
//            }
//        }
//        5 4
//        0 0 0 0
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4
        for(int i=0; i<ar[0].length; i++) {
            for(int j=0; j<ar.length; j++) {
                System.out.print(ar[j][i]+" ");
            }
            System.out.println();
        }
    }
}



/*
Problem -3
Rotate By 90

Description

Given a square matrix, turn it by 90 degrees in an anti-clockwise direction

Input

Input Format

First line will contain the number of rows n (same as the number of columns)

After that next n lines will n rows of the matrix.

Constraints

n<=1000

Elements Of the Matrix <= 10000


Output

You have to display the rotated matrix.

Sample Input 1

4
1 2 3 4
5 6 7 8
1 2 3 4
5 6 7 8

Sample Output 1

4 8 4 8
3 7 3 7
2 6 2 6
1 5 1 5 
*/
  
  
import java.util.Scanner;

public class Rotateby90 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int[][] ar = new int[m][m];
//        for(int i=0; i<m; i++) {
//            for(int j=0; j<m; j++) {
//                ar[i][j] = sc.nextInt();
//            }
//        }

        int[][] ar = {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
        for(int i=ar.length-1; i>=0; i--) {
            for(int j=0; j<ar.length; j++) {
                System.out.print(ar[j][i]+" ");
            }
            System.out.println();
        }
    }
}

