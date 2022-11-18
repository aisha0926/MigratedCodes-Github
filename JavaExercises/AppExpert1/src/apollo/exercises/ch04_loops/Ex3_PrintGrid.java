package apollo.exercises.ch04_loops;

// Prints battleship coordinates
public class Ex3_PrintGrid {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		// A battleship board is a 2-dimensional grid with coordinates
		// like (0,0), (0,1), (0,2), etc.
		
		// Create a method called PrintCoordinates(int x, int y)
		// where x and y define the size of the board.  Print
		// all the possible coordinates in the board.
		//
		// Hint: loops can contain loops
		printCoordinates(2,10);

	}
	private static void printCoordinates(int x, int y){

		for (int r=0; r <x; r++)
		{
			for (int c=0; c <y; c++) {
				System.out.println("(" + r + ", " + c+	")");
			}

		}
	}

}


/*
 * SAMPLE OUTPUT (9, 9):
 *  
 *  (0, 0)
 *  (0, 1)
 *  (0, 2)
 *  (0, 3)
 *  ...
 *  (0, 9)
 *  (1, 0)
 *  (1, 2)
 *  (1, 3)
 *  ...
 *  (1, 9)
 *  
 */