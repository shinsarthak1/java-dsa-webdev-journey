import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Enter columns
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        // Taking input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing matrix
        System.out.println("Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}