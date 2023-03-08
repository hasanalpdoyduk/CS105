import java.util.Locale;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
		out.useLocale(Locale.US);
		
		System .out.println("Enter two numbers: ");
		double number1 = out.nextDouble();
		double number2 = out.nextDouble();
		
		System.out.println("Menu:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nWhich action do you want?");
		int choice = out.nextInt();
		
		if (choice == 1) {
			double lastNumber = number1 + number2;
			System.out.println(lastNumber);
		}
		else if (choice == 2) {
			double lastNumber = number1 - number2;
			System.out.println(lastNumber);
		}
		else if (choice == 3) {
			double lastNumber = number1 * number2;
			System.out.println(lastNumber);
		}
		else if (choice == 4) {
			double lastNumber = number1 / number2;
			System.out.println(lastNumber);
		}
		else {
			System.out.println("Please try again.");
		}
	
	
	}

}
