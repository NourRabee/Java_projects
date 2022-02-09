public class Car extends Vehicles {
	
private int numberOfSeats;
private boolean airConditionOn;

protected Car(String modelName, String modelNo, String brand, String engineType,
		double tunkSize,double fuel_consumption,double cost100km,Owner owner,int numberOfSeats,boolean airConditionOn) {
    super(modelName, modelNo, brand, engineType, tunkSize, fuel_consumption,cost100km, owner);
  
	this.airConditionOn=airConditionOn;
	this.numberOfSeats=numberOfSeats;
	
}
protected Car() {
 this.airConditionOn=false;//air condition is off
}
public void setnumberOfSeats(int numberOfSeats) {
	this.numberOfSeats=numberOfSeats;
}
public int getNumberOfSeats() {
	return numberOfSeats;
}
public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}
public boolean isAirConditionOn() {
	return airConditionOn;
}
public void setAirConditionOn(boolean airConditionOn) {
	this.airConditionOn = airConditionOn;
}

public double costFor100km(Petroleum gasoline) {
	
	if(airConditionOn == true)
		fuel_consumption=(fuel_consumption*0.1)+fuel_consumption;
	
       cost100km  = (100/fuel_consumption)*gasoline.getGasolinePrice();
	   return cost100km;
		
}
public  void setAirConditionOn() {
	this.airConditionOn=true;//on
}
public  void  setAirConditionOff() {
	this.airConditionOn=false;//off
}

public String toString() {
	return "Model name: "+modelName+" Model number: "+modelNo+" Brand: "+brand+" Engine type: "+engineType+
			" Tunck size: "+tunkSize+ " Fuel consumption:  "+fuel_consumption+"  Number of seats: "+numberOfSeats+" The condition is :"+airConditionOn+
			" The cost of gasoline for 100km is: "+cost100km;
}

}
