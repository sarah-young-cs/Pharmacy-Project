
public class Syrup extends Medicine{
	
	//initial stocks are 10,000 and 12,000 mL respectively
	private static int syrStock1 = 10000;
	private static int syrStock2 = 12000;
	private int type;
	
	//constructor
	public Syrup(int d, String n) {
		super(d, n);
		if (super.getName().equals("Syrup1")) {
			type = 1;
		}
		if (super.getName().equals("Syrup2")) {
			type = 2;
		}
	}
	
	//static method to print out medicine stock 
	public static void reportStock() {
		System.out.println(syrStock1 + " mL of Syrup 1 in stock.");
		System.out.println(syrStock2 + " mL of Syrup 2 in stock.");

	}	
	
	//method to return a string telling what's distributed
	
		public String distribute() {
			String output = "";
			
			if (type  == 1) {
				if(super.getDosage() * 118 > syrStock1) {
					output = "Syrup 1 not in stock, come back later ";
				}
				else {
					if (super.getDosage() == 1) {
						output = "118 mL (one bottle) of Syrup 1 distributed to ";
						syrStock1 -= 118;
					}
					if (super.getDosage() == 2) {
						output = "236 mL (two bottles) of Syrup 1 distributed to ";
						syrStock1 -= 236;
					}
					if (super.getDosage() == 3) {
						output = "354 mL (three bottles) of Syrup 1 distributed to ";
						syrStock1 -= 354;
					}
					
				}
			}
			if (type == 2) {
				if (super.getDosage() * 118 > syrStock2) {
					output = "Syrup 2 not in stock, come back later ";
				}
					else {
						if (super.getDosage() == 1) {
							output = "118 mL (one bottle) of Syrup 2 distributed to ";
							syrStock2 -= 118;
						}
						if (super.getDosage() == 2) {
							output = "6236 mL (two bottles) of Syrup 2 distributed to ";
							syrStock2 -= 236;
						}
						if (super.getDosage() == 3) {
							output = "354 mL (three bottles) of Syrup 2 distributed to ";
							syrStock2 -= 354;
						}
					
					
				}

			}
		
			return output;
		}


}
