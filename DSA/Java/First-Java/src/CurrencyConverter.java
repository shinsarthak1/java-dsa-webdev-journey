import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency in rupees:");
        double rupees = sc.nextDouble();
        double exchangeRate = 0.0105914;
        double usd = rupees * exchangeRate;

        System.out.println("Amount in USD: $" + usd);
        sc.close();
    }
}
