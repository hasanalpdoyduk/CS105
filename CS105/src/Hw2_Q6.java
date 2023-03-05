import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
		 
		System.out.println("Please enter the length of sides of the triangle: ");
		double side1 = out.nextDouble();
		double side2 = out.nextDouble();		
		double side3 = out.nextDouble();
		
		double circumference = side1 + side2 + side3;
		
		if ((side1 + side2) < side3)
			System.out.println("Invalid triangle!");
		else if ((side2 + side3) < side1)
			System.out.println("Invalid triangle!");
		else if ((side1 + side3) < side2)
			System.out.println("Invalid triangle!");
		else
			System.out.println("Cirumference: " + circumference);

		
	}

}
