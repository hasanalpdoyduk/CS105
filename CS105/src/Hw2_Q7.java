import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
	      
		System.out.println("Enter first student's name: ");
		String name1 = out.next();
		System.out.println("Enter " +  name1 + "'s grade: ");
		int note1 = out.nextInt();
		
		System.out.println("Enter second student's name: ");
		String name2 = out.next();
		System.out.println("Enter " +  name2 + "'s grade: ");
		int note2 = out.nextInt();   
	    
		System.out.println("Enter third student's name: ");
		String name3 = out.next();
		System.out.println("Enter " +  name3 + "'s grade: ");
		int note3 = out.nextInt(); 

		
		if ((note1 > note2) && (note1 > note3)) {
			System.out.println("The highest-grade student is: " + name1 + " (grade: " + note1 + ").");
		}
		else if (note2 > note3) {
			System.out.println("The highest-grade student is: " + name2 + " (grade: " + note2 + ").");
		}
		else
			System.out.println("The highest-grade student is: " + name3 + " (grade: " + note3 + ").");

		
	}

}
