package inheritencepractice;

public class AnimalsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Cat c = new Cat("Oscar", 8, 'M', "Taste of the Wild", "Wood Pellet Litter");
	c.iEat();
	c.iSleep();
	c.iPoop();
	c.myLitter();
	c.meetMe();
	
	System.out.println("++++++++++++++++++++++++++++++++++++++");
	
	Cat c1 = new Cat("Cynthia", 2, 'F', "Friskies", "Crystal Cat Litter");
	c1.meetMe();
	
	
	

		
		
		

	}

}
