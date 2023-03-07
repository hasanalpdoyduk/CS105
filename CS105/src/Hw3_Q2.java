public class Lecture {

	public static void main(String[] args) {
		
		int counter = 0;
		int number = 2;
		
		while(counter < 50){
			boolean isPrime = true;
			for (int i = 2; i <= number/2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(number + " ");
				counter++;
			}
			number++;
		}
	
		
	}

}
