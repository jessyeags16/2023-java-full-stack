package monsterAssignPolymorphismInheritence;

public class WaterMonster extends Monster{
	
	//declaring the private class variable name
	private String name;
	
	//getter for name
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	public String attack() {
		return "Attack with water";
	}
}