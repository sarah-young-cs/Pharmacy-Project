
public class Capsule extends Medicine{

	private static int capsStock1 = 10000;
	private static int capsStock2 = 20000;
	private int type;

	//constructor
	public Capsule(int d, String n) {
		super(d, n);
		if (super.getName().equals("Capsule1")) {
			type = 1;
		}
		if (super.getName().equals("Capsule2")) {
			type = 2;
		}
	}

	//static method to print out medicine stock 
	public static void reportStock() {
		System.out.println(capsStock1 + " mg of Capsule 1 in stock.");
		System.out.println(capsStock2 + " mg of Capsule 2 in stock.");

	}	


	//method to return a string telling what's distributed

	public String distribute() {
		String output = "";

		if (type  == 1) {
			if(super.getDosage() * 300 > capsStock1) {
				output = "Capsule 1 not in stock, come back later ";
			}
			else {
				if (super.getDosage() == 1) {
					output = "300 mg of Capsule 1 distributed to ";
					capsStock1 -= 300;
				}
				if (super.getDosage() == 2) {
					output = "600 mg of Capsule 1 distributed to ";
					capsStock1 -= 600;
				}
				if (super.getDosage() == 3) {
					output = "9000 mg of Capsule 1 distributed to ";
					capsStock1 -= 900;
				}
			}
		}
		if (type == 2) {
			if(super.getDosage() * 200 > capsStock2) {
				output = "Capsule 2 not in stock, come back later ";
			}
			else {
				if (super.getDosage() == 1) {
					output = "200 mg of Capsule 2 distributed to ";
					capsStock2 -= 200;
				}
				if (super.getDosage() == 2) {
					output = "400 mg of Capsule 2 distributed to ";
					capsStock2 -= 400;
				}
				if (super.getDosage() == 3) {
					output = "800 mg of Capsule 2 distributed to ";
					capsStock2 -= 800;
				}
			}
		}
		return output;
	}

}
