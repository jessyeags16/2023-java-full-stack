package arrayPracticeOnMyOwn;

public class OnMyOwnMain {

	public static void main(String[] args) {
		
		ArrayOnMyOwn a1 = new ArrayOnMyOwn();
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
		a1.printArray(numbers, "This is our Default Initialization: ");
		
		a1.insertArray(numbers, 2, 1);
	}
		

}
