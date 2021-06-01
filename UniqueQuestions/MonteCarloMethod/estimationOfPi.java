//estimation of Pi(π) using Monte Carlo Experiment

import java.util.Scanner;
public class estimationOfPi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.5f",estimate_pi(n));
        
    }
    public static double estimate_pi(int n) {
        double points_in_circle = 0;
        double points_in_square = 0;
        for(int i=0; i<n; i++) {
            double x = Math.random();
            double y = Math.random();
            //System.out.println(x+" "+y);
            if(Math.pow(x,2)+Math.pow(y,2) < 1) {
                points_in_circle++;
            }
            points_in_square++;
        }
        //System.out.println(points_in_circle+" "+points_in_square);
        double pi = 4*(points_in_circle/points_in_square);
        return pi;
    }
}
