package Intermediate;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += sc.nextInt();
        }

        double average = (double) sum / n;

        System.out.println("Average Marks = " + average);
    }
}
