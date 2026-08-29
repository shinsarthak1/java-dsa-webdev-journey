import java.util.Scanner;

public class FrequencyWithArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Create array
        int[] numbers = new int[n];

        // Take array input
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Create frequency array
        int[] frequency = new int[n];

        // Count frequency
        for (int number : numbers) {
            frequency[number]++;
        }

        // Display frequency
        System.out.println("Frequency of each number:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}