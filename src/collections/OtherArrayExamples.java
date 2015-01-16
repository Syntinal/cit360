package collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;


public class OtherArrayExamples {
	
	public OtherArrayExamples(){}
	/************************************************************************************************************************************
	//ArrayDeque
	//A double-ended queue that is implemented as a circular array
	//Unable to add null values into array
	//Only able to work with the start and end of the array
	 *************************************************************************************************************************************/
	public static void dequeExamples() {
		System.out.println("------Deque-------");
		
		//Create new ArrayDeque
		ArrayDeque<String> aq = new ArrayDeque<String>();
		
		//Populate Deque
		aq.offerFirst("First");
		aq.add("Second");
		aq.offerLast("Third");
		aq.offerLast("Third");
		//aq.offerFirst(null); cannot insert null value
		
		//Access first and last in the Deque
		String first = aq.getFirst();
		String last = aq.getLast();
		
		System.out.println("First: " + first);
		System.out.println("Last: " + last);
		
		//Access with Iterator
		Iterator<String> itr = aq.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	/************************************************************************************************************************************
	//Hashset
	//An unordered collection that rejects duplicates
	//The HashSet class implements the Set interface, backed by a hash table (actually a HashMap instance). 
	//It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.
	//Incorrect -->(This class permits the null element.)
	//This class offers constant time performance for the basic operations (add, remove, contains and size), assuming the hash function disperses the elements properly among the buckets. 
	//Iterating over this set requires time proportional to the sum of the HashSet instance's size (the number of elements) plus the "capacity" of the backing HashMap instance (the number of buckets).
	//Thus, it's very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important.
	//????? Unable to access hashset individually. YOu can use iterator to access????
	//Cannot duplicate values
	//Linked Hash set is another option that creates order to the hashset.
	 *************************************************************************************************************************************/
	public static void hashExamples(){
		System.out.println("------HashSet-------");
		
		
		HashSet<String> hash = new HashSet<String>();
		
		hash.add("First");
		hash.add("Second");
		hash.add("Third");
		hash.add("Third");
		//hash.addAll(null); unable to add a null value
		
		int hashCode = hash.hashCode();
		System.out.println("HashCode: " + hashCode);
		
		Iterator<String> itr = hash.iterator();
		
		System.out.println(hash);
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
	
	/************************************************************************************************************************************
	//TreeSet
	//TreeSet is a NavigableSet implementation based on a TreeMap. 
	//The elements are ordered using their natural ordering, or by a Comparator provided at set creation time, depending on which constructor is used.
	//This implementation provides guaranteed log(n) time cost for the basic operations (add, remove and contains).
	//Notes:
	//1. Notice the comparitor type is "Integer" not "int"
	//2. With the constructor you can pass in a list and it will be converted into a treeSet.
	//3. Can easily be used to get the min and max by taking the first() or last()
	*************************************************************************************************************************************/
	public static void treeExamples(){
		System.out.println("------TreeSet-------");
		
		//Create an instance of TreeSet Integers with default order and then one with reverse order
		TreeSet<Integer> intTreeSet = new TreeSet<Integer>();
		TreeSet<Integer> intTreeSetReverse = new TreeSet<Integer>((Integer int1, Integer int2) -> (int2.compareTo(int1))); //must you Integer vs int lambda method
		
		//Create an instance of TreeSet Strings with default order and then one with reverse order
		TreeSet<String> stringTreeSet = new TreeSet<String>();
		TreeSet<String> stringTreeSetReverse = new TreeSet<String>((String a1, String a2) -> (a2.compareTo(a1))); //lambda method
		
		intTreeSet.add(10);
		intTreeSet.add(20);
		intTreeSet.add(5);
		intTreeSet.add(100);
		
		intTreeSetReverse.add(10);
		intTreeSetReverse.add(20);
		intTreeSetReverse.add(5);
		intTreeSetReverse.add(100);
		
		stringTreeSet.add("Fish");
		stringTreeSet.add("Zebra");
		stringTreeSet.add("Cat");
		stringTreeSet.add("Dog");
		
		stringTreeSetReverse.add("Fish");
		stringTreeSetReverse.add("Zebra");
		stringTreeSetReverse.add("Cat");
		stringTreeSetReverse.add("Dog");
		
		System.out.println(intTreeSet);
		System.out.println(intTreeSetReverse);
		System.out.println(stringTreeSet);
		System.out.println(stringTreeSetReverse);
		System.out.println("Min: " + intTreeSet.first() + " Max: " + intTreeSet.last());
	}
	
	/************************************************************************************************************************************
	//EnumSet
	//Create an array of enum
	*************************************************************************************************************************************/
	
	public enum Numbers {
		ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN
	};
	
	public static void enumExamples(){
		System.out.println("------Enum-------");
		
		//Create an array of enum set
		Numbers[] numArray = {Numbers.ONE
						    , Numbers.TWO
						    , Numbers.THREE
						    , Numbers.FOUR
						    , Numbers.FIVE
						    , Numbers.SIX
						    , Numbers.SEVEN};
		
		//Create a new enumSet with the array.
		EnumSet<Numbers> enumSetExample = EnumSet.of(Numbers.ONE, numArray);
		
		System.out.println(enumSetExample);
	}
	
	//Priority Queue
	// ?????
	public static void priorityQueueExamples(){
		System.out.println("------Priority Queue-------");
		
		//Create first priorityQueue
		PriorityQueue<Integer> pQueue1 = new PriorityQueue<Integer>();
		
		//Insert Values int for PQ
		pQueue1.add(9);
		pQueue1.add(10);
		pQueue1.add(11);
		pQueue1.add(12);
		pQueue1.add(13);
		
		Comparator<Integer> cmp = (Integer int1, Integer int2) -> {
			System.out.println(int2 + " " + int1);
			int returnValue = 0;
			if (int1 < int2){
				returnValue = 1;
			}else if(int2 > int1){
				returnValue = -1;
			}
			return returnValue;
			};
		
			
		//Create second PQ with a comparitor in the constructor for numerical order
		PriorityQueue<Integer> pQueue2 = new PriorityQueue<Integer>(cmp);
		
		//Add the first PQ into the second using addAll
		pQueue2.addAll(pQueue1);
		
		System.out.println(pQueue1);
		System.out.println(pQueue2);	
	}
	
	/************************************************************************************************************************************
	// Maps
	// Hash Map, Tree Map, Enum Map
	*************************************************************************************************************************************/
	public static void variousMapExamples(){
		System.out.println("------Different type of Maps-------");
		
		//HashMap
		//Can add null values and null keys
		//
		
		//Create Hashmap
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		//Populate Hash Map with key and value
		hashMap.put("CA", "California");
		hashMap.put("ID", "Idaho");
		hashMap.put("NV", "Nevada");
		hashMap.put("OR", "Oregon");
		hashMap.put("WA", "Washington");
		hashMap.put("AR", null);
		hashMap.put(null, "New Mexico");
		
		System.out.println(hashMap);
		hashMap.replace("AR",null, "Airzona");
		System.out.println(hashMap);
		System.out.println("Get \"OR\" value: " + hashMap.get("OR"));

		//TreeMap
		//No Null Keys allowed
		//Sorts by Key
		
		//Create treeMap
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		
		//Populate Hash Map with key and value
		treeMap.put("CA", "California");
		treeMap.put("ID", "Idaho");
		treeMap.put("NV", "Nevada");
		treeMap.put("AA", "Zebra"); //Test to see how it sorts
		treeMap.put("OR", "Oregon");
		treeMap.put("WA", "Washington");
		treeMap.put("AR", null);
		//treeMap.put(null, "New Mexico");  // No null keys allowed
		
		System.out.println(treeMap);
		treeMap.replace("AR",null, "Airzona");
		System.out.println(treeMap);
		System.out.println("Get \"OR\" value: " + treeMap.get("OR"));
		
		
		//enumMap
		//A map in which the keys belong to an enumerated type
		//A map that remembers the order in which entries were added
	}
	
	
}



