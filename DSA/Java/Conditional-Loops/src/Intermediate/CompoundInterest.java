package Intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100, time);
        double interest = amount - principal;

        System.out.println("Amount= "+amount);
        System.out.println("Compound interest= "+interest);
        sc.close();
    }
}
