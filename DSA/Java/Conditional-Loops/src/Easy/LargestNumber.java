package Easy;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {

            if (num > largest) {
                largest = num;
            }

            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }

        System.out.println("Largest = " + largest);
    }
}
