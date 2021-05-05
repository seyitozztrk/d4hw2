package entities;
import java.util.Date;
public class Customer {
private int id;
private String firstname;
private String lastname;
private Date dateofbirth;
private String nationalityid;

public Customer() {
	
}
public Customer(int id, String firstName, String lastName, String identityNumber, Date birthDate) {
	super();
	this.id = id;
	this.firstname = firstName;
	this.lastname = lastName;
	this.nationalityid = identityNumber;
	this.dateofbirth = birthDate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Date getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getNationalityid() {
	return nationalityid;
}
public void setNationalityid(String nationalityid) {
	this.nationalityid = nationalityid;
}
}
