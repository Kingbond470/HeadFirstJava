Traverse a 2D Array

Description

You are given a 2D array(a matrix).

You need to print elements of array in as shown in diagram, on a single line.

Image

Input

First line contains two integers N and M, no of rows and columns of matrix.

Next N lines contains M space separated integers which are elements of matrix.

Constraints

1 <= N*M <= 10^6

1 <= A[i][j] <= 100

Output

Print all elements of matrix on single line, in the order shown in diagram.

Sample Input 1

4 3
1 8 9
2 7 10
3 6 11
4 5 12

Sample Output 1

4 3 2 1 5 6 7 8 12 11 10 9


  
  Problem -2
  Traverse a 2d array - 3

Description

Given a 2D Array, Traverse the 2D array from right to left, and from up to down.

Refer the following image given below for better understanding.

Screenshot (93).png

Input

First line contains two integers N and M, no of rows and columns of matrix.

Next N lines contains M space separated integers which are elements of matrix.

Constraints

1 <= N*M <= 10^6

1 <= A[i][j] <= 100

Output

Print all elements of matrix on single line, in the order as given in the problem statement.

Sample Input 1

4 3
1 8 9
2 7 10
3 6 11
4 5 12

Sample Output 1

9 10 11 12 8 7 6 5 1 2 3 4


  
  Problem -3
  Go in Zig-Zag

Description

Given a matrix with n rows and m columns. Print the matrix elements starting from the top right corner and follow a zig-zag pattern.

Look at the image for better understanding

Image

Input

Input Format

First line contains n and m

Next n line contains m space separated integers which describe each row of the 2d array

Constraints

n,m <=50

Output

Print all matrix elements in a single line separated by spaces.

Sample Input 1

5 5
4 7 1 1 7
8 9 9 6 1
6 4 9 5 1
7 7 4 7 7
8 6 2 5 5

Sample Output 1

7 1 1 7 4 8 9 9 6 1 1 5 9 4 6 7 7 4 7 7 5 5 2 6 8


  
Problem -4
Specific Diagonals

Description

Given a matrix which contains distinct integers and you are given an integer and you need to print both the diagonals crossing through the given element , you can always assume that the given element always exist in the matrix.


image.png


In this 4*4 Matrix, suppose we need to print the diagonal of 11, So the output will be :
1 6 11 16

8 11 14

Note: You need to print the diagonal from top to bottom also make sure you print the diagonals going from left to right first then diagonal going right to left, and print both the diagonals in a new line.

Input

The first line of input will contain two integers R and C , denoting the Rows and Columns of the Matrix.

Next R (rows) lines contain C integers each denoting the matrix elements.

The next line will contain an integer K, denoting the element for which we need to print the diagonals.


Constraints:
1<= R, C <= 100

1<= Matrix[i][j] <= 10^4

1<= K <= 10^4

Output

Output both the diagonals containing the given element , print both the diagonals in a new line and from top to bottom order.

Sample Input 1

3 3
1 2 3
4 5 6
7 8 9
6

Sample Output 1

2 6
6 8

Hint

In Sample 1:
R = 3, C = 3

we need to print the diagonals of 6, also we are printing diagonals from top to bottom and left to right first then right to left , So output will be

2 6 -> left to right diagonal and from top to bottom order

6 8 -> right to left diagonal and from top to bottom order
