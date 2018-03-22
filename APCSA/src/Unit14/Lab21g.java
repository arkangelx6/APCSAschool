package Unit14;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter ac = new AtCounter();
		ac.countAts(0, 0);
		System.out.println(ac.toString());
		AtCounter ac1 = new AtCounter();
		ac1.countAts(2, 5);
		System.out.println(ac1.toString());
		AtCounter ac2 = new AtCounter();
		ac2.countAts(5, 0);
		System.out.println(ac2.toString());
		AtCounter ac3 = new AtCounter();
		ac3.countAts(9, 9);
		System.out.println(ac3.toString());
		AtCounter ac4 = new AtCounter();
		ac4.countAts(3, 9);
		System.out.println(ac4.toString());
		
		//test the code
	}
}