import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting point:");
        int start = sc.nextInt();
        System.out.println("Enter ending point:");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers:");
        for(int num = start; num<=end; num++){
            int orig = num;
            int temp = num;
            int digits = 0;

            while(temp!=0){
                digits++;
                temp /= 10;
            }
            temp = num;
            int sum = 0;
            while(temp!=0){
                int digit = temp % 10;
                sum += (int) Math.pow(digit,digits);
                temp/=10;
            }
            if(sum == orig){
                System.out.print(num+" ");
            }
        }

    }
}
