import java.util.Scanner;

// Class to handle user input
public class UserInput {
    private final Scanner scanner;

    // Constructor to initialize scanner
    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    // Method to get an integer array from user input
    public int[] getIntArrayFromUser() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        return numbers;
    }

    // Method to close scanner when done
    public void closeScanner() {
        scanner.close();
    }
}
