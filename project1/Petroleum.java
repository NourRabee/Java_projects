public class Petroleum {
	
private double gasolinePrice;
private double dieselprice;
public static final int Diesel=1;
public static final int Gasoline=2;

protected Petroleum() {
	this.gasolinePrice=5.23;
	this.dieselprice=4.02;
}

protected Petroleum( double gasolinePrice, double dieselprice) {
	
	this.gasolinePrice = gasolinePrice;
	this.dieselprice = dieselprice;
}

public double getGasolinePrice() {
	return gasolinePrice;
}

public void setGasolinePrice(double gasolinePrice) {
	this.gasolinePrice = gasolinePrice;
}

public double getDieselprice() {
	return dieselprice;
}

public void setDieselprice(double dieselprice) {
	this.dieselprice = dieselprice;
}


}
