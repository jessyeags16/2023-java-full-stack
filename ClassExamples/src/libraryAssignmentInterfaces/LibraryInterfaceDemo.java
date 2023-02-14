package libraryAssignmentInterfaces;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		kidUser k = new kidUser();
		k.age = 10;
		k.bookType = "Kids";
		k.registerAccount();
		k.requestBook();
		
		kidUser k1 = new kidUser();
		k.age = 18;
		k.bookType = "Fiction";
		k.registerAccount();
		k.requestBook();
		
		AdultUser a = new AdultUser();
		a.age =5;
		a.bookType = "Kids";
		a.registerAccount();
		a.requestBook();
		
		AdultUser a1 = new AdultUser();
		a.age = 23;
		a.bookType = "Fiction";
		a.registerAccount();
		a.requestBook();
		
	}

}
