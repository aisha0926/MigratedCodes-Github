package apollo.exercises.ch08_collections;

import java.util.ArrayList;

public class Ex1_BasicArrayList {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Directions:
		//
		// 1) Declare am ArrayList of strings
		// 2) Call the add method and add 10 random strings
		// 3) Iterate through all the elements in the ArrayList
		// 4) Remove the first and last element of the ArrayList
		// 5) Iterate through all the elements in the ArrayList, again.

		//1
		ArrayList<String> list= new ArrayList<>();

		//2
		list.add("JavaSE");
		list.add("JavaEE");
		list.add("JavaME");
		list.add("Python");
		list.add("Django");
		list.add("Android");
		list.add("PHP");
		list.add("JavaScript");
		list.add("CSS");
		list.add("HTML");

		//3
		for (int i=0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("===================================================");
		//4
		list.remove(0);
		list.remove(list.size()-1);

		//5
				for (int i=0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

}
