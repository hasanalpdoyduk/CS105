import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
		 
		System.out.println("Please enter the temperature (F): ");
		
		int fahrenheit = out.nextInt();
		double celcius = (fahrenheit - 32) / 1.8;
		
		System.out.println(celcius);

				
	}

}
