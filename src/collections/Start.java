package collections;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// Collections Test
		int input = -1;
		
		while(input != 0){
			System.out.println("");
			Scanner reader = new Scanner(System.in);
			menu();
			input = reader.nextInt();
			if (input == 1){
				ArrayListTest.examples();
			}else if(input == 2){
				LinkedListTest.examples();
			}else if(input == 3){
				OtherArrayExamples.dequeExamples();
			}else if(input == 4){
				OtherArrayExamples.hashExamples();
			}else if(input == 5){
				OtherArrayExamples.treeExamples();
			}else if(input == 6){
				OtherArrayExamples.enumExamples();
			}else if(input == 7){
				OtherArrayExamples.priorityQueueExamples();
			}else if(input == 8){
				OtherArrayExamples.variousMapExamples();
			}else if(input == 0){
				
			}else{
				System.out.println("Invalid Number");
			}
		}
	}
	
	public static void menu(){
		System.out.println( "1: ArrayList \r"
				  		  + "2: LinkedList\r"
				  		  + "3: ArrayDeque\r"
						  + "4: HashSet\r"
						  + "5: TreeSet\r"
						  + "6: EnumSet\r"
						  + "7: priorityQueue\r"
						  + "8: various Maps\r"
						  + "0: exit\r"
						  + "Enter number: ");
	}
}
