package libraryAssignmentInterfaces;

public class kidUser implements LibraryUser{
	
	int age = 0;
	String bookType;

	@Override
	public void registerAccount() {
		if (age <= 11) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if (bookType == "Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
		System.out.println("------------------------------------------------------------------");
		
	}

}
