package Intermediate;

import java.util.Scanner;

public class SumOfNegPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;

            }
            if(n<0){
                negativeSum += n;
            } else if(n%2==0){
                positiveEvenSum +=n;
            } else{
                positiveOddSum +=n;
            }
        }

        System.out.println("Negative Sum = " + negativeSum);
        System.out.println("Positive Even Sum = " + positiveEvenSum);
        System.out.println("Positive Odd Sum = " + positiveOddSum);
        sc.close();
    }
}
