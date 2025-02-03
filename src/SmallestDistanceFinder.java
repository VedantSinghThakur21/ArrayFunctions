/*
  SmallestDistanceFinder class - Finds the index of the first number 
  in the smallest adjacent pair based on absolute difference.
 */
public class SmallestDistanceFinder {
    // Array to store input numbers (final ensures reference is unchanged)
    private final int[] numbers;

    /*
    Constructor to initialise the array of numbers

    Parameter to it is an array of integers
     */
    public SmallestDistanceFinder(int[] numbers) {
        this.numbers = numbers;
    }

    /*
      Finds the index of the first number in the smallest adjacent pair.
      
      Returning The index of the first number in the smallest adjacent pair.
              Returns -1 if the array has less than two elements.
     */
    public int findSmallestDistanceIndex() {
        // Ensure the array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Not enough elements to form an adjacent pair
        }

        // Initializing MinDist with the first adjacent difference
        int minDistance = Math.abs(numbers[1] - numbers[0]);
        int index = 0;

        // Iterating through array to find the smallest adjacent difference
        for (int i = 1; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i + 1] - numbers[i]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }

        return index;
    }
}