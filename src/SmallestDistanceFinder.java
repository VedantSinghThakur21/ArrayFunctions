// Class to find the index of the first number in the smallest adjacent pair
public class SmallestDistanceFinder {
    private final int[] numbers;

    // Constructor
    public SmallestDistanceFinder(int[] numbers) {
        this.numbers = numbers;
    }

    // Method to find the index of the smallest adjacent difference
    public int findSmallestDistanceIndex() {
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Error case
        }

        int minDistance = Math.abs(numbers[1] - numbers[0]);
        int index = 0;

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