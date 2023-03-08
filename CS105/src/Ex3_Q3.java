public class Lecture {

	public static void main(String[] args) {
		
		int sum;
		
		for (int number = 1; number <= 10000; number++) {
					
					sum = 0;
					
					for(int i = 1; i < number; i++) {
						
						if(number % i == 0) {
							
							sum = sum + i;
						}				
					}	
					if(sum == number)
						System.out.println("Perfect number:" + number);
			}
	
		
	}

}
