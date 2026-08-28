import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Take array elements
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }

        // Take element to insert
        System.out.println("Enter element to insert:");
        int value = sc.nextInt();

        // Take index
        System.out.println("Enter index where you want to insert:");
        int index = sc.nextInt();

        //create new array with one extra space
        int[] newNumbers = new int[n+1];

        // copy elements before index
        for (int i = 0; i < index; i++) {
            newNumbers[i] = numbers[i];
        }

        // insert new element
        newNumbers[index] = value;

        // Shift remaining elements to the right
        for (int i = index; i < n; i++) {
            newNumbers[i + 1] = numbers[i];
        }
        System.out.println("Array after insertion: ");
        System.out.println(Arrays.toString(newNumbers));

        sc.close();
    }
}
