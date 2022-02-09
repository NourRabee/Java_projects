public class TeamLeader extends ProductionWorker {
	double monthlyBonus;
	double requiredTrainingHrs;
	double trainingHrsAttended;
	public TeamLeader(String employeeName, String employeeNumber,int year,int month,int day, Address address, int shift,
			double hourlyPayRate, double numberOfHoursPerMonth, double monthlyBonus, double requiredTrainingHrs,
			double trainingHrsAttended) {
		super(employeeName, employeeNumber,year,month,day,address, shift, hourlyPayRate, numberOfHoursPerMonth);
		this.monthlyBonus = monthlyBonus;
		this.requiredTrainingHrs = requiredTrainingHrs;
		this.trainingHrsAttended = trainingHrsAttended;
	}
	public TeamLeader()
	{
		super();
	}
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	public double getRequiredTrainingHrs() {
		return requiredTrainingHrs;
	}
	public void setRequiredTrainingHrs(double requiredTrainingHrs) {
		this.requiredTrainingHrs = requiredTrainingHrs;
	}
	public double getTrainingHrsAttended() {
		return trainingHrsAttended;
	}
	public void setTrainingHrsAttended(double trainingHrsAttended) {
		this.trainingHrsAttended = trainingHrsAttended;
	}
@Override
public double getTotalSalary()
{
	return super.getTotalSalary()+calculateBonus();

}
public double calculateBonus()
{
	return monthlyBonus*trainingHrsAttended/requiredTrainingHrs;
	
}
public String toString()
{
	return super.toString()+"\nThe monthly bonus is:"+monthlyBonus+"\nThe required training hours are: "+requiredTrainingHrs+
	"\nThe training hours Attended are: "+trainingHrsAttended;
}
}
