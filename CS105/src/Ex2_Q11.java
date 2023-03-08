import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int total = 0;
		
		if (number1 < number2) {
	
			System.out.println("Start number: " + number1);
			System.out.println("End number: " + number2);

			for (int i = number1; i <= number2; i++) {
				System.out.println(i);
				total = total + i;
			}
			System.out.println("Sum of the numbers between [" + number1 + "," + number2 + "]: "  + total);
		}
		else {
		
			System.out.println("Start number: " + number2);
			System.out.println("End number: " + number1);
			
			for (int i = number2; i <= number1; i++) {
				System.out.println(i);
				total = total + i;
			}
			System.out.println("Sum of the numbers between [" + number2 + "," + number1 + "]: "  + total);
		}
		
			
	}

}
