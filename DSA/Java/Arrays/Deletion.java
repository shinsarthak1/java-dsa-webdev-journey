import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Array Input
        System.out.println("Enter "+n+" elements:");

        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }

        // Index to Delete
        System.out.println("Enter index to delete: ");
        int deleteIndex = sc.nextInt();

        // Shift elements to the left
        for(int i=deleteIndex; i< n-1;i++){
            numbers[i] = numbers[i+1];
        }

        // Print result
        System.out.println("Array after deletion:");
        for(int i=0; i< n-1; i++){
            System.out.print(numbers[i]+" ");
        }
        sc.close();
    }
}
