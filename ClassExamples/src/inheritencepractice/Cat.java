package inheritencepractice;

public class Cat extends Animal {
	String name;
	Integer age;
	Character sex;
	
	//just for cat!
	String catFood;
	String litterType;
	
	public Cat(String name, Integer age, Character sex, String catFood, String litterType) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.catFood = catFood;
		this.litterType = litterType;	
	}
	public Cat() {
		//this has to be here since I made my own constructor!!!! 
	}
		@Override
		public void iSleep() {
			System.out.println("I sleep about 16 hours a day... Because I am a King!");
		}
		@Override
		public void iEat() {
			System.out.println("I eat some generic AZZ cat food!");
		}
		public void myLitter() {
			System.out.println("I use some fancy " + litterType);
		}
		public void meetMe() {
			System.out.println("Hi, my name is: " + name + ".\nI am " + age + " years old!\n" + "I eat " + catFood +"!\t Please don't buy me any other brands... ");
			
		}
			
		
	}
	
	
	
	
	
	
	


