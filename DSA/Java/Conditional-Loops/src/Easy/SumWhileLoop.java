package Easy;

import java.util.Scanner;

public class SumWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        while(num != 0){
            sum += num;

            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }
        System.out.println("Sum: "+sum);
    }
}
