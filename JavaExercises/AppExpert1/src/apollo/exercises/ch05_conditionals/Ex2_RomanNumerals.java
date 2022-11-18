package apollo.exercises.ch05_conditionals;

public class Ex2_RomanNumerals {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		// Call the method and verify it prints the correct roman numeral
		System.out.println(romanNumerals(1));
	}
	
	// Create a method that takes a number between 1-10
	// and prints the equivalent roman numeral.
	//
	// You should check to make sure the number passed
	// in isn't greater than 10.  If it is, print an
	// error.
	//

	public static String romanNumerals(int number){
		if(number < 1 && number >= 10){
			return "Error. Not between 1 and 10";
		}

		switch(number){
			case 1:
				return "I";
			case 2:
				return "II";
			case 3:
				return "III";
			case 4:
				return "IV";
			case 5:
				return "V";
			case 6:
				return "VI";
			case 7:
				return "VII";
			case 8:
				return "VIII";
			case 9:
				return "VIV";
			case 10:
				return "X";
			default:
				return "Invalid";
		}
	}

}

/*
 * SAMPLE OUTPUT:
 * 
 * II
 * IV
 * X
 * 
 */