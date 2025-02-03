import java.util.*;

/*
  Class: ArrayConverter
  Description: This class provides methods to convert an integer array into an ArrayList 
  and vice versa. The primary goal is to facilitate data structure conversion,
  
  Methods:
  1. toArrayList() - Converts an integer array to an ArrayList<Integer>.
  2. toArray() - Converts an ArrayList<Integer> back to an integer array.
 */
public class ArrayConverter {
    private final int[] numbers; // Stores the integer array for conversion

    /**
     * Constructor to initialize the ArrayConverter object.
     * Parameter: Integer array that needs to be converted.
     */

    public ArrayConverter(int[] numbers) {
        this.numbers = numbers; // Assigning input array to class variable
    }

    /*
      Converts an integer array to an ArrayList of Integer type.
      
      Returns A List<Integer> containing the elements of the original array.
     */
    public List<Integer> toArrayList() {
        List<Integer> arrayList = new ArrayList<>(); // Creating a new ArrayList

        // Iterating through the array and adding elements to the list
        for (int num : numbers) {
            arrayList.add(num);
        }
        return arrayList; // Returning the populated ArrayList
    }

    /*
      Converts an ArrayList<Integer> back into an integer array.
      
      Returns A new integer array containing the elements of the original list.
     */
    public int[] toArray() {
        return Arrays.copyOf(numbers, numbers.length); // Returns a copy of the original array
    }
}
