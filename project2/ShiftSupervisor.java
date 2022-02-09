public class ShiftSupervisor extends Employee {
	double monthlySalary;
	double monthlyBonus;
	double numOfProductsProduced;
	double numOfProductsMustProduced;
	
	public ShiftSupervisor(String employeeName, String employeeNumber,int year,int month,int day, Address address,
			double monthlySalary, double monthlyBonus, double numOfProductsProduced,
			double numOfProductsMustProduced) {
		super(employeeName,employeeNumber,year,month,day,address);
		this.monthlySalary = monthlySalary;
		this.monthlyBonus = monthlyBonus;
		this.numOfProductsProduced = numOfProductsProduced;
		this.numOfProductsMustProduced = numOfProductsMustProduced;
	}
	public ShiftSupervisor()
	{
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	public double getNumOfProductsProduced() {
		return numOfProductsProduced;
	}
	public void setNumOfProductsProduced(double numOfProductsProduced) {
		this.numOfProductsProduced = numOfProductsProduced;
	}
	public double getNumOfProductsMustProduced() {
		return numOfProductsMustProduced;
	}
	public void setNumOfPoductsMustProduced(double numOfPoductsMustProduced) {
		this.numOfProductsMustProduced = numOfPoductsMustProduced;
	}
// method to calculate the total salary.
public double getTotalSalary()
{ 
double totalSalary=0;
	  if(numOfProductsProduced>=numOfProductsMustProduced)
	    	totalSalary=monthlySalary+monthlyBonus;
	  else
		    totalSalary=monthlySalary;
 return totalSalary;
	
}
//method to modify and display the info about the shift supervisors
public String toString()
{
	return "The employee's name is: "+employeeName +"\nThe employee's number is: "+employeeNumber+
			"\nThe employee's address is: "+address.toString()+"\nthe employee hire date is :"+hireDate+"\nThe monthly salary is: "+monthlySalary+"\nMonthly production bonus that produced by team that he/she supervised: "+
			monthlyBonus+"\nNumber of products that produced by team that he/she supervised: "+numOfProductsProduced+
			"\nNumber of products must produced under his/her supervision: "+ numOfProductsMustProduced+"\nThe total salary is :"+
			getTotalSalary();
}
}
