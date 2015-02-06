package jsonQCTest;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONStream;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.JSONParser;

import javaBeans.Employee;


public class JsonQCTest {
	
	public static void main(String[] args){
		File aFile = new File("test.json");
		Employee testEmployee = jsonTest1();
		jsonTest2();
		jsonOutputStreamTest(testEmployee, aFile);
		jsonInputStreamTest(aFile);
	}
	
	public static Employee jsonTest1(){
		System.out.println("Test1");
		Employee myEmployeeObject = new Employee(2, "Andrew", "Wittmann", 8.50);
		Employee myEmployee = null;
		try {
			
			String jsonString1 = JSONUtilities.stringify(myEmployeeObject);
			System.out.println(jsonString1);
			
			String jsonString2= "{\"EmployeeID\":\"1\",\"firstName\":\"Andrew\",\"lastName\":\"Wittmann\",\"PayRate\":\"12.50\"}";
			HashMap aMap = (HashMap)JSONUtilities.parse(jsonString2);
			int employeeID = Integer.parseInt((String)aMap.get("EmployeeID"));
			String firstName = (String)aMap.get("firstName");
			String lastName = (String)aMap.get("lastName");
			Double payRate = Double.parseDouble((String)aMap.get("PayRate"));
			
			myEmployee = new Employee(employeeID, firstName, lastName, payRate);
			
			System.out.println(myEmployee.toString());
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return myEmployee;
	}
	//Nulls only work for strings
	public static void jsonTest2(){
		System.out.println("Test2");
		Employee myEmployeeObject = new Employee(2, "Andrew", null, 8.50);
		Employee myEmployee = null;
		try {
			
			String jsonString1 = JSONUtilities.stringify(myEmployeeObject);
			System.out.println(jsonString1);
			
			String jsonString2= "{\"EmployeeID\":\"1\",\"firstName\":\"Andrew\",\"lastName\":\"Wittmann\",\"PayRate\":\"12.50\"}";
			HashMap aMap = (HashMap)JSONUtilities.parse(jsonString2);
			int employeeID = Integer.parseInt((String)aMap.get("EmployeeID"));
			String firstName = (String)aMap.get("firstName");
			String lastName = (String)aMap.get("lastName");
			Double payRate = Double.parseDouble((String)aMap.get("PayRate"));
			
			myEmployee = new Employee(employeeID, firstName, lastName, payRate);
			
			System.out.println(myEmployee.toString());
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public static void jsonOutputStreamTest(Employee testEmployee, File aFile){
		try{
			FileOutputStream aFileStream = new FileOutputStream(aFile);
			JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
			jsonOut.writeObject(testEmployee);
			jsonOut.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void jsonInputStreamTest(File aFile){
		try{
			FileInputStream aFileStream = new FileInputStream(aFile);
			JSONInputStream jsonIn = new JSONInputStream(aFileStream);
			System.out.println(jsonIn.readObject());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/*
	public static void jsonTest3(){
		File aFile = new File("test.xml");
		try {
			FileInputStream aFileStream = new FileInputStream(aFile);
			XMLDecoder objectIn = new XMLDecoder(aFileStream);
			Employee myEmployee = (Employee)objectIn.readObject();
			objectIn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
			
}
