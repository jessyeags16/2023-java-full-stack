package arrayPracticeOnMyOwn;

import java.util.Arrays;

public class ArrayOnMyOwn {

	//method for all my print statements
	public void printArray(int[] myArr, String message) {
		System.out.println(message + " \t" + Arrays.toString(myArr));
	}
	
	//Now I want to make a method in order to insert a number
	public int[] insertArray(int[] myArr, int position, int number ) {
		if (position < 0) {
			System.out.println("Error: you must enter a number greater than zero!");
		}
		if (position > myArr.length) {
			System.out.println("Error: Enter a number less than " + myArr.length);
		}
		int[] copy = new int[myArr.length + 1];
		
		for (int i = position; i < myArr.length; i++) {
			copy[i + 1] = myArr[i];
		}
		System.out.println("After Shifting Right: " + Arrays.toString(copy));
		
		copy[position] = number;
		printArray(copy, "New Value Set on Copy");
		
		return copy;
	}
	//appending a value to an array
	public int[] append(int[] numbers, int value) {
		int[] copy = new int [numbers.length];
		
		
	}
		
		

	}


