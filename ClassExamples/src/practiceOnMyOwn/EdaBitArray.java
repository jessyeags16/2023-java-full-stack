package practiceOnMyOwn;

import java.util.Arrays;

public class EdaBitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a function that takes an array
		//the array contains only numbers
		//return the first element
		
		//instantiated array
		int[] numArr = new int[5];
		
		//assign numbers to the array 
		for (int i = 0; i < numArr.length; i++) {
			 numArr[i] = i * 4;

		}
		
			System.out.println(Arrays.toString(numArr));
			System.out.println("The first number in the Array is: " + numArr[0]);

	}

}
