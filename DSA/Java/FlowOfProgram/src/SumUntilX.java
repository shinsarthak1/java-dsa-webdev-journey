import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.println("Enter a number or x to stop:");
            String input = sc.next();

            if(input.equalsIgnoreCase("x")){
                break;
            }
            int number = Integer.parseInt(input);
            sum+=number;
        }
        System.out.println("The sum is "+sum);
    }
}
