/*
Problem -7
Find the Thief

Description
Recently, a robbery happened at the Royal Bank of Masai. The thief, transferred an amount N into his own account.
The manager has a doubt on three individuals, Person A, Person B, and Person C. You have the account balance of these three individuals.
If the account balance of Person A is greater than N, print "Person A", else if the account balance of Person B is greater than N, print "Person B",
else if the account balance of Person C is greater than N, print "Person C", else print "Not found".

Input
The first line of the input contains the account balance of Person A, the next line contains the account balance of Person B,
and the third line contains the account balance of Person C. The last line of the input contains N, the amount stolen.

Constraints
1000 <= A,B,C,N <= 50000
Output
Print the output as mentioned in the problem statement.

Sample Input 1
30000
12000
43000
31000
Sample Output 1
Person C

Sample Input 2
4000
3000
2000
5000
Sample Output 2
Not found

Hint
In the first sample test case, the account balance of Person C is greater than N i.e. 31000, therefore, the output is "Person C".
In the second sample test case, none of the individuals have an account statement greater than N i.e. 5000, therefore, the output is "Not found".
*/


import java.util.Scanner;
public class FindtheThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(a>n ? "Person A" : b>n ? "Person B" : c>n ? "Person C" : "Not Found");
    }
}
