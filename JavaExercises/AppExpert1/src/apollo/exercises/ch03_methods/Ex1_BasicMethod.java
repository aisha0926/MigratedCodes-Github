package apollo.exercises.ch03_methods;

// This is a program that prints out your basic info
public class Ex1_BasicMethod {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Call the printBasicInfo method from the main method here
		// Call the printBasicInfo method from the main method with different name and email
		printBasicInfo();
		printBasicInfo("Ted", "test@test.com");

	}
	
	// Define a public static method called printBasicInfo which accepts a name and email.
    //
	// printBasicInfo is a method that prints out a name and email.
	//Overloading example
	public static void printBasicInfo() {
		System.out.println("Info ");
	}
	
	public static String printBasicInfo(String name, String email) {
		return "Name :" + name + "\n" + "Email: " + email;
	}

}

/*
 * SAMPLE OUTPUT:
 *  
 *   Name: Ken Thompson | Email: ken@thompson.com
 *   Name: James Dean | Email: deanish@jim.com
 *   
 */
