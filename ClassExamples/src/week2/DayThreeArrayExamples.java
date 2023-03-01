package week2;

import java.util.Arrays; //we need to import the array lib

public class DayThreeArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Practice
		//First lets make an array 
		int[] demoArray = new int[10]; //array of type int, named demoArray with 10 element spots
		
		//lets try to autofill the array, there is a fill() method for the array lib
		Arrays.fill(demoArray, 2); //this should fill the array with all two's
		System.out.println(Arrays.toString(demoArray)); 
		
		
		//lets try to sort an array!
		//first, lets make a new array of type int
		int array1[] = {1, 3, 7, 5}; //notice the order of my input vs the order of the output
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		
		
		
		
		
		
		
	}

}
