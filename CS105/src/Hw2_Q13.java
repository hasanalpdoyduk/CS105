import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		
		double calculation = 0;
		
		for (double i = 1; i <= n; i++) {
			calculation = calculation + (1 / (i * (i+1)));
			System.out.println(calculation);
		}
		
		
	}

}
