import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
	      
		System.out.println("Enter weight (kg): ");
		double weight = out.nextDouble();
		System.out.println("Enter height (cm): ");
		double height = out.nextDouble();
		
		double bmi = weight / ((height/100) * (height/100));
		System.out.println(bmi);
		
		if (bmi <= 18.5) {
			System.out.println("Underweight.");
		}
		else if (bmi <= 25.0) {
			System.out.println("Normal weight.");
		}
		else if (bmi <= 30.0) {
			System.out.println("Overweight.");
		}
		else {
			System.out.println("Obesity.");
		}
		
		
	}

}
