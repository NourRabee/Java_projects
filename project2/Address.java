public class Address {
	private String street;
	private String state;
	private String city;
	private int zipCode;
	
	public Address()
	{
		this.city="Ramallah";
		this.state="Palestine";
		this.street="JalilHarb";
		this.zipCode=000;
				
	}
	
	public Address(String street, String state, String city, int zipCode) {
		super();
		this.street = street;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String toString()
	{
		return "\nName of street: "+street+"\nName of state: "+state+"\nName of city: "+city+"\nThe zip code: "+zipCode;
	}

}
