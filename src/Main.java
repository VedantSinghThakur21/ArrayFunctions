/*
 * Name: Vedant Singh Thakur
 * PRN: 23070126144
 * Batch: AIML B3
 */

import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Create an instance of UserInputHandler
        UserInput input = new UserInput();

        // Get user input for numbers
        int[] numbers = input.getIntArrayFromUser();

        // Task 1: Separate even and odd numbers
        EvenOddSeparator separator = new EvenOddSeparator(numbers);
        separator.displayEvenOdd();

        // Task 2: Find smallest adjacent distance
        SmallestDistanceFinder distanceFinder = new SmallestDistanceFinder(numbers);
        int index = distanceFinder.findSmallestDistanceIndex();
        System.out.println("Index of first number in smallest adjacent pair: " + index);

        // Task 3: Convert array to ArrayList and back
        ArrayConverter converter = new ArrayConverter(numbers);
        List<Integer> arrayList = converter.toArrayList();
        System.out.println("Converted ArrayList: " + arrayList);
        
        int[] convertedArray = converter.toArray();
        System.out.println("Converted Back to Array:");
        for (int num : convertedArray) {
            System.out.print(num + " ");
        }

        // Close the scanner
        input.closeScanner();
    }
}
