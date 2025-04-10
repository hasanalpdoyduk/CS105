package Hw2;

public class TemperatureGridTrial {


	private double [][] temps;


	public TemperatureGridTrial(double[][] temps) {
		
		this.temps = new double[temps.length][];
		
		for(int i = 0; i < temps.length; i++) {
			
			this.temps[i] = new double[temps[i].length];
			
			for(int j = 0; j < temps[i].length; j++) {
				
				this.temps[i][j] = temps[i][j];
			}
		}
	}



	private double computeTemp(int row, int col) {

		if(((row == 0) || (row == (temps.length - 1))) || ((col == 0) || (col == (temps [row].length-1)))) {
			return temps [row][col]; 
		}
		else {
			return(temps[row][col-1] + temps[row][col+1] + temps[row-1][col] + temps[row+1][col])/4;
		}

	}


	public boolean updateAllTemps(double tolerance) {

		boolean result = true;

		double copyTemps[][] = new double [temps.length][];

		for(int i = 0; i < temps.length; i++) {
			copyTemps[i] = new double [temps[i].length];
			
			for(int j = 0; j < temps[i].length; j++) {
				double updValue = computeTemp(i, j); 
				if (Math.abs(updValue - temps[i][j]) > tolerance) {
					result = false;
				}
				copyTemps[i][j] = updValue;
			}

		}

	for(int i = 0; i < temps.length; i++) {

		for(int j = 0; j < temps[i].length; j++) {
			temps[i][j] = copyTemps [i][j];
		}

	}
	return result; 
	}
}

