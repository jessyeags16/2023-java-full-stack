package arraypractice;

import java.util.Arrays;

//we built this 2/16 in the AM around 9:45 AM 
//we talked about try catch in the afternoon starting at 3 pm 

public class ArrayLibPractice {

	public void printArray(int[] arr, String message) {
		System.out.println(message + "\t= " + Arrays.toString(arr));
	}

	public int[] insertElement(int[] arr, int position, int value) throws NegativePositionException, PositionToLargeException {
		if (position < 0) {
			throw new NegativePositionException("Position must be greater than 0!");
		}
		if (position > arr.length) {
			throw new PositionToLargeException("Position must be less than " + arr.length);
		}

		int[] copy = append(arr, 0);
		printArray(copy, "Copy Initialized to: ");

		// 3. move all elements in the array starting at position to the end 1 space to
		// the right
		for (int i = position; i < arr.length; i++) { // i copied and pasted from above and changed int i to position
			copy[i + 1] = arr[i];
		}
		// printArray(copy, "Copy shifted Right: ");

		// 4.Insert Element
		copy[position] = value;
		printArray(copy, "New Value Set On Copy");

		// 5.
		return copy;
	}

	// append a value to the end of the array
	public int[] append(int[] numbers, int value) {
		int[] copy = new int[numbers.length];

		copy = Arrays.copyOf(numbers, numbers.length + 1);

		copy[copy.length - 1] = value;

		printArray(copy, "Appending the value: ");
		return copy;

	}

	// deleting an element from the array
	// 1. shift the array starting at position to the end of arr left
	// 2. make a new arr of one size smaller
	// 3. copy arr into your copy arr minus last element

	/*
	 * public int[] deleteElement(int arr[], int position) { int[] copy = new
	 * int[arr.length]; //alter the incoming array first for (int i = position + 1;
	 * i < arr.length; i++) { arr[i - 1] = arr[i]; } int[] copy = new int[arr.length
	 * - 1]; for (int i = 0; i <copy.length; i++) { copy[i] = arr[i];
	 * 
	 * return copy; } }
	 */

	public int findPositionofValue(int arr[], int value) {
		int position = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				position = i;
				break;
			}
		}
		return position;

	}

	// 1 - outer loop that will move across the entire array
	// 2 - inner loop that moves across the entire array
	// 3 - compare element at arr[inner] with arr[inner+1]
	// 4 - if arr[inner] < arr[inner+1] then swap the elements
	// 5 - use a temp variable to store one value
	// 6 - move the other value
	// 7 - put the temp value into the one you just moved
	// 8 - return the array
	public int[] bubbleSort(int arr[]) {

		int temp = 0;

		// an outer loop that move across the entire array
		for (int outer = 0; outer < arr.length; outer++) {

			// an inner loop
			for (int inner = 0; inner < arr.length - 1; inner++) {
				if (arr[inner] < arr[inner + 1]) { // switching < > here, will switch from ascending to descending order
					temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
			}
		}
		return arr;
	}

}