
/*(The Time class) Design a class named Time. The class contains: 
The data fields hour, minute, and second that represent a time. 
A no-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.) 
A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. (The values of the data fields will represent this time.) 
A constructor that constructs a Time object with the specified hour, minute, and second. 
Three getter methods for the data fields hour, minute, and second, respectively.
 A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10. 

(Hint: The first two constructors will extract the hour, minute, and second from the elapsed time. For the no-arg constructor, the current time can be obtained using System.currentTimeMillis(),
 as shown in Example: ShowCurrentTime.java. Assume that the time is in GMT.)
*/

public class Time{
	
	int hour; 
	int minute;
	int second;
	int milliseconds;
	long currentTime;
	
	public Time(){
		currentTime = System.currentTimeMillis();
	}
	
	public Time(int h, int m, int s){
		h = hour;
		m = minute;
		s = second;
	}
	
	public Time(int date){
		int timeSince = 100*60*60*24*365*58;
		System.out.println(timeSince);
		milliseconds = date;
		
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public void setTime(int h, int m, int s){
		h = hour;
		m = minute;
		s = second;
	}
	public static void main(String[] args) {
		
		Time time = new Time();
		System.out.println(time.currentTime);
		
	}
	
	
	
}