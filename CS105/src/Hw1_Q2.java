import java.util.Scanner;

public class Hw1_Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
        	System.out.print("Enter a string: ");
        	String words = input.nextLine().toLowerCase();
        

		int vowelNum = 0;
		int consonantNum = 0;

		for (int i = 0; i < words.length(); i++) {
		    String str = words.substring(i, i+1);
		    if (str.matches("[a-z]")) {
			if (str.matches("[aeiou]")) {
			    vowelNum++;
			} else {
			    consonantNum++;
			}

		    }
		}

		System.out.println("The number of vowels is " + vowelNum);
		System.out.println("The number of consonants is " + consonantNum);
	}
}
