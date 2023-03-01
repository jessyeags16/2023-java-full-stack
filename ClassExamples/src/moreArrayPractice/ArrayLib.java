package moreArrayPractice;

import java.util.Arrays;

public class ArrayLib {

	public static void main(String[] args) {
		ArrayLib al = new ArrayLib();
		int[] numbers = new int[10];

		// 1. initialize the array with numbers from 1 to 10
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		System.out.print("This is my og Array: \t\t" + Arrays.toString(numbers));

		System.out.println(" ");

		System.out.println("This is my insertElement Fxn:   " + Arrays.toString(al.insertElement(numbers, 5, 12)));
		
		System.out.println("This is my appendElement fxn: \t" + Arrays.toString(al.appendElement(numbers, 11)));

	}

	public int[] insertElement(int arr[], int position, int value) {

		int[] copy = appendElement(arr, 0);

		// 3. move all elements in the array starting at position to the end
		// 1 space to the right
		for (int i = position; i < arr.length; i++) {
			copy[i + 1] = arr[i];
		}
		// 4.set arr[position] = value;
		copy[position] = value;

		return copy;
	}

	public int[] appendElement(int arr[], int value) {

		// 1. create a new array that is 1 larger that size of arr
		int[] copy = new int[arr.length + 1];

		// 2. copy all elements from arr into the new copy
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
			
		copy[copy.length - 1] = value;

		return copy;
	}
}
