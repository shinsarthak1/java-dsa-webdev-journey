package Intermediate;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int orig = n;
        int rev = 0;

        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n/=10;
        }
        if (orig == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
