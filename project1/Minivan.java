public class Minivan extends Vehicles {

private int numberOfSeats;
private boolean airConditionOn;
private boolean hasAutoDoors;

protected Minivan() {
	this.airConditionOn=false;
}
protected Minivan(int numberOfSeats,boolean airConditionOn,boolean hasAutoDoors,String modelName, String modelNo,
		String brand, String engineType, double tunkSize,double fuel_consumption,double cost100km, Owner owner) {
	super(modelName, modelNo, brand, engineType, tunkSize, fuel_consumption,cost100km, owner);
	
	this.numberOfSeats=numberOfSeats;
	this.airConditionOn=airConditionOn;
	this.hasAutoDoors=hasAutoDoors;
	
}
public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}
public void setHasAutodoors(boolean hasAutoDoors) {
	this.hasAutoDoors = hasAutoDoors;
}

public boolean isAirConditionOn() {
	return airConditionOn;
}
public void setAirConditionOn(boolean airConditionOn) {
	this.airConditionOn = airConditionOn;
}
public int getNumberOfSeats() {
	return numberOfSeats;
}
public boolean isHasAutoDoors() {
	return hasAutoDoors;
}
public  double costFor100km(Petroleum engine) {
  
//The minivan can use engine of both gasoline and diesel. But the fuel consumption is same for both gasoline and diesel.
  
	if(airConditionOn == true)
	 fuel_consumption=(fuel_consumption*0.2)+fuel_consumption; /**Fuel consumption of the Minivan
	                                                             increased by 20% when air-condition is ON*/
	if(engineType.equals("Diesel"))
	cost100km  = (100/fuel_consumption)*engine.getDieselprice();
	else if(engineType.equals("Gasoline"))
	cost100km  = (100/fuel_consumption)*engine.getGasolinePrice();
	   return cost100km;
}
public void  setAirConditionOn() {
	  this.airConditionOn=true;//On
}
public void setAirConditionOff() {
	this.airConditionOn=false;//off
}
public String toString() {
	
	return "Model name: "+modelName+" Model number: "+modelNo+" Brand: "+brand+" Engine type: "+engineType+
			" Tunck size: "+tunkSize+ " Fuel consumption:  "+fuel_consumption+" Number of seats are: "+numberOfSeats+" The condition is: "+
			airConditionOn+" Does it have auto doord? "+hasAutoDoors+" The cost of gasoline for 100km is: "+cost100km;
	
}

}
