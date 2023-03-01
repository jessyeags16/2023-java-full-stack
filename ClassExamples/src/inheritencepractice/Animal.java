package inheritencepractice;

public class Animal {
	static String name;
	static Integer age;
	static Character sex;
	
	public Animal(String name, Integer age, Character sex) {
		
	}
	
	public Animal() {
		//give java a generic since I am making my own! 
	}
	
	public void iPoop() {
		System.out.println("Every animal poops, silly!");
	}
	
	public void iEat() {
		System.out.println("I eat some generic AZZ dog food!");
	}
	public void iSleep() {
		System.out.println("I sleep about 8 hours a day!");
	}
	

}
