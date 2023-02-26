public class Lecture {

	public static void main(String[] args) {
		
		int n = 6547;
		
		int a = n % 10;
		int b = ((n-a) % 100) / 10;
		int c = ((n-b) % 1000) / 100;
		int d = ((n-c) % 10000) / 1000;
		
		int sum = a+b+c+d;

		System.out.println(sum);
		
		
		

		double data=1672.98916;
		System.out.println(data);
		
		double data1=data*100;
		System.out.println(data1); //returns 167298.916
		
		int data2=(int)data1;
		System.out.println(data2); //return 167298
		
		double data3=data2/100.0;
		System.out.println(data3);
		
	}

}
