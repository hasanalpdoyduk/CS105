import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        // Take the row and column size input from the user
        System.out.print("Enter the number of rows in the array: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns in the array: ");
        int cols = input.nextInt();
        
        // Create the original array and fill it with user input
        int[][] originalArray = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = input.nextInt();
            }
        }
        
        // Count the number of non-zero rows in the original array
        int nonZeroCount = 0;
        for (int i = 0; i < rows; i++) {
            boolean hasZero = false;
            for (int j = 0; j < cols; j++) {
                if (originalArray[i][j] == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (!hasZero) {
                nonZeroCount++;
            }
        }
        
        // Create the new array
        int[][] newArray = new int[nonZeroCount][cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            boolean hasZero = false;
            for (int j = 0; j < cols; j++) {
                if (originalArray[i][j] == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (!hasZero) {
                for (int j = 0; j < cols; j++) {
                    newArray[index][j] = originalArray[i][j];
                }
                index++;
            }
        }
        
        // Print the original and new array
        System.out.println("Original array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("New array with all non-zero rows:");
        for (int i = 0; i < nonZeroCount; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
