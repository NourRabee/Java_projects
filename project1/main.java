//1191035_NourRabee
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class main {
 static ArrayList<Vehicles> vList = new ArrayList<>();// i declare the ArrayList "static" because static can reach only static var. or methods.
 //so i can use it in the main"static", and the other static methods.
	public static void main(String[] args) throws FileNotFoundException,CloneNotSupportedException,IOException{
   
		Scanner scan= new Scanner(System.in);//file path
	Petroleum petrol = new Petroleum();
	
	System.out.println("Menu");
	System.out.println("Click 1 for:Read the data about objects from the file “inputdata.txt” and store them in Arraylist\n"
				+ "Click 2 for: Set prices of\n"
				+ "Click 3 for: Print sorted order Vehicles in an ascending order based on costFor100Km\n"
				+ "Click 4 for: Clone Vehicle without owner. "
				+ "(Ask user to choice one object for cloning from Arraylist, after Listing them to user\n"
				+ "Click 5 for: Turn air-condition on\n"
				+ "Click 6 for: Write Output on the “output.txt” file after sort them\n"
				+ "Click 7 for: Exit from System ");
		
	int option = scan.nextInt();
	        switch(option) {
	      
	             case 1:
	                  { 
	                	  File file = new File("inputdata.txt");
	            	      StringBuilder fileContents = new StringBuilder((int)file.length());        

	            	    try (Scanner scanner = new Scanner(file)) {//try here is same as scanner.close();
	            	        while(scanner.hasNextLine()) {
	            	            fileContents.append(scanner.nextLine());
	            	            fileContents.append("\n");
	            	        }
	            	            // fileContents.toString();convert string builder to string
	            	          vList = stringToArrayList(fileContents.toString());
	            	          System.out.println("Reading process from the file, has been done successfuly!");
	            	    }
	                  }
	                  break;
	            case 2:
	             {   
	            	 Petroleum Petrol= new Petroleum();
// i create an object because (setDieselPrice) is an instance method and can't reach a static method except after creating an object(dynamic binding)
	            	 System.out.println("Please enter the cost of Diesel: ");
	            	 double dieselPrice=scan.nextDouble();
	            	 petrol.setDieselprice(dieselPrice);
	            	 System.out.println("Please enter the cost of Gasoline:");
	            	 double gasolinePrice= scan.nextDouble();
	            	 petrol.setGasolinePrice(gasolinePrice);
	            	 System.out.println("setting Prices has done successfuly");
	            	 break;
	             }
	            case 3:
	              {  
	            	 System.out.println("");
	            	 Collections.sort(vList);
	            	 int i=0;
	            	 for (Vehicles obj : vList) {
                         System.out.println((i +  ".") + obj.toString());
                         i++;
	            	 }
	            	 break;
	             }
	            
	            case 4:
	            {	            
	            	System.out.println("choose a vehicle to clone it.");
	            	 int i = 0;
	            	 StringBuilder output = new StringBuilder();
	                    for (Vehicles obj : vList) {
	                        output.append(obj.toString() + "\n");
	                        i++;
	                    }
                     int objToClone= scan.nextInt();
                     while (true) {
                         if(objToClone >= vList.size()){
                             System.out.println("vehicle does not exist!,try once again: ");
                             objToClone = scan.nextInt();
                             continue;
                         }
                     Vehicles vCloned  = (Vehicles) vList.get(objToClone).clone();
                     vCloned.setOwner(null);
                     vList.add(vCloned);
                     System.out.println();
                     break;
                     	            	
	                  }                     
	            }  
	            
	            case 5:
	            {
	            	int i = 0;
                    for (Vehicles obj : vList) {
                            obj.setAirConditionOn();
                            i++;
                    }
                    System.out.println("please reenter option 3 or 4 to chage the calculatoions");
                    break;
	            	
	            }
	            case 6:
	            {
	            	 StringBuilder outputFile = new StringBuilder();
	            	
	                    for (Vehicles obj : vList) {
	                    	
	                    	 outputFile.append(obj.toString() + "\n");
	                    }
	                   java.io.File file   = new java.io.File("output.txt");
	                   if(file.exists()) {
	                	   System.out.println("File already exists!");
	                	   System.exit(0);
	                   }
	                  java.io.PrintWriter out = new  java.io.PrintWriter(file);
	                   out.print(outputFile);
	                   System.out.println("The writing process has been done successfuly!");    
	            	
	            }
	            case 7:
	            {
	            	System.out.println("Thank you!");
	            	System.exit(1);
	            }
	            	}
	    	
	    }
	private static ArrayList<Vehicles> stringToArrayList(String content) throws IllegalArgumentException{
		
		String[] vehicle =content.split("\n");//using .split return an array of Strings.
	try {
		
	        for(int i=0;i<vehicle.length;i++) {
	       String[] commaSplit =vehicle[i].split(",");
		   Vehicles v;
		   
		          if(commaSplit[0].equals("car")) 		   
		        { 
		          v=new Car();	
		          
				  v.setModelName(commaSplit[1]);
		          v.setModelNo(commaSplit[2]);
		          v.setBrand(commaSplit[3]);
		          Owner owner = new Owner(commaSplit[4]);
		          v.setOwner(owner);
		          v.setEngineType(commaSplit[5]);
		          v.setTunkSize(Double.parseDouble(commaSplit[6]));
		          v.setFuel_consumption(Double.parseDouble(commaSplit[7]));
		         ((Car) v).setNumberOfSeats(Integer.parseInt(commaSplit[8]));
		    		          
		        }
		          
		         else if(commaSplit[0].equals("Minivan"))		  
		         {
		        	 v= new Minivan();
		        	  v.setModelName(commaSplit[1]);
			          v.setModelNo(commaSplit[2]);
			          v.setBrand(commaSplit[3]);
			          Owner owner = new Owner(commaSplit[4]);
			          v.setOwner(owner);
			          v.setEngineType(commaSplit[5]);
			          v.setTunkSize(Double.parseDouble(commaSplit[6]));
			          v.setFuel_consumption(Double.parseDouble(commaSplit[7]));
			         ((Minivan) v).setNumberOfSeats(Integer.parseInt(commaSplit[8]));
			         if(commaSplit[9].equals("true"))
			        	 v.setAirConditionOn();
			         else
			        	 v.setAirConditionOff();
		         }
		          
		  
		         else if(commaSplit[0].equals("Truck"))
		         {
		        	 v= new Truck();
		        	 v= new Minivan();
		        	  v.setModelName(commaSplit[1]);
			          v.setModelNo(commaSplit[2]);
			          v.setBrand(commaSplit[3]);
			          Owner owner = new Owner(commaSplit[4]);
			          v.setOwner(owner);
			          v.setEngineType(commaSplit[5]);
			          v.setTunkSize(Double.parseDouble(commaSplit[6]));
			          v.setFuel_consumption(Double.parseDouble(commaSplit[7]));
			          ((Truck)v).setNumberOfSeats(Integer.parseInt(commaSplit[8]));
			          ((Truck)v).setPower(Integer.parseInt(commaSplit[9]));
			   //   i used casting several times, because(power,setNumberOfSeats) are not defined in the Vehicles class.
		         }
		         else
		         { 
		        	 throw new IllegalArgumentException("Error! invalid answer,try again.");
		         }
		         
		         vList.add(v);    
	    }
}
		
	           catch(IllegalArgumentException e)
	           {
	        	   System.out.println(e.getMessage());
	        	  
	           }
		return vList;
	}		
}
