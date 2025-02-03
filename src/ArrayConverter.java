import java.util.*;

// Class to convert an array to an ArrayList and vice versa
public class ArrayConverter {
    private final int[] numbers;

    // Constructor
    public ArrayConverter(int[] numbers) {
        this.numbers = numbers;
    }

    // Convert array to ArrayList
    public List<Integer> toArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        for (int num : numbers) {
            arrayList.add(num);
        }
        return arrayList;
    }

    // Convert ArrayList back to array
    public int[] toArray() {
        return Arrays.copyOf(numbers, numbers.length);
    }
}
