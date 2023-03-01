package encapsulationGuidedLab;

public class MyOwnEncapsulationDog {

	 String name;
	private Integer age;
	private String breed;
	private String color;

	// make a constructor for dog!
	public MyOwnEncapsulationDog(String name, Integer age, String breed, String color) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.color = color;
	}

	public MyOwnEncapsulationDog() {
		// make a default! Java isn't going to give me one since I made my own constructor ...
	}

	// Lets make our getters and setters!
	// remember! they have to be public so other classes can use them!
	// get is going to get and return our passed in value!!
	// set is going to be void, and simply this this.classVariable = the passed in
	// variable!!

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String doggieInfo() {
		return "Hi my name is " + name + " and I am a: " + breed + "\nI am " + age + " years old!";
	}

}
