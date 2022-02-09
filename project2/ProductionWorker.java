public class ProductionWorker extends Employee {
	int shift;
	double hourlyPayRate;
	double numberOfHoursPerMonth;
	public ProductionWorker(String employeeName, String employeeNumber,int year,int month,int day, Address address, int shift,
			double hourlyPayRate, double numberOfHoursPerMonth) {
		super(employeeName, employeeNumber,year,month,day, address);
		this.shift = shifts(shift);
		this.hourlyPayRate = hourlyPayRate;
		this.numberOfHoursPerMonth = numberOfHoursPerMonth;
	}
	public ProductionWorker()
	{
		super();
	}
	public int getShift() {
		return shift;
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	public void setHourlyPayRate(double hourlyPayRate) {
		if(hourlyPayRate <=0)
			System.out.println("Error!!, invalid number");
		else
		this.hourlyPayRate = hourlyPayRate;
	}
	public double getNumberOfHoursPerMonth() {
		return numberOfHoursPerMonth;
	}
	public void setNumberOfHoursPerMonth(double numberOfHoursPerMonth) {
		
		if(( shift==1 && numberOfHoursPerMonth==208)||(shift==2 && numberOfHoursPerMonth==128) ) {
			this.numberOfHoursPerMonth = numberOfHoursPerMonth;
			}
			else
			System.out.println("This Number of hours per month is invalid");
		}

// method to calculate the total salary
public double getTotalSalary()
{ 
  double numberOfHoursPerDay=numberOfHoursPerMonth/26;
  double bonusDayShift=numberOfHoursPerDay-8;
  double bonusNightShift=numberOfHoursPerDay-7;
  double totalSalary=0;
  
  if(shift == 1)
  {
      if(numberOfHoursPerDay==8)	
	         totalSalary=(numberOfHoursPerDay*hourlyPayRate)*26;
      else if( numberOfHoursPerDay>8)
	         totalSalary=(8*hourlyPayRate+bonusDayShift*1.25)*26;
      else
	      System.out.println("Error!!,Day shift worker should at least works 8 hours Daily.");
  }
    	  
    if(shift==2)
    {
      if( numberOfHoursPerDay==7)
    	  totalSalary=(numberOfHoursPerDay*hourlyPayRate)*26;
      else if( numberOfHoursPerDay>7)
    	   totalSalary=(numberOfHoursPerDay*7+bonusNightShift*1.50)*26;
      else
    	  System.out.println("Error!!Night shift worker should at least works 7 hours Daily.");
    }
    return totalSalary;
  }
  
  
//method to check if the shift is 1 or 2 or others.
public int shifts(int shift)
{    int x=0;
	
	if(shift != 1 && shift != 2)
		System.out.println("Error!!,each shift has only one value,1 or 2 others are not included!");
	else
		 x=shift;
	return x;
}
//method to facilitate and clarify the process of writing the info about shifts.
public String shifts()
{
	if(shift==1)
		return" a Day shift";
	else
		return" a Night shift";
}
@Override
public String toString()
{
	return  "The employee's name is: "+employeeName +"\nThe employee's number is: "+employeeNumber+
			"\nThe employee's address is: "+address.toString()+"\nthe employee hire date is :"+hireDate+"\nEmployee works"+shifts()+"\nThe employee's rate per hour is:"+
			hourlyPayRate+"\nThe number of hours the employee worked monthly is:"+numberOfHoursPerMonth+
			"\nThe total salary is:"+getTotalSalary();
			
}
}
