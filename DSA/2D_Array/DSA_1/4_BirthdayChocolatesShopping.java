/*
Problem -4
Birthday Chocolates Shopping
Description
Your birthday is coming, and to celebrate it, you want to give chocolates to all the students of your class. There are M students in your class,
and you have N rupees to spend on the chocolates. Now, you can buy  "Dairy Milk", "Shots" or "Eclairs". The cost of Dairy Milk is 5 Rs per chocolate,
and the cost of Shots is 2 Rs per chocolate, and the cost of Eclairs is 1 Rs per chocolate. You only have N rupees saved from your pocket money, and
you want to buy the most expensive chocolate possible for your classmates.

Print "Dairy Milk", if you can buy M of them within N rupees, else if you can buy M Shots within N rupees, print "Shots", else if you can buy M eclairs
within N rupees, print "Eclairs", else print "No Chocolates".

Input

The first line of input contains N, the amount of money you have. Next line contains M, the number of students in your class.
Constraints
1 <= N <= 200
1 <= M <= 100
Output
Print "Dairy Milk", if you can afford M of them within N rupees, else if you can buy M Shots within N rupees, print "Shots", 
else if you can buy M eclairs within N rupees, print "Eclairs", else print "No Chocolates".

Sample Input 1
100
15
Sample Output 1
Dairy Milk
Sample Input 2
10
15
Sample Output 2
No Chocolates
Hint
In the first sample test cases, you can buy 15 Dairy Milk chocolates, in 75 rupees, and you have 100 rupees to spend, so the answer will be "Dairy Milk".
In the second test case, you cannot buy any of the chocolates in the required quantity of 15, so the output is "No Chocolates"
*/

import java.util.Scanner;
public class BirthdayChocolateShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//Money
        int M = sc.nextInt();//Students
        int dairymilk = 5;
        int shots = 2;
        int eclairs = 1;
        //System.out.println(N/dairymilk>=M ? "Dairy Milk" : N/shots>=M ? "Shots" : N/eclairs>=M ? "Eclairs" : "No Chocolates");
        System.out.println(M*dairymilk<=N ? "Dairy Milk" : M*shots<=N ? "Shots" : M*eclairs<=N ? "Eclairs" : "No Chocolates");
    }
}
