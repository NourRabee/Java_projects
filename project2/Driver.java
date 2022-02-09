//Nour_Rabee,1191035
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(new ProductionWorker("Huda","111-A",2020,12,3,new Address("AlQuds","Palestine","Ramallah",234),2,5,208));
		emps.add(new ProductionWorker("Nour","999-M",2018,12,7,new Address("Alzahraa","Palestine","Ramallah",332),1,10,230));
		emps.add(new ShiftSupervisor("Loay","124-C",2016,8,11,new Address("AlIrsal","Palestine","Ramallah",342),300,35,10,30));
		emps.add(new ShiftSupervisor("Ahmad","789-A",2019,4,3,new Address("AlQuds","Palestine","Ramallah",234),300,20,40,30));
	    emps.add(new TeamLeader("Najwa","555-G",2019,4,3,new Address("SalahAlDin","Palestine","Ramallah",234),1,8,250,10,6,3));
		emps.add(new TeamLeader("kahled","395-F",2020,3,14,new Address("AlTeireh","Palestine","Ramallah",234),2,7,208,5,6,9));
		
		ListGreaterThanAvg(emps);
	}
	public static void ListGreaterThanAvg(ArrayList<Employee> List)
	{
		double sum=0;
		
				for(int i=0;i<List.size();i++)
				{
				  if(List.get(i) instanceof ProductionWorker)
					sum+=((ProductionWorker) List.get(i)).getTotalSalary();
				  else if(List.get(i) instanceof ShiftSupervisor)
					  sum+=((ShiftSupervisor) List.get(i)).getTotalSalary();
				  else if(List.get(i) instanceof TeamLeader)
					  sum+=((TeamLeader) List.get(i)).getTotalSalary(); 
				}
	double avg=sum/List.size();
    System.out.println("\nThe average of total salary is: "+avg);
    System.out.println();
	           for(int i=0;i<List.size();i++)
	           {
	        	    if(List.get(i) instanceof ProductionWorker && ((ProductionWorker) List.get(i)).getTotalSalary()>avg  )
	        	    {   System.out.println(((ProductionWorker)List.get(i)).toString());
	        	        System.out.println();
	        	    }
	        	    else if(List.get(i) instanceof ShiftSupervisor && ((ShiftSupervisor) List.get(i)).getTotalSalary()>avg )
	        	    { System.out.println(((ShiftSupervisor)List.get(i)).toString());
	        	         System.out.println();
	        	    }
	        	    else if(List.get(i) instanceof TeamLeader && ((TeamLeader) List.get(i)).getTotalSalary()>avg)
	        	    {	System.out.println(((TeamLeader)List.get(i)).toString());
	        	        System.out.println();
	        	    }
	        	    
	           }
	
	}

}
