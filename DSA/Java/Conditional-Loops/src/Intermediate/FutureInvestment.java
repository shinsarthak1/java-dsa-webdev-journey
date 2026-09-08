package Intermediate;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double presentValue = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        // FV = PV × (1 + rate)^time
        double futureValue = presentValue * Math.pow(1 + rate/100,time);
        System.out.println("Future Value = " + futureValue);
        sc.close();
    }
}
