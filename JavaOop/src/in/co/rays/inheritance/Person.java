package in.co.rays.inheritance;

import java.util.Date;

public class Person {

	protected String name;
	protected String address;
	protected Date dateOfBirth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dateOfBirth;
	}

	public void setDob(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
