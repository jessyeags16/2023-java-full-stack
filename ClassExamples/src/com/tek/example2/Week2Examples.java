package com.tek.example2;
import java.util.Scanner; //import scanner

public class Week2Examples {
	public static void main( String[] args ) {
	
	//create scanner class
	Scanner input = new Scanner(System.in);
	
	//outputs line
	System.out.println("Please input a number: ");
	
	//
	int userNum = input.nextInt();
	
	System.out.println("My user number is " + userNum);
	
	input.close();
		

}
}
