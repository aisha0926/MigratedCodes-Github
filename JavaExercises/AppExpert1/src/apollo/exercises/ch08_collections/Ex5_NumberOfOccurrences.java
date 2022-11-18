package apollo.exercises.ch08_collections;

import java.util.HashMap;

public class Ex5_NumberOfOccurrences {

    // This is the main method that is executed as
    // soon as the program starts.
    public static void main(String[] args) {

        // Create a method called printOccurrences(int[] scores)
        //
        int[] scores = {85, 93, 96, 96, 92, 100, 91, 85, 87, 92};
        printOccurrences(scores);
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

    public static void printOccurrences(int[] scores) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : scores) {
            Integer val = map.get(x);
            if (val == null) {
                //If score is not available in map, then put score with occurrance with 1
                map.put(x, 1);
            } else {
                //If score is  available in map, then get the current occurance and increased by and put it down again in the map with same key(score)
                int newVal = val + 1;
                map.put(x, newVal);
            }
        }

        for (int key : scores) {
            System.out.println(key +" - " + map.get(key));
        }


    }

}
