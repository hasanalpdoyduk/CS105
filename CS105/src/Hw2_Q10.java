import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total1 = 0;
		int total2 = 0;
		int counter1 = 0;
		int counter2 = 0;
		
		
		// while loop
		
		while (total1 < 100) {
			System.out.println("Enter an integer: ");
			int value = input.nextInt();
			counter1 += 1;
			total1 = total1 + value;
		}
		
		System.out.println("Total: " + total1);
		System.out.println("Number count: " + counter1);
		double avg1 = (double) total1 / counter1;
		System.out.println("Avg: " + avg1);
	
	
		// do_while loop
		
		do {
			System.out.println("Enter an integer: ");
			int value = input.nextInt();
			counter2 += 1;
			total2 = total2 + value;
		} 
		while (total2 < 100);
		
		System.out.println("Total :" + total2);
		System.out.println("Number count :" + counter2);
		double avg2 = (double) total2 / counter2;
		System.out.println("Avg: " + avg2);
		
			
	}

}
