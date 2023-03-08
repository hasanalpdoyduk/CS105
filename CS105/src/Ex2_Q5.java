import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
		 
		System.out.println("Please enter the radius of the circle: ");
		double radius = out.nextDouble();
		
		double circumference = 2 * 3.14 * radius;
		
		if (radius < 0)
			System.out.println("Radius cannot be negative. ");
		else 
			System.out.println("Circumference: " + circumference);

		
	}

}
