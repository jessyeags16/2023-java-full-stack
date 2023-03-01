package coffeeShop;

public class CoffeeShopMain {

	public static void main(String[] args) throws CoffeeShopException {
		// this class does nothing at all

		CoffeeShop cs = new CoffeeShop();
		cs.initialize();

		while (true) { // keeps user in loop until they exit

			int select = cs.menuPrompt();

			if (select == CoffeeShop.PRINT_MENU) {
				cs.printMenuItems();
			}
			if (select == CoffeeShop.ORDER_ITEM) {
				cs.orderItem();
			}
			if (select == CoffeeShop.VIEW_CART) {
				cs.viewCart();
			}
			if (select == CoffeeShop.EXIT) {
				System.out.println("Thank you, please come again!");
				System.exit(0); // tells the JVM to quit with a status code of success
			}

		}
	}
}
