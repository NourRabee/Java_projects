public class Truck extends Vehicles{
private boolean airConditionOn;
private int power;
private int numberOfSeats;

protected Truck() {
	this.airConditionOn=false;//off
}
protected Truck(boolean airConditionOn,int power,int numberOfSeats,String modelName, String modelNo, String brand, String engineType, double tunkSize,
		double fuel_consumption,double cost100km, Owner owner) {
	super(modelName, modelNo, brand, engineType, tunkSize, fuel_consumption,cost100km, owner);
	this.airConditionOn=airConditionOn;
	this.power=power;
	this.numberOfSeats=numberOfSeats;
}
public void setPower(int power) {
	this.power = power;
}
public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}

public boolean getisAirConditionOn() {
	return airConditionOn;
}
public void setAirConditionOn(boolean airConditionOn) {
	this.airConditionOn = airConditionOn;
}
public int getPower() {
	return power;
}
public int getNumberOfSeats() {
	return numberOfSeats;
}
public String toString() {
	return  
			"Model name: "+modelName+" Model number: "+modelNo+" Brand: "+brand+" Engine type: "+engineType+
			" Tunck size: "+tunkSize+ " Fuel consumption:  "+fuel_consumption+ " The condition is: "+airConditionOn+
			" Horse Power of a vehicle's engine"+power+
			" Number of seats are: "+numberOfSeats+" The cost of diesel for 100km is"+cost100km;
}

public double costFor100km(Petroleum diesel) { //The Truck uses only diesel engine.
	
//Fuel consumption of the truck increased by 20% when air-condition is ON
	if(airConditionOn == true)
		fuel_consumption=(fuel_consumption*0.2)+fuel_consumption;
	
       cost100km  = (100/fuel_consumption)*diesel.getDieselprice();
	   return cost100km;
	
	
}
public void  setAirConditionOn() {
	 this.airConditionOn=true;//On
}
public void  setAirConditionOff() {
	this.airConditionOn=false;//Off
}


}
