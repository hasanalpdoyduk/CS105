package Hw1;
import java.util.Scanner;

public class Hw1_Q1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter the number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = input.nextInt();

		int[][] originalArray = new int[rows][cols];
		System.out.println("Enter the numbers:");
		System.out.println("(Please enter numbers with a space in between)");

		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
			originalArray[i][j] = input.nextInt();
		    }
		}   

		int nonZero = 0;
        
		for (int i = 0; i < rows; i++) {
		    boolean hasZero = false;
		    for (int j = 0; j < cols; j++) {
			if (originalArray[i][j] == 0) {
			    hasZero = true;
			    break;
				}
		    }
		    if (hasZero == false) {
			nonZero++;
		    }
		}

		int[][] newArray = new int[nonZero][cols];
		int numberIter = 0;

		for (int i = 0; i < rows; i++) {
		    boolean hasZero = false;
		    for (int j = 0; j < cols; j++) {
			if (originalArray[i][j] == 0) {
			    hasZero = true;
			    break;
				}
		    }
		    if (hasZero == false) {
			for (int j = 0; j < cols; j++) {
			    newArray[numberIter][j] = originalArray[i][j];
			}
			numberIter++;
		    }
		}

		System.out.println("Original array:");
		for (int i = 0; i < rows; i++) {
			System.out.print( "[ ");
		    for (int j = 0; j < cols; j++) {
			System.out.print(originalArray[i][j] + " ");

		    }
			System.out.print("]");
		    System.out.println();
		}

		System.out.println("New array with all non-zero rows:");
		for (int i = 0; i < nonZero; i++) {
			System.out.print( "[ ");
		    for (int j = 0; j < cols; j++) {
			System.out.print(newArray[i][j] + " ");
		    }
			System.out.print("]");
		    System.out.println();
		}
		
	}

}
