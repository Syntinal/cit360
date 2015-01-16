package collections;

import java.util.Collections;
import java.util.LinkedList;


public class LinkedListTest {
	
	public LinkedListTest(){}
	
	public static void displayArray(LinkedList<String> animals){
		
		for (int i = 0; i < animals.size(); i++){
			System.out.println("Animal " + (i + 1) + ": " + animals.get(i));
		}
		
	}
	
	//Low cost for insert and delete due to use of pointers
	//High cost to find an index
	public static void examples(){
		// Create and LinkedList
		LinkedList<String> animals = new LinkedList<String>();
		LinkedList<String> moreAnimals = new LinkedList<String>();
		
		// Populate the list with animals and a null value
		animals.add("Cat");
		animals.add("Bird");
		animals.add("Cat");
		animals.add("Cat");
		animals.add(null); // null value added to linked list
		
		System.out.println("Animals toString and printed to screen");
		System.out.println(animals.toString());
		
		// add data to array in an index location
		animals.add(1,"Dog");
		// add data to the beginning of the linkedList
		animals.addFirst("Sheep"); // push() similar
		
		// creating a second Linked List data
		moreAnimals.add("Chicken");
		moreAnimals.add("Pig");
		
		// Add moreAnimals to animals at the bottom of list
		animals.addAll(moreAnimals);
		
		System.out.println("New Additions to List");
		System.out.println(animals.toString());
		
		//Peek 
		String peek = animals.peek();
		System.out.println("Peek at the first index");
		System.out.println(peek);
		
		String poll = animals.poll();
		animals.add(poll); //pop() similar
		
		System.out.println("Used Poll to capture first index and add to add it");
		for (int i = 0; i < animals.size(); i++){
			System.out.println("Animal " + (i + 1) + ": " + animals.get(i));
		}
		
		animals.set(1, "Goat");
		System.out.println("Set replaces index. Replaced Cat with Goat");
		System.out.println("Index #1: " + animals.get(1));
		
		// Sort using Lambda with Collections sort
		animals.set(animals.indexOf(null), "Horse");
		Collections.sort(animals,(String a1, String a2) -> (a1.compareTo(a2))); //Reverse compare to reverse order
		displayArray(animals);
		
		System.out.println(animals);
	}
}
