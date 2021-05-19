/*
Tickets Booking

Description

You are provided price of three different types of ticket: 1st Class, 2nd class and 3rd class.

Also, you know the number of tickets of each type you need to book. Find total cost you need to pay.

Input

Input Format:

First line contains 3 space separated positive integers which represents prices of 1st class, 2nd class and 3rd class respectively.

Second line contains 3 space separated integers which is the number of tickets you need to buy of 1st class, 2nd class and 3rd class respectively.

Constraints:

All provided numbers <10000

Output

Output one number which is the price of all tickets to be booked.

Sample Input 1

1200 1400 2000
5 6 2

Sample Output 1

18400
*/


import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int f_p = sc.nextInt();
        int s_p = sc.nextInt();
        int t_p = sc.nextInt();
        int f_n = sc.nextInt();
        int s_n = sc.nextInt();
        int t_n = sc.nextInt();
        int total_price = f_p*f_n + s_p*s_n + t_p*t_n;
        System.out.println(total_price);
    }
}



/*
Question - 2
Pay for Phones!

Description

You are given prices of 4 different mobile phones and also provided with the number of each of the phones that you need to buy.

You have with you 150000 units of money. Comment if it is possible to buy those phones or not.

Input

Input Format :

First line contains 4 space separated positive values which are prices of the 4 mobile phones respectively.

Second line contains the quantity/count of each mobile phones that you need to buy


Constraints :

price of each phone < 100000

Output

Output "Possible" (without quotes) if it is possible to buy desired numbers of mobile phones.

Else in all other case, print "Not Possible" (without quotes)

Sample Input 1

10000 20000 15000 5000
2 3 4 3

Sample Output 1

Not Possible
*/

import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] price = new int[4];
        int[] quantity = new int[4];
        int sum = 0;
        for(int i=0; i<4; i++) {
            price[i] = sc.nextInt();
        }
        for(int i=0; i<4; i++) {
            quantity[i] = sc.nextInt();
        }
        for(int i=0; i<4; i++) {
            sum = sum + price[i]*quantity[i];
        }
        if(sum>100000) {
            System.out.println("Not Possible");
        }
        else {
            System.out.println("Possible");
        }
    }
}







/*
Question - 3
World Cup Final

Description

You are given 3 parameters of two different cricket teams in World Cup Final.

First parameter  :  Score

Second parameter :  Score in super over

Third parameter  :  Total number of fours scored in the inning.

If first parameter of any one team is greater than other then that team wins.

If first parameter of both the teams are same, then the team whose second parameter is greater wins the match.

In case the second parameter is also same, then the team that has higher value of third parameter wins the game.

Input

Input Format

First line contains the three discussed parameter for New Zealand

Second line contains three discussed parameters for England

Constraints

All parameters < 10000

Output

Output Format

Output "England" (without quotes) if England wins the game, else print "New Zealand" if New Zealand wins the game.

Sample Input 1

241 15 21
241 15 26

Sample Output 1

England
*/



import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nz_score = sc.nextInt();
        int nz_so = sc.nextInt();
        int nz_4s = sc.nextInt();
        int en_score = sc.nextInt();
        int en_so = sc.nextInt();
        int en_4s = sc.nextInt();
        if(en_score>nz_score || en_score<nz_score) {
            if(en_score>nz_score){
                System.out.println("England Wins");
            }
            else {
                System.out.println("New Zealand Wins");
            }
        }
        else if(en_so<nz_so || en_so>nz_so) {
            if(en_so<nz_so) {
                System.out.println("New Zealand Wins");
            }
            else {
                System.out.println("England Wins");
            }
        }
        else {
            if(en_4s>nz_4s) {
                System.out.println("England Wins");
            }
            else {
                System.out.println("New Zealand Wins");
            }
        }
    }
}



// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int[] nz = new int[3];
//         int[] en = new int[3];
//         for(int i=0; i<3; i++) {
//             nz[i] = sc.nextInt();
//         }
//         for(int i=0; i<3; i++) {
//             en[i] = sc.nextInt();
//         }
//         for(int i=0; i<3; i++) {
//             if(nz[i]>en[i]) {
//                 System.out.println("New Zealand Wins");
//                 break;
//             }
//             if(nz[i]<en[i]) {
//                 System.out.println("England Wins");
//                 break;
//             }
//             if(i==nz.length-1) {
//                 System.out.println("Match tie");
//             }
//         }
//     }
// }

