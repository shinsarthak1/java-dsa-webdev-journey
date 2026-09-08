package Intermediate;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sales = sc.nextDouble();
        double commission = sc.nextDouble();

        double percentage = (commission / sales) * 100;

        System.out.println("Commission = " + percentage + "%");
    }
}
