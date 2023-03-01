package genericsMethodPractice;

public class myRunner {

	public static void main(String[] args) {
		//initialize the class with Integer data
		DemoClass dObj = new DemoClass();
		dObj.genericsMethod(25); //passing an int
		dObj.genericsMethod("Per Scholas"); //passing a string in 
		dObj.genericsMethod("2563.5");
		dObj.genericsMethod('H'); //passing in a char

	}

}
