import java.awt.Color;
import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//Color color = new Color(16777215+num);
		Color c = new Color(num);
		String hex = String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue()); 
		
		int h = Integer.parseInt(hex,16); 
		
		System.out.print(Integer.toBinaryString(h));
		//System.out.println(hex);
		
}
}
