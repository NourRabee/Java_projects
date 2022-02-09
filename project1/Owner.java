import java.util.GregorianCalendar;
public class Owner {
 String  name;
 String resgisterionNo;
 String address;
 String tel;
 GregorianCalendar dateOfRegistration;
 
 public Owner(String name)
 {
	 this.name=name;
 }
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getResgisterionNo() {
	return resgisterionNo;
}
public void setResgisterionNo(String resgisterionNo) {
	this.resgisterionNo = resgisterionNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public GregorianCalendar getDateOfRegistration() {
	return dateOfRegistration;
}
public void setDateOfRegistration(GregorianCalendar dateOfRegistration) {
	this.dateOfRegistration = dateOfRegistration;
}
}
