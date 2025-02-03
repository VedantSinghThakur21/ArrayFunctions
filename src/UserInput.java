import java.util.Scanner;

/*
  UserInputHandler class - Handles user input for integer arrays.
  This class allows users to enter an integer array dynamically.
  It uses a Scanner object to read input from the console.
 */
public class UserInput {
    private final Scanner scanner; // Scanner object for user input

    // Constructor to initialize scanner
    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    /*
      Gets an integer array from the user with input validation.
      
      Returns An array of integers entered by the user.
     */
    public int[] getIntArrayFromUser() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt(); // Read the size of the array
        
        int[] numbers = new int[size]; // Create an array of given size
        System.out.println("Enter " + size + " numbers:");
        
        // Loop to read elements from user input
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        return numbers; //Returning the filled array
    }

    /*
      Closes the scanner object when input handling is complete.
      This helps prevent resource leaks.
     */
    public void closeScanner() {
        scanner.close();
    }
}
