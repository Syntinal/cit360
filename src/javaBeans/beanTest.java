package javaBeans;


import java.util.ArrayList;



public class beanTest {
	public static void main(String[] args){
		//Create employee bean
		bean();
		System.out.println(" ");
		
		//Create an ArrayList of Users
		ArrayList<User> userArray = arrayBean();
		
		//Create a one to many relationship using arraylist in the company JavaBean
		oneToMany(userArray);
	}
	
	public static void bean(){
		//Integers cannot be null. Stings can be null.
		//Employee newEmployee1 = new Employee(1, "Nathan", "Wittmann", null);
		Employee newEmployee1 = new Employee(1, "Nathan", "Wittmann", 7.25);
		Employee newEmployee2 = new Employee(2, "Andrew", null, 8.50);
		
		User newUser1 = new User(1, newEmployee1, "Accounting");
		User newUser2 = new User(2, newEmployee2, "Production");
		
		System.out.println(newUser1.toString());
		System.out.println(newUser2.toString());
	}
	
	public static ArrayList<User> arrayBean(){
		ArrayList<User> myUsers = new ArrayList<User>();
		
		//int value cannot be null, string and objects can be null
		
		myUsers.add(new User(1, new Employee(1, "Nathan", "Wittmann", 7.25), "Accounting"));
		myUsers.add(new User(2, new Employee(2, "Andrew", null, 8.50), "Production"));
		myUsers.add(new User(3, new Employee(3, "Ty", "Wittmann", 9.50), "Production"));
		myUsers.add(new User(4, new Employee(4, "Chase", "Wittmann", 9.00), "Production"));
		myUsers.add(new User(5, new Employee(5, "Andrew", null, 7.50), "Accounting"));
		myUsers.add(new User(6,null,null));
		//employee.add(new User(null, new Employee(6, "Andrew", null, 7.50), "Test")));
		//employee.add(new User(null,null,null)); //will not accept null in the UserID parameter
		
		for (int i = 0; i < myUsers.size(); i++){
			System.out.println(myUsers.get(i));
		}
		return myUsers;
	}
		
	public static void oneToMany(ArrayList<User> myUsers){
		
		Company oneToMany = new Company("myCompany", myUsers);
		
		for (int i = 0; i < myUsers.size(); i++){
			System.out.println(oneToMany.getUser().get(i));
		}
	}	
}
