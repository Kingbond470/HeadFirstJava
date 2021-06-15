/*
problem -6
New Year Resolution 2021
Description
You have taken a new year resolution that you will walk a distance of N meters everyday in a park. Now, there are three parks around your area,
Park A, Park B, Park C, and all of them arranged in the form of squares. The walking perimeter is made along the perimeter of the square parks.
You have a weird condition that you will not do more than one round of any park while walking, so you want to select a park whose walking perimeter
is greater than or equal to  N meters.

If the walking area of Park A is more than or equal N meters, print "Park A", else if the walking area of Park B is more than or equal to N meters,
print "Park B", else if the walking area of Park C is more than or equal to N meters, print "Park C", else print "Resolution Failed".

Note : Park A has a higher priority than Park B, while Park B has a higher priority than Park C
Note : The perimeter of a square is given by 4*a, where a is the side of the square.

Input
The first three line of the inputs contain X, Y , Z, the length of the sides of the square parks A, B and C.
The next line contains N, the distance you have decided as your new year resolution.
Constraints
1 <= X,Y,Z <= 10
1 <= N <= 50

Output
Print the output as mentioned in the problem statement.
Sample Input 1
5
6 
7
15
Sample Output 1
Park A

Sample Input 2
1
1
1
10
Sample Output 2
Resolution Failed
Hint
In the first sample test case, the perimeter of the first park is 5*4 = 20, therefore, Park A can be selected to walk 15 meters. Therefore, the output is "Park A".
In the second sample test case, the perimeter of all the parks is 4, therefore no park can be selected to walk 10 meters. Therefore, the output is "Resolution Failed".
*/

import java.util.Scanner;
public class NewYearResolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parkA = sc.nextInt();
        int parkB = sc.nextInt();
        int parkC = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(parkA*4>=d ? "Park A" : parkB*4>=d ? "Park B" : parkC*4>=d ? "Park C" : "Resolution Failed");
    }
}
