import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < input.length(); i++) {
            String ch = input.substring(i, i+1);
            if (ch.matches("[a-z]")) {
                if (ch.matches("[aeiou]")) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of consonants is " + consonantCount);
    }
}
