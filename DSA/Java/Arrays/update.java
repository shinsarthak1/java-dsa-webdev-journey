import java.util.Scanner;

public class update {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Array Size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        // Array Input
        System.out.println("Enter "+n+" elements:");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        
        // Index to Update
        System.out.println("Enter index to update:");
        int index = sc.nextInt();

        // Value to update
        System.out.println("Enter new value:");
        int value = sc.nextInt();

        marks[index] = value;

        System.out.println("Updated array:");
        for (int mark : marks) {
            System.out.print(mark+" ");
        }
        sc.close();
    }
}
