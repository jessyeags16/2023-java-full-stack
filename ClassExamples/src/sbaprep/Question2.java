package sbaprep;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Question2 { // implements whatever interface

	private static final int ARRAY_SIZE = 5;

	// this is a class level variable
	private int[] array;

	Question2() {
		// we need to make a 1 based data structure for an array of size 5
		// an array is 0 based so when we need 5 elements they go from 0 to 4
		// however since we are 1 based .. how many elements do we need

		// the key to this is to ignore the 0th element of the array
		// *********************************** THIS IS IMPORTANT TO ADD 1 to what ever
		// they give you or it will array index out of bound
		array = new int[ARRAY_SIZE + 1];

		// initialize this entire array to a value ... -1
		Arrays.fill(array, -1);

	}

	public static void main(String[] args) {

		Question2 q2 = new Question2();

		int[] avg = { 1, 2, 3, 4, 5, 6, 7 };
		q2.calculateAverage(avg);
		q2.setValue(4);
		// Should print the first message setting the value
		q2.setValue(5);
		// print first message setting value
		q2.setValue(4);
		// print 2nd message because its already been changed
		q2.move(50, 3);
		// print first message
		q2.move(30, 3);
		// print 2nd message
		q2.move(30, 4);
		// print 2nd message

		System.out.println();

	}

	public void calculateAverage(int[] arr) {
		// calculate the average
		// print out a message using system.out.format of the average with
		// decimal format this to show 2 places right of the decimal ( %.2f )
		// include a new line character at the end of the message

		// optional : use a decimal formatter and system.out.println rather than format
		ArrayList<Integer> copy = new ArrayList<>(ARRAY_SIZE);

		for (int i = 0; i < arr.length; i++) {
			copy.add((arr[i]));
		}

		double sum = 0.0;
		double average = 0.0;

		for (int i = 0; i < copy.size(); i++) {
			sum = sum + copy.get(i);
			average = sum / copy.size();
		}
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Here's the average: \t" + df.format(average));
	}

	// this gets implemented in both classes
	public void setValue(int index) {
		// this will be using the class level variable
		// if the value at array[index] == -1 then print a message saying
		// that you set the value to 1
		// otherwise print a message saying that it was already changed
		if (array[index] == -1) {
			array[index] = 1;
			System.out.print("The value was set to 1 \t\t");
		} else {
			System.out.print("The value was already changed...");
		}
		System.out.println(Arrays.toString(array));
	}

	// this is an extra function in one of the classes
	public void move(int value, int id) {
		// if the value at array[id] == -1
		// then print a message saying
		// "Value with id: {id} is moved to {value}"
		// and set the value to 1
		// otherwise print a message saying "Value is already 1"
		if (array[id] == -1) {
			System.out.print("Value with id: " + id + " is moved to " + value);
			array[id] = 1;
		} else {
			System.out.print("Value is already 1 \t\t");
		}
		System.out.println(Arrays.toString(array));
	}

}
