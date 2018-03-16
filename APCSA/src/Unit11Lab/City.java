package Unit11Lab;

public class City {
	
	String cityName;
	Weather weather;
	
	public City(){
		
	}
	public City(String name, double[] temps){
		setName(name);
		setWeather(temps);
		
		
	}
	
	public void setName(String name){
		cityName = name;
	}
	public void setWeather(double[] temps){
		weather = new Weather(temps);
	}
	
	public String getName(){
		return cityName;
	}
	
	public double getAverage(){
		return weather.getAverageTemp();
		
	}
	public double getHighestTemp(){
		return weather.getHighestTemp();
	}
	public double getLowestTemp(){
		return weather.getLowestTemp();
	}
	
	public double getNumberTemps(){
		return weather.getNumberTemps();
	}
	
	
	public String toString(){
		String output = "\n" + cityName + "\n" + weather.toString();
		return output;
	}
}
