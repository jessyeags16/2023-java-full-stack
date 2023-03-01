package genericsMethodPractice;

public class DemoClass {
	
	//creating a generic method here 
	public <T> void genericsMethod(T data) {
		System.out.println("Generics Method: ");
		System.out.println("Data Passed: " + data);
	}

}
