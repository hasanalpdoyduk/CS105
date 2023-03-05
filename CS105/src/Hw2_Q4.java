import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
		 
		System.out.println("Please enter a 3-digit number: ");
		int number = out.nextInt();
		
		int firstDigit = number % 10;
		
		int secondDigit = (number/10) % 10;
	
		int thirdDigit = (number/100); 
		
		System.out.println("First Digit: " + firstDigit);
		System.out.println("Second Digit: " + secondDigit);
		System.out.println("Third Digit: " + thirdDigit);
		
		if(firstDigit == thirdDigit)
			System.out.println(number + " is a palindrome number");
		
		else
			System.out.println(number + " is NOT a palindrome number");
		

	}

}
