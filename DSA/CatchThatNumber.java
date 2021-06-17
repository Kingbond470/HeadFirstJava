/*
You are given an infinite matrix whose upper-left square starts with 1. Here are the first five rows of the infinite matrix :

1    2    9    10  25
4    3    8    11  24
5    6    7    12  23
16   15   14   13  22
17   18   19   20  21

  
^  --> up
|  --> down
-> --> left to right
<- --> right to left

1  ->  2      9  ->  10    25
       |      ^       |     ^
4  <-  3      8      11    24
|             ^       |     ^
5  ->  6  ->  7      12    23
                      |     ^
16  <- 15  <- 14  <- 13    22
|                           ^
17  -> 18  -> 19  -> 20 -> 21
  
Your task is to find out the number in presents at row x and column y after observing a certain kind of patter present in the matrix


Input
Input Format

The first input line contains an integer t: the number of test cases

After this, there are t lines, each containing integer x and y

Constraints

1 <= t <= 10^5

1 <= x,y <= 10^9


Output
For each test, print the number presents at xth row and yth column.


Sample Input 1 

3
2 3
1 1
4 2
Sample Output 1

8
1
15

*/

