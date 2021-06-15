/*
problem - 1
World Test Championship

Description
India & Australia just finished a Test Series, which was part of the inaugural world test championship.
Now, you are given the points of the two teams, print the name of the teams which has more points. If the points of both the teams are same,
the winner is the team which has played lesser number of games. If the number of matches played by the two teams is also same, then print "Play another game!".

Input
The input consists of 4 lines where the first line consists, the first line indicates the points of the India,
the second line consists the points of the Australia, the next line contains the matches played by India, and the final line contains the matches played by Australia.

Constraints
1 < Points < 1500
1 < Matches <= 15

Output
Print the name of the team which has more points, if the points of the two team are same, print the name of the team which has played lesser
number of games, else print "Play another game!".

Sample Input 1
580
500
12 
10
Sample Output 1
India

Sample Input 2
500
500
12 
12
Sample Output 2
Play another game!

Hint
In the first sample test case, the points of India are 580 and that of Australia are 500, therefore the output is India.
In the second test case, the points of Australia & India are same, and both the teams have played the same number of games, therefore, the output is "Play another game!".
*/

import java.util.Scanner;

public class WorldTestChampionship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ind_sc = sc.nextInt();
        int aus_sc = sc.nextInt();
        int ind_matches = sc.nextInt();
        int aus_matches = sc.nextInt();
        if(ind_sc>aus_sc) {
            System.out.println("India");
        }
        else if(ind_sc<aus_sc) {
            System.out.println("Australia");
        }
        else {
            if(ind_matches>aus_matches) {
                System.out.println("India");
            }
            else if(ind_matches<aus_matches) {
                System.out.println("Australia");
            }
            else {
                System.out.println("Play Another Match!");
            }
        }
    }
}
