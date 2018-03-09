package Unit11;

public class Grade {
	//add in two constructors
	//add in set and get methods
	//String getLetterGrade()
	//double getNumericGrade()
	//toString method
	private double value;
	
	public Grade(){
		
	}
	
	public Grade(double grade){

			value = grade;
	}
	
	public String getLetterGrade(){
		
		if(value>=90){
			return "A";
		}
		else if(value>=80){
			return "B";
		}
		else if(value>=70){
			return "C";
		}
		else if(value>=60){
			return "D";
		}
		else {
			return "F";
		}
		
	}
	public double getNumericGrade(){
		return value;
		
	}
	public String toString()
	{
		String output="" + getNumericGrade() + getLetterGrade() ;

		



		return output;
	}	
}
