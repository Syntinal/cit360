package javaBeans;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	private String companyName;
	private ArrayList<User> user;
	
	public Company(String companyName, ArrayList<User> user) {
		super();
		this.companyName = companyName;
		this.user = user;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ArrayList<User> getUser() {
		return user;
	}

	public void setUser(ArrayList<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", user=" + user + "]";
	}

	
	
	
}
