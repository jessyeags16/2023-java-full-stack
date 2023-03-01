package coffeeShop;

//this class is called a POJO - Plain Old Java Object.
//could also be referred to as a bean or entity
public class MenuItem {

	// the constructor does not have a return type
	// by default all objects already an empty argument constructor
	//since we created a constructor below for menu item, I now have to provide java with a constructor
	//if you create a constructor you have to give java the default
	public MenuItem() {

	}

	// this constructor takes in 2 parameters that will populate the member
	// variables
	// this function constructor needs to be able to tell the difference between the
	// argument passed in
	// and the member variables of the class itself.
	// by using "this." it specifies the member variable of the class.
	// this. refers to the instance of this class that is in memory.
	 
	public MenuItem(String name, double price, int quantityInStock) {
		this.name = name;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	// these private variables are called member variables
	// because they are defined at the class level meaning
	// they are available to the entire class not just the code block it is defined
	// in
	private String name;
	private double price;
	private int quantityInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

}
