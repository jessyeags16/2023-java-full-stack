package coffeeShop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//this is where all of our functionality is, not in main 
public class CoffeeShop implements Comparator<MenuItem> {

	public static final int PRINT_MENU = 1;
	public static final int ORDER_ITEM = 2;
	public static final int VIEW_CART = 3;
	public static final int EXIT = 4;

	// this is a member variable only visible to this class
	// this private member variable can only be accessed from inside the coffee
	// class
	private List<MenuItem> menuItems = new ArrayList<>();

	// this will hold the items in the cart for us
	private List<MenuItem> cart = new ArrayList<>();

	private Scanner scanner = new Scanner(System.in); // member variable

	public void initialize() {
		// doesn't take arguments but creates menu items
		// all four of these menu items are doing the same thing.. just different
		// syntax.

		MenuItem item1 = new MenuItem();
		item1.setName("Small Coffee");
		item1.setPrice(4.30);
		item1.setQuantityInStock(30);

		menuItems.add(item1);

		MenuItem item2 = new MenuItem();
		item2.setName("Large Coffee");
		item2.setPrice(5.99);
		item2.setQuantityInStock(15);

		menuItems.add(item2);

		// we can compress to two lines of code
		MenuItem item3 = new MenuItem("Small Cookie", 9.99, 20);
		menuItems.add(item3);

		// we can compress to one line of code
		menuItems.add(new MenuItem("Sandwich", 15.00, 10));

		menuItems.sort(new Comparator<MenuItem>() {

			@Override
			public int compare(MenuItem o1, MenuItem o2) {
				Double p1 = o1.getPrice();
				Double p2 = o2.getPrice();

				return p1.compareTo(p2);
			}
		});
		//this is doing the same thing as above but in way less code using a lambda
		//notice the :: in the syntax 
		//the elements in the list are of type MenuItem and we are sorting them by the get price method/field
		menuItems.sort(Comparator.comparing(MenuItem::getPrice));
	

	}

	public void printMenuItems() {
		System.out.print("Item Name" + "\tPrice" + "\tQuantity in Stock");
		System.out.println("");
		System.out.print("-----------------------------------------");
		System.out.println("");
		for (MenuItem item : menuItems) {
			System.out
					.println(item.getName() + "\t" + formatPrice(item.getPrice()) + "\t\t" + item.getQuantityInStock());
		}
		System.out.println("-----------------------------------------\n");
	}

	public int menuPrompt() throws CoffeeShopException{
		System.out.println("Welcome to Jess's coffee shop!\n");
		System.out.println(PRINT_MENU + ". Print Menu"); // able to get the static variable without using the . method
		System.out.println(ORDER_ITEM + ". Order Item");
		System.out.println(VIEW_CART + ". Veiw Cart");
		System.out.println(EXIT + ". Exit Coffee Shop");
		System.out.print("\nMake selection: ");

		int selection = scanner.nextInt();
	
		scanner.nextLine();
		
		
		
		System.out.println("");

		return selection;

	}

	public void orderItem() throws CoffeeShopException{
		printMenuItems();

		System.out.print("Enter item name: ");
		String itemName = scanner.nextLine();

		MenuItem selectedItem = findMenuItem(itemName);
		try {
		if (selectedItem.getName() != "Large Coffee" || selectedItem.getName() != "Small Coffee" || selectedItem.getName() != "Small Cookie"|| selectedItem.getName() != "Sandwich") {
			System.out.println(selectedItem.getName() + " added to your cart.\n");
			cart.add(selectedItem);
		} 
		}
			catch(Exception e){
			System.out.println("You must enter a valid menu item! " + e.getStackTrace());
			System.out.println(itemName + " is not a valid selection.\n");
		}
		}
	
	
	// this function combines two activities - checking the itemName exists and
	// returning the menuItem if the itemName does exist
	// in this function the arg itemName represents the user input
	// this is a very common pattern in development
	// if the method returns null, then the item name wasn't found : false = null
	// if the method returns a MenuItem, the itemName was found :
	private MenuItem findMenuItem(String itemName) {
		if (itemName == null) {
			return null;
		}

		itemName = itemName.trim();

		for (MenuItem menuItem : menuItems) {
			String name = menuItem.getName();
			if (name.equalsIgnoreCase(itemName)) {
				return menuItem;
			}
		}
		return null;
	}

	public void viewCart() {
		System.out.println(cart.size() + "items in your cart:\n");

		double totalPrice = 0.0;

		System.out.println("Item Name\tPrice");
		System.out.println("----------------------------");
		for (MenuItem item : cart) {

			System.out.println(item.getName() + "\t" + formatPrice(item.getPrice()));
			totalPrice = totalPrice + item.getPrice();
		}
		System.out.println("----------------------------");

		System.out.println("Total price: " + formatPrice(totalPrice));
		System.out.println("");
	}

	private String formatPrice(double price) {
		DecimalFormat df = new DecimalFormat("$###.00");
		String formattedPrice = df.format(price);

		return formattedPrice;
	}


	@Override
	public int compare(MenuItem o1, MenuItem o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
