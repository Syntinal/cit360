package jsonQCTest;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONStream;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.JSONParser;

import javaBeans.Employee;


public class JsonQCTest {
	
	public static void main(String[] args){
		jsonTest1();
	}
	
	public static void jsonTest1(){
		Employee myEmployeeObject = new Employee(2, "Andrew", null, 8.50);
		
		try {
			
			String jsonString1 = JSONUtilities.stringify(myEmployeeObject);
			System.out.println(jsonString1);
			
			String jsonString2= "{\"EmployeeID\":\"1\",\"firstName\":\"Andrew\",\"lastName\":\"Wittmann\",\"PayRate\":\"12.50\"}";
			HashMap aMap = (HashMap)JSONUtilities.parse(jsonString2);
			int employeeID = Integer.parseInt((String)aMap.get("EmployeeID"));
			String firstName = (String)aMap.get("firstName");
			String lastName = (String)aMap.get("lastName");
			Double payRate = Double.parseDouble((String)aMap.get("PayRate"));
			
			Employee myEmployee = new Employee(employeeID, firstName, lastName, payRate);
			
			System.out.println(myEmployee.toString());
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public static void jsonTest2(){
		//File aFile = new File("test.json");
	}
			
}
