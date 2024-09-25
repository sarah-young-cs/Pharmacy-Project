
public class Prescription {

	//data members
	private String name;
	private String birthday;
	private Medicine medicine;
	
	//constructor
	public Prescription(String n, String b, Medicine m) {
		name = n;
		birthday = b;
		medicine = m;
	}
	
	//get methods
	public String getName() {
		return name;
	}
	public String getBirthday() {
		return birthday;
	}
	public Medicine getMedicine() {
		return medicine;
	}

	
	
}
