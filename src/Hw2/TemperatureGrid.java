package Hw2;

public class TemperatureGrid {
    
    private double[][] temps;
    
    public TemperatureGrid(double[][] temps) {
    	
        this.temps = temps;
    }
    
    
    private double computeTemp(int row, int col) {
    	
        if (row == 0 || row == temps.length - 1 || col == 0 || col == temps[0].length - 1) {
            return temps[row][col];
        } 
        else {
            double sum = temps[row - 1][col] + temps[row + 1][col] + temps[row][col - 1] + temps[row][col + 1];
            double avg = sum / 4.0;
            return avg;
        }
    }
    
    
    public boolean updateAllTemps(double tolerance) {
    	
    	int numRows = temps.length;
    	int numCols = temps[0].length;

        double[][] newTemps = new double[numRows][numCols];
        boolean allWithinTolerance = true;
        
        for (int row = 0; row < temps.length; row++) {
            for (int col = 0; col < temps[0].length; col++) {
            	
                double newTemp = computeTemp(row, col);
                newTemps[row][col] = newTemp;
                
                double oldTemp = temps[row][col];
                
                if (Math.abs(newTemp - oldTemp) > tolerance) {
                    allWithinTolerance = false;
                }
            }
        }
        
        temps = newTemps;
        
        return allWithinTolerance;
    }
    
}