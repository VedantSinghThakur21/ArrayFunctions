import java.util.ArrayList;
import java.util.List;

/*
Even Odd Separator - Separates even and odd numbers from a given array.
This Program will demonstrate the use of arrays, loops, and list in java
*/
public class EvenOddSeparator {
    //array to store input numbers
    // Note : using private final as we wont be assigning the array later anytime
    private final int[] numbers;

    /*
    Constructor to initialise the array of numbers

    Parameter is array of integer to be processed
    */
    public EvenOddSeparator(int[] numbers) {
        this.numbers = numbers;
    }

    /*
    Method to classify numbers to even and odd categories
    and display them seperately 
     */
    public void displayEvenOdd() {
        //List to store even and odd numbers 
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
      //Iterating through the array to check each number  
        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num); //if divisible by 2 then even
            } else {
                odd.add(num); //Otherwise odd
            }
        }
        //Displaying Results
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}
