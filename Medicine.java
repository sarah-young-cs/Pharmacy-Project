
public abstract class Medicine {
	
	//data members - characteristics of all capsule, tablet, and syrup objects
	private int dosage;
	private String name;
	
	//constructor
	public Medicine(int d, String n) {
		name = n;
		dosage = d;
	}
	
	//get methods
	public int getDosage() {
		return dosage;
	}
	
	public String getName() {
		return name;
	}
	
	//set methods
	public void setDosage(int n) {
		dosage = n;
	}
	public void setName(String n) {
		name = n;
	}
	
	//abstract methods
	public abstract String distribute();


}
