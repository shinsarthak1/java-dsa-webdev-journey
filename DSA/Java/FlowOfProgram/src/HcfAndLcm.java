import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int origA = a;
        int origB = b;

        // HCF using Euclidean Algorithm
        while(b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        int hcf = a;
        int lcm = origA * origB / hcf;

        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
    }
}
