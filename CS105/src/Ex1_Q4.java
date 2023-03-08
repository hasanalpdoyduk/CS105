public class Lecture {

	public static void main(String[] args) {
		
		int n = 6547;
		
		int a = n % 10;
		int b = ((n-a) % 100) / 10;
		int c = ((n-b) % 1000) / 100;
		int d = ((n-c) % 10000) / 1000;
		
		int sum = a+b+c+d;

		System.out.println(sum);
		
		
	}

}
