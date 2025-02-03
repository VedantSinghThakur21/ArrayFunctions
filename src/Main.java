/*
 * Name: Vedant Singh Thakur
 * PRN: 23070126144
 * Batch: AIML B3
 */

import java.util.List;

/* Description:
  This program performs multiple tasks:
  1. Takes an integer array input from the user.
  2. Separates even and odd numbers.
  3. Finds the index of the first number in the smallest adjacent pair.
  4. Converts the array to an ArrayList and back.
 */
public class Main {
    public static void main(String[] args) {
        // Step 1: Create an instance of UserInput to take user input
        UserInput input = new UserInput();

        // Get user input for numbers
        int[] numbers = input.getIntArrayFromUser();

        // Step 2: Separate even and odd numbers
        EvenOddSeparator separator = new EvenOddSeparator(numbers);
        separator.displayEvenOdd();

        // Step 3: Find the smallest adjacent difference in the array
        SmallestDistanceFinder distanceFinder = new SmallestDistanceFinder(numbers);
        int index = distanceFinder.findSmallestDistanceIndex();

        // Display the index of the first number in the smallest adjacent pair
        System.out.println("Index of first number in smallest adjacent pair: " + index);

        
        // Step 4: Convert array to ArrayList and back
        ArrayConverter converter = new ArrayConverter(numbers);
        List<Integer> arrayList = converter.toArrayList();
        System.out.println("Converted ArrayList: " + arrayList);
        
        // Convert the ArrayList back to an array
        int[] convertedArray = converter.toArray();
        System.out.println("Converted Back to Array:");
        for (int num : convertedArray) {
            System.out.print(num + " ");
        }

        // Close the scanner to free sys resources
        input.closeScanner();
    }
}
