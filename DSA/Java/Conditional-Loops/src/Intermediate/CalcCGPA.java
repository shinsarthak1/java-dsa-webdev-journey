package Intermediate;

import java.util.Scanner;

public class CalcCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0;

        for(int i=1; i<=n; i++){
            sum+= sc.nextDouble();
        }
        double cgpa = sum / n;
        System.out.println("CGPA: "+cgpa);
    }
}
