package genericsMethodPractice2;
//jessica yeager
//2/14/23
//in class example of generics 
//this program takes declares a class that takes two generic variables
	//

public class GMultipleDatatype <DatatypeOne, DatatypeTwo> {
	
	//class variables aka member variables
	DatatypeOne valueOne;
	DatatypeTwo valueTwo;
	
	//constructor 
	public GMultipleDatatype(DatatypeOne v1, DatatypeTwo v2) {
		this.valueOne = v1;
		this.valueTwo = v2;
	}
	
	//getter for Datatypeone
	public DatatypeOne getValueOne() {
		return valueOne;
	}
	
	//setter for data type 1 
		//method called setValueOne that takes a passed in valueOne and assigns it to the class variable valueOne
	public void setValueOne(DatatypeOne valueOne) {
		this.valueOne = valueOne;
	}
	
	public DatatypeTwo getValueTwo() {
		return valueTwo;
	}
	
	public void setValueTwo(DatatypeTwo valueTwo) {
		this.valueTwo = valueTwo;
	}
}
