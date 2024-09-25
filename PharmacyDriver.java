import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PharmacyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read text file to make medicine and prescription objects 
		//put prescription objects into pharmacy system array list
		
		//declare array list prescriptionsArray to hold prescription objects 
		ArrayList <Prescription> prescriptionsArray = new ArrayList <Prescription>();
			 
		 
		//read presciptions.txt
		try {
	        File prescriptions = new File("prescriptions.txt");
	        Scanner scan1 = new Scanner(prescriptions);

            String line = scan1.nextLine();

	        while (scan1.hasNextLine()) {
	            line = scan1.nextLine();
	            String[] values = line.split(" ");
	            
	            //determine if the medicine needed is syrup, tablet, or capsule
	            //so you know what constructor to use
	            
	            //make medicine object being requested and then make prescription 
	            //with medicine data member
	            
	            
	            // syrup
	            if (values[0].equals("S")) {
	            	
	            	//concatenate names and birthday to two String values
	            	String name = values[3] + " " + values[4];
	            	String birthday = values[5] + " " + values[6] + " " + values[7];
	            	
	            	//make medicine object
	            	Medicine med = new Syrup(Integer.parseInt(values[2]), values[1]);
	            	
	            	//pass medicine with other values to prescription constructor
	            	Prescription p = new Prescription(name, birthday, med);
	            	prescriptionsArray.add(p);
	            }
	            
	            //tablet
	            else if (values[0].equals("T")) {
	            	String name = values[3] + " " + values[4];
	            	String birthday = values[5] + " " + values[6] + " " + values[7];
	            	
	            	//make medicine object
	            	Medicine med = new Tablet(Integer.parseInt(values[2]), values[1]);
	            	
	            	//pass medicine with other values to prescription constructor
	            	Prescription p = new Prescription(name, birthday, med);
	            	prescriptionsArray.add(p);

	            }
	            
	            //capsule
	            else if (values[0].equals("C")) {
	            	String name = values[3] + " " + values[4];
	            	String birthday = values[5] + " " + values[6] + " " + values[7];
	            	
	            	//make medicine object
	            	Medicine med = new Capsule(Integer.parseInt(values[2]), values[1]);
	            	
	            	//pass medicine with other values to prescription constructor
	            	Prescription p = new Prescription(name, birthday, med);
	            	prescriptionsArray.add(p);
	            }
	        }

	        scan1.close();
	        
	    } catch (FileNotFoundException e1) {
	        e1.printStackTrace();
	    }
		
//---------------------------------------------------------------------------
		
		//read customers.txt --> distribute medicine upon correct ID (name and birthday match)
			try {
				File customers = new File("customers.txt");
				Scanner scan2 = new Scanner(customers);
					
					
				//while there are more lines, execute the instructions in them
				while (scan2.hasNextLine()){
					String line = scan2.nextLine();
					String[] values = line.split(" ");
					String nameInput = values[0] + " " + values[1];
					String birthdayInput = values[2] + " " + values[3] + " " + values[4];
					
					for (int i = 0; i < prescriptionsArray.size(); i++) {					

						//correct name AND birthday
						if ((prescriptionsArray.get(i).getName()).equals(nameInput) && (prescriptionsArray.get(i).getBirthday()).equals(birthdayInput)) {
							// name and birthday match --> distribute medicine
							System.out.println(prescriptionsArray.get(i).getMedicine().distribute() + nameInput);
						}
						
				}
				
		}
				
		//print stock of all medicines
		System.out.println("-----------------------------------------------");
		System.out.println("Remaining Stocks:");
		
		Syrup.reportStock();
		Tablet.reportStock();
		Capsule.reportStock();
		
		
		
		scan2.close();

		}	catch (IOException e){
				System.out.println("An error occured.");
				e.printStackTrace();
			}
		
		
	}



}
