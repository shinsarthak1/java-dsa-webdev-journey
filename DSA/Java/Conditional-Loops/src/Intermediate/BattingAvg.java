package Intermediate;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int runs = sc.nextInt();
        int dismissals = sc.nextInt();

        double average = (double) runs / dismissals;

        System.out.println("Batting Average = " + average);
    }
}
