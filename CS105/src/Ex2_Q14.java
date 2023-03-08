import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int count = input.nextInt();
		
		int divisionCounter3 = 0;
		int divisionCounter7 = 0;
		
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter " + i + ". number: ");
			int number = input.nextInt();
			if (number % 3 == 0) {
				divisionCounter3++;
			}
			else if (number % 7 == 0) {
				divisionCounter7++;
			}
		}
		System.out.println("Divisible by 3 count: " + divisionCounter3);
		System.out.println("Divisible by 7 count: " + divisionCounter7);

		
	}

}
