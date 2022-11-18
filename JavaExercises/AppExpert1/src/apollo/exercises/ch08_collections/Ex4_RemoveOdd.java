package apollo.exercises.ch08_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex4_RemoveOdd {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		
		// Create a method called removeOdd
		// Remove all the odd numbers from an ArrayList 

		// removeOdd(Arrays.asList(1,2,3,5,8,13,21)) => {2, 8}
		// removeOdd(Arrays.asList(7,34,2,3,4,62,3)) => {34, 2, 4, 62}

		List<Integer> unmodifiableList = Arrays.asList(1, 2, 3, 5, 8, 13, 21);
//		System.out.println(unmodifiableList.getClass());

		removeOdd(unmodifiableList);
	}

	private static void removeOdd(List<Integer> unmodifiableList){

		ArrayList<Integer> modifiableList= new ArrayList<>(unmodifiableList);

		Iterator<Integer> itr = modifiableList.iterator();

		while(itr.hasNext()){
			Integer i= itr.next();
			if(i % 2 != 0){
				itr.remove();
			}
		}
		System.out.println(modifiableList);

	}

}
