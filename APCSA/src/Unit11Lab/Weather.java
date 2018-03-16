package Unit11Lab;

import java.util.ArrayList;
import java.util.Arrays;

public class Weather {

	//ArrayList<Double> temperatures;
	double[] temperatures;
		public Weather(){
			
		}
		public Weather(double[] list){
			setTemperatures(list);
			
		}
		public void setTemperatures(double[] list){
			temperatures = new double[list.length];
			int counter = 0;
			for(Double num : list){
				temperatures[counter] = num;
				counter++;
			}
			
		}
		public double getAverageTemp(){
			
			double sum = 0;
			
			for(Double n : temperatures){
				sum += n;
			}
			
			double average = sum/temperatures.length;
			
			return average;
		}
		
		public double getLowestTemp(){
			double low = temperatures[0];

			for(int i = 0; i< temperatures.length; i++){
				if(temperatures[i] < low){
					low = temperatures[i];
				}
			}

			
			return low;
		}
		
		public double getHighestTemp(){
			double high =temperatures[0];

			for(int i = 0; i< temperatures.length; i++){
				if(temperatures[i] > high){
					high = temperatures[i];
				}
				
			}
				return high;
		}
		public double getNumberTemps(){
			return temperatures.length;
		}
		public String toString(){
			
			String output = "" + Arrays.toString(temperatures);
			output += "\n"+ "Average Temperature: " + getAverageTemp();
			output += "\n"+ "Lowest Temperature: " + getLowestTemp();
			output += "\n"+ "Highest Temperature: " + getHighestTemp();
			
			
			return output;
			
			
			
		}
		
}
