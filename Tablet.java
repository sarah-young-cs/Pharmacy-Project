
public class Tablet extends Medicine{
	
	private static int tabStock1 = 50000;
	private static int tabStock2 = 40000;
	private int type;
	
	//constructor 
	public Tablet(int d, String n) {
		super(d, n);
		if (super.getName().equals("Tablet1")) {
			type = 1;
		}
		if (super.getName().equals("Tablet2")) {
			type = 2;
		}
	}
	
	
	//static method to print out medicine stock 
	public static void reportStock() {
		System.out.println(tabStock1 + " mg of Tablet 1 in stock.");
		System.out.println(tabStock2 + " mg of Tablet 2 in stock.");

	}	
	
	
	//method to return a string telling what's distributed

	public String distribute() {
		String output = "";
		
			if (type  == 1) {
				if (super.getDosage() * 200 > tabStock1) {
					output = "Tablet 1 not in stock, come back later ";
				}
				else {
					if (super.getDosage() == 1) {
						output = "200 mg of Tablet 1 distributed to ";
						tabStock1 -= 200;
					}
					if (super.getDosage() == 2) {
						output = "400 mg of Tablet 1 distributed to ";
						tabStock1 -= 400;
					}
					if (super.getDosage() == 3) {
						output = "600 mg of Tablet 1 distributed to ";
						tabStock1 -= 600;
					}	
				
				}

		}
		if (type == 2) {
			if (super.getDosage() * 200 > tabStock2) {
				output = "Tablet 2 not in stock, come back later ";
			}
			else {
				if (super.getDosage() == 1) {
					output = "200 mg of Tablet 2 distributed to ";
					tabStock2 -= 200;
				}
				if (super.getDosage() == 2) {
					output = "400 mg of Tablet 2 distributed to ";
					tabStock2 -= 400;
				}
				if (super.getDosage() == 3) {
					output = "600 mg of Tablet 2 distributed to ";
					tabStock2 -= 600;
				}
			}
		}

	
		return output;
	}
	
}
