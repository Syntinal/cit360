package javaBeans;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int userID;
	private Employee employee;
	private String department;
	
	
	
	public User(int userID, Employee employee, String department) {
		super();
		this.userID = userID;
		this.employee = employee;
		this.department = department;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((department == null) ? 0 : department.hashCode());
		result = prime * result
				+ ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + userID;
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
		User other = (User) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", employee=" + employee
				+ ", department=" + department + "]";
	}
	
	

	
	
	
	
}
