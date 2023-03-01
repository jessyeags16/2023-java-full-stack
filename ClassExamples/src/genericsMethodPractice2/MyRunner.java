package genericsMethodPractice2;

public class MyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize a generic class
		GMultipleDatatype<String, Integer> mObj = new GMultipleDatatype("Per Scholas", 11025);
			System.out.println(mObj.getValueOne());
			System.out.println(mObj.getValueTwo());
			
		//initialize a generic class with string and int data
		GMultipleDatatype<String, String> mObj2 = new GMultipleDatatype("Per Scholas", "Non Profit");
			System.out.println(mObj2.getValueOne());
			System.out.println(mObj2.getValueTwo());
		}

	}


