package Unit11;

import Unit11Lab.City;

public class State {
	String stateName;
	City[] cityList;
	
	
	public State(){
		stateName = "";
	}
	
	public State(String name, int cityCount){
		
		cityList = new City[cityCount];
		
	}
	public void addCity(int cityNum, City c){
		
		cityList[cityNum] =  c;
		
		
	}
	
	public double getStateAverage()
	{
		double stateAverage=0.0;
		
		for(City x : cityList){
			stateAverage += x.getAverage();
		}
		stateAverage = (stateAverage/cityList.length);


		return stateAverage;
	}
	
	public double getCityAverage(int cityNum)
	{
		
		return cityList[cityNum].getAverage();
	}

	public double getCityAverage(String cityName)
	{
		double avg = 0;
		for(City x : cityList){
			if(x.getName().equals(cityName)){
				avg = x.getAverage();
			}
		}

		return avg;
	}
	
	public String getCityName(int cityNum)
	{
		return cityList[cityNum].getName();
	}

	public String getCityWithHighestAverage()
	{
		double high = cityList[1].getAverage();
		String hName = "";


		for(City x : cityList){
			if(x.getAverage()> high){
				high = x.getAverage();
				hName = x.getName();
			}
		}
		
		return hName;
	}

	public String getCityWithLowestAverage()
	{
		double low = cityList[0].getAverage();
		String lName ="";		

		for(City x : cityList){
			if(x.getAverage() < low){
				low = x.getAverage();
				lName = x.getName();
			}
		}

		return lName;
	}
	
	public String toString(){
		String output = "" + stateName + "\n";
		
		for(City x : cityList){
			output = output + x.toString() + "\n";
		}
		
		
		output += "\nCity with Lowest Average: " + getCityWithLowestAverage();
		output += "\nCity with Highest Average: " + getCityWithHighestAverage();
		
		return output;
		
		
	}
}
