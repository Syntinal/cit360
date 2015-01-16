package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {
	
	public ArrayListTest(){}
	
	
	//High cost for insert & delete
	//Low cost for random access
	public static void examples(){
		// Create new ArrayList
		ArrayList<String> animals = new ArrayList<>();
		ArrayList<String> moreAnimals = new ArrayList<>();
		
		// Add animals to array
		// Use the .add method to dynamically resize the array
		animals.add("Cat");
		animals.add("Bird");
		animals.add("Cat");
		animals.add("Cat");
		animals.add("null"); //added null value and it places a null value in list
		//animals.add(100); arrayList can only contain one data type
		
		System.out.println("Array toString and printed to screen");
		System.out.println(animals.toString()); //To string method
		
		//Add dog to index and one and shift the rest
		animals.add(1,"Dog");
		
		moreAnimals.add("Chicken");
		moreAnimals.add("Pig");
		
		//Below I am creating an array then converting the array into a list then adding it to animal array
		//Create an array for to demonstrate Arrays.aslist(array) function
		String[] evenMoreAnimals = new String[]{"Frog", "Cow"};
		
		//Add entire array to bottom of animals ListArray
		animals.addAll(Arrays.asList(evenMoreAnimals)); //Used Array.asList to convert to a ListArray
		
		// Add entire listArray to a location the array
		animals.addAll(2,moreAnimals);
		
		// Get the size
		int arrayCount = animals.size();
		System.out.println("Array count: " + arrayCount);
		
		// Print out Array using loop
		// This method uses .get(index) which pulls data out of the array
		System.out.println("Looped through with a for loop");
		for (int i = 0; i < animals.size(); i++){
			System.out.println("Animal " + (i + 1) + ": " + animals.get(i));
		}
		
		// Print out array using a for each loop
		int i = 0;
		System.out.println("Looped through with a for-each loop");
		for (String arrayValue : animals){
			i++;
			System.out.println("Animal " + (i) + ": " + arrayValue);
		}
		
		// Index of option get first instance of the value
		// LastIndexOf starts at the bottom and moves up
		System.out.println("Get index of values");
		int index = animals.indexOf("Cat");
		int lastIndex = animals.lastIndexOf("Cat");
		int noIndex = animals.lastIndexOf("cat"); //case sensative
		
		System.out.println("Index of \"Cat\": " + index);
		System.out.println("Index of last \"Cat\": " + lastIndex);
		System.out.println("Index of \"cat\": " + noIndex);
		
		// Use "contains" to get a boolean in return for if the value exsists in the array
		System.out.println("Find if value exsists");
		
		Boolean exsists1 = animals.contains("Bird");
		Boolean exsists2 = animals.contains("bird"); // case sensative
		
		System.out.println("Does a \"Bird\" exsist in array: " + exsists1);
		System.out.println("Does a \"bird\" exsist in array: " + exsists2);
		
		// Iterator example
		System.out.println("Create an interator, remove dog, and print out array");
		Iterator<String> animalsIterator = animals.iterator();
		while(animalsIterator.hasNext()){
			String current = animalsIterator.next();
			if(current == "Dog"){
				animalsIterator.remove();
			}else{
				System.out.println("Animal printed with iterator: " + current);
			}
		}
		
		// Remove specified value from array and list contracts to fill missing data
		System.out.println("Remove specifed value from array");
		Boolean complete = animals.remove("Frog");
		System.out.println("Frog was successfuly removed: " + complete);
		
		complete = animals.remove("Turtle");
		System.out.println("Turtle was successfuly removed: " + complete);
		
		System.out.println("Sort LinkedList");
		
	}
}

