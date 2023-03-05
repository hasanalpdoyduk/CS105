import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner out = new Scanner(System.in);
		 
		System.out.println("Please enter your grade: ");
		int grade=out.nextInt();
		
		String letterGrade;
		
		if(grade>=85)	
			letterGrade="A";
		
		else if(grade>=70)
			letterGrade="B";
		
		else if(grade>=55)
			letterGrade="C";
		
		else if(grade>=40)
			letterGrade="D";
		
		else
			letterGrade="F";
		
		System.out.println("Your letter grade:" + letterGrade);
		
		
	}

}
