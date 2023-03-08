import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		int isPrime = 0;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime++;		
				
			}
		}
		
		if (isPrime == 0){
			System.out.println(number + " is a prime number");

		}
		else {
			System.out.println(number + " is not a prime number");

		}
		
		
	}

}
