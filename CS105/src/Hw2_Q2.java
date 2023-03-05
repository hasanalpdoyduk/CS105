import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
		 
		System.out.println("Please enter day number:");
		int day=out.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("WRONG DAY NUMBER !!");
		}
		
		if(day == 6 || day == 7)
			System.out.println("WEEKEND");
		
		else if(day >= 1 && day <= 5)
			System.out.println("WEEKDAY");
		

	}

}
