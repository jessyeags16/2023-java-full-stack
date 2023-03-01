package decimilFormattingPractice;
//Jessica Yeager 
//2/19/23
//decimal formatting practice on my own!! 


/*
 * trying to pass in a String to decimal format doesn't work!! 
 * 
 * you can format a integer, double, or float, nothing else! 
 * 
 * You must import decimal formatting, look below! 
 * 
 * 
 */

import java.text.DecimalFormat;
import java.util.Arrays;

public class DecimilFormat4Fun {

	public static void main(String[] args) {
		
		float num = 749237.87392f;
		float num2 = 5748294420.57957f;
		Integer numbs = 579473497;
		//String strofnum = "57495798.3475";
		
		//Here I am making a new instance of class DecimalFormat.. 
			// an object called df that 
		DecimalFormat df = new DecimalFormat("$###,###.##");
		String formatted = df.format(num);
		System.out.println(formatted);
		
		String formatThis = df.format(num2);
		System.out.println(formatThis);
		
		String formatMe = df.format(numbs);
		System.out.println(formatMe);
		
		//String formatAString = df.format(strofnum);
		//System.out.println(formatAString);
		
				
		
		
		
		

	}
}


