import java.util.Date;
public class Employee {
 String employeeName;
 String employeeNumber;
 Date hireDate;
 Address address;
 
 public Employee()
 {
	 super();
 }

public Employee(String employeeName, String employeeNumber, int year,int month,int day, Address address) {
	this.hireDate=hireDate(new Date(year-1900,month-1,day));
    this.employeeName = employeeName;
	this.address = address;
    this.employeeNumber= empNum(employeeNumber);
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeNumber() {
	return employeeNumber;
}
public void setEmployeeNumber(String employeeNumber) {
	this.employeeNumber=employeeNumber;
 }

public Date getHireDate() {
	return hireDate;
}
public void setHireDate(Date hireDate) {
	
	this.hireDate=hireDate;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	      this.address=address;
}
//method to check wither the number is valid or not.
public boolean isEmNumValid(String employeeNumber)
{ 
	boolean answer=false;
	if(employeeNumber.length() == 5)
	{
	  for(int i=0;i<employeeNumber.length();i++)
	  {
		  if(employeeNumber.charAt(3)!='-')
			  break;
		  if(employeeNumber.charAt(4)>'A'&& employeeNumber.charAt(4)<'M')
			  break;
		  if(i<3 && employeeNumber.charAt(i)>9 && employeeNumber.charAt(i)<0)
			  break;
	  }
	  answer=true;
	}
	else
	  answer=false;
	return answer;
	}

public String empNum(String employeeNumber)
{ 
	String number=null;
	if(isEmNumValid(employeeNumber)== true)
	       number=employeeNumber;
	    else
	    {
	    	
	    	System.out.println("this employee number is invalid!");
	    }
	return number;
}
public Date hireDate(Date hireDate)
{
	Date date=new Date();
	if(hireDate.getYear()>=120|| hireDate.getMonth()>13 || hireDate.getDay()>26)
		System.out.println("this hire Date is invalid...Please try again.");
	else
		date=hireDate;
	return date;
}

}
