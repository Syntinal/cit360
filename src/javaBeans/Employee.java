package javaBeans;

import java.io.Serializable;


public class Employee implements Serializable {
	
	private int employeeID;
	private String firstName;
	private String lastName;
	private double payRate;
	private static final long serialVersionUID = 1L;
	
	public Employee(int employeeID, String firstName, String lastName,double d) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.payRate = d;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeID;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(payRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeID != other.employeeID)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Double.doubleToLongBits(payRate) != Double
				.doubleToLongBits(other.payRate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName="
				+ firstName + ", lastName=" + lastName + ", payRate=" + payRate
				+ "]";
	}
	
	
	

	


}
