package apollo.exercises.ch08_collections;

import java.util.HashMap;

public class NumberOfOccuerences2 {

        // This is the main method that is executed as
        // soon as the program starts.
        public static void main(String[] args) {

            // Create a method called printOccurrences(int[] scores)
            //
            HashMap number = new HashMap();

            int[] scores = {85,93,96,96,92,100,91,85,87,92};

            for(int i = 0; i < scores.length; i++){
                number.put(i, scores[i]);
            }

            int print = printOccurrences(number, scores[1]);
            System.out.println(print);

//		for(int i = 0; i <= number.size(); i++){
//			System.out.println(number.get(i));
//		}

//		 int print = printOccurrences(number, scores[1]);
//		System.out.println(print);
            //
            // HINT: Use a HashMap to keep track of the counts (K: Integer, V: Integer)
            //
            // Output:
            //  85 - 2
            //  87 - 1
            //  92 - 2
            //  93 - 1
            //  96 - 2
            // 100 - 1
            //


        }

        public static int printOccurrences(HashMap number, int scores){
            int tracker = number.get(scores).hashCode();
            return tracker;
        }



}
