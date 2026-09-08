import java.util.Scanner;

public class MaxAndMin {
    public static int max(int a,int b,int c){
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
    public static int min(int a,int b,int c){
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum: " + max(a, b, c));
        System.out.println("Minimum: " + min(a, b, c));
    }
}
