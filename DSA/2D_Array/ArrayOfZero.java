Array of Zeroes

Description

You have an array of non-negative integers. You can perform one operation on it in which you can choose i-th index with 0 <= i < n and subtract 1 from both i-th and (i+1) th index of array.

Your task is to write a program that can comment if it is possible to get an array of all zeros after several operations.

Input

Input Format

The first line of test case is a number N. (0 < N <= 10000) The next line is N non-negative integers, 0 <= a_i <= 109

Constraints

0 < N <= 10000

Output

Output Format

If it can be modified into all zeros with several operations output “YES” in a single line, otherwise output “NO” instead.

Sample Input 1

2
1 2

Sample Output 1

NO

Sample Input 2

2
2 2

Sample Output 2

YES

Problem -2
  String & Matrix

Description

You are given a matrix of characters. The matrix has N rows and M columns. Given a string s, you have to tell if it is possible to generate that string from the given matrix.

Rules for generating string from the matrix are:

1. You have to pick the first character of string from row 1, the second character from row 2 and so on. The (N+1)th character of the string is to be picked from row 1, that is, you can traverse the rows in a cyclic manner (row 1 comes after row N).

2. If an occurrence of a character is picked from a row, you cannot pick the same occurrence again from that row.

You have to print Yes if a given string can be generated from the matrix using the given rules, else print No.

Input

Input Format

First line consists of T, denoting the number of test cases.

Each test case consists of:

First line consists of two integers N and M, denoting the matrix dimensions.

Following N lines consist of M characters each.

The last line consists of a string s.

Constraints

T <= 5

N,M <= 500

Length of string < N*M

The matrix consists of lowercase English characters.

String s consists of lowercase English characters.

Output

For each test case, print "Yes" if the string can be generated else print "No". Answer for each test case should come in a new line.

Sample Input 1

1
3 3
aba
xyz
bdr
axbaydb

Sample Output 1

Yes

Hint

Sample 1 Explanation

We pick "a" from row 1. Now, we can only pick one more "a" from row 1 as one "a" is already used.

Similarly, "x" from row 2, "b" from row 3.

Now, we again go back to row 1.

We pick "a" from row 1, "y" from row 2 and so on.


