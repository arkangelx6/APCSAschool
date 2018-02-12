package Unit2.Assignments;

public class Unit2Assignments {
	
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		double[] dataSet = {7.5, 10, 72.534, 55, 101, 99.952};
		
		for(double x : dataSet){
		circle.setRadius(x);
		circle.calculateArea();
		circle.print();
		}
		
		int[][] dataSet2 = { {1, 9, 14, 2} , {1 ,7, 18, 3}, {6, 4, 2, 2}, {4, 4, 5, 3}, {1, 1, 2, 9} };
		
		Line line = new Line(1, 9, 14, 2);
		for(int[] set : dataSet2){
			line.setCoordinates(set[0], set[1], set[2], set[3]);
			line.calculateSlope();
			line.print();
			
		}
		
		double[] dataSet3 = {98.6, 52.30, 82.45, 75.00, 100.00};
		Fahrenheit f = new Fahrenheit(); 
		
		for(double c: dataSet3){
			f.setFahrenheit(c);
			f.print();
			
		}
		
		
		
	}

}
