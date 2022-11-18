package apollo.exercises.ch05_conditionals;

public class Ex3_Blackjack {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		
		// Given 2 int values greater than 0, return whichever 
		// value is nearest to 21 without going over. 
		// Return 0 if they both go over. 
		//
		
		// Call the method a few times and print the results


	int x=	blackjack(12,13);
		System.out.println(x);
	}
	
	// Create a method like:
	static public int blackjack(int a, int b)
	  {
	  	if(a >21 && b>21){
	  		return 0;
		}else{

	  		int diffA = 21- a;
	  		int diffB= 21-b;

	  		return  diffA > diffB ? b:  a;
		}


	  }


}

/*
 * SAMPLE OUTPUT:
 * 
 * 6
 * 8
 * 0
 * 
 */