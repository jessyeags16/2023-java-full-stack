package week2;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExamples ae = new ArrayExamples();
		//ae.createArray();
		ae.randomArray(1, 500, 999);
		
	}

	private void createArray() {
		// TODO Auto-generated method stub
		// we are using a new keyword with the array even tho its a primative
		int[] values = new int[10]; // new array called values of length ten

		// we use () here to create a new object
		String str = new String();

		// we are not using () here becasue we need to specify the array size
		String[] strings = new String[10];

		strings[0] = "a";
		strings[1] = "b";

		// to get a value from the array list we would do
		System.out.println(strings[3]);

		// if we do this with a list..
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");

		// creating an array with constants
		int[] constants = { 1, 5, 7, 9, 10 };

		// first, lets look at old for loop on array
		for (int pos = 0; pos < strings.length; pos++) {
			System.out.println("Position " + pos + " = " + strings[pos]); // pos is our loop counter
		}
		// new for loop, looks much nicer to iterate through
		for (String s : strings) {
			System.out.println(s);

		// the length of an array can be defined as a variable
			int len = 10;
			
		}
	}
	private void randomArray(int smallest, int largest, int length) {
		
		int[] randValues = new int[1000]; //10 positions in my newly instantiated array called randValues of type int
		
		//adding ten random numbers to the list
		for (int i = 1; i <= length; i++) {
			//syntax for making random numbers 
			Random rand = new Random();
			int randomNum = rand.nextInt((largest - smallest) + 1) + smallest;
			
			randValues[i] = randomNum;
			
			System.out.println(randomNum);
			
		}
		int minValue = 
	}

}
