package arraypractice;

import java.util.Arrays;

public class ArrayLibraryMain {

	public static void main(String[] args) {

		ArrayLibPractice al = new ArrayLibPractice();

		int[] numbers = new int[10];

		// initialize the arr
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		al.printArray(numbers, "Default initialization");

		// 2. create a function that will insert a number into the array at a position
		try {
			numbers = al.insertElement(numbers, 100, 22);
			al.printArray(numbers, "After element insert");
		} catch (NegativePositionException npe) {
			System.out.println("Negative Position Exception: " + npe.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // this gets executed no matter what
					// this is where you do clean up code
					// an example may be closing a scanner to prevent resource leaking
			System.out.println("This code will be executed in either case no matter what");
		}

		// calling append function
		numbers = al.append(numbers, 12);
		al.printArray(numbers, "Append");

		// numbers = al.deleteElement(numbers, 3);
		// al.printArray(numbers, "I deleted a value here: ");

		int position = al.findPositionofValue(numbers, 11);
		System.out.println("the position of value 11 is " + position);

		al.bubbleSort(numbers);
		int[] sort = al.bubbleSort(numbers);
		al.printArray(sort, "The Sorted array:  ");
	}

}
