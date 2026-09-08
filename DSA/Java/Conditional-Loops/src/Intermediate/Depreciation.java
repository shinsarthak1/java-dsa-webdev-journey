package Intermediate;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double depreciation = (value * rate * time) / 100;
        double finalValue = value - depreciation;

        System.out.println("Depreciation = " + depreciation);
        System.out.println("Final Value = " + finalValue);
    }
}
