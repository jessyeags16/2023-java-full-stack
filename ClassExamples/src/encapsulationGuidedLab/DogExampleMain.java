package encapsulationGuidedLab;

public class DogExampleMain extends MyOwnEncapsulationDog{

	public static void main(String[] args) {
		
		MyOwnEncapsulationDog d1 = new MyOwnEncapsulationDog();
		d1.name = "Pheobe";
		d1.setBreed("Poodle");
		d1.setColor("Grey");
		d1.setAge(5);

		MyOwnEncapsulationDog d2 = new MyOwnEncapsulationDog();
		d2.setName("Drake");
		d2.setBreed("Bulldog");
		d2.setColor("White and Tan");
		d2.setAge(3);
		
		System.out.println(d1.doggieInfo());
		
		System.out.println("============================================");
		
		System.out.println(d2.doggieInfo());
		
	}

}
