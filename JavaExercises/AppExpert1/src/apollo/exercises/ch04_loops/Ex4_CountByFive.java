package apollo.exercises.ch04_loops;

// This is a program that counts by five.
public class Ex4_CountByFive {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {

		// Print out the numbers to 100, counting by 5.
		int test = 100;
		while(test >= 5) {
			if(test % 5 == 0) {
				System.out.println(test);
			}
			test--;
		}
	}

}


/*
 * SAMPLE OUTPUT:
 *  
 *  5
 *  10
 *  15
 *  20
 *  25
 *  30
 *  35
 *  40
 *  ...
 *  85
 *  90
 *  95
 *  100
 *  
 */