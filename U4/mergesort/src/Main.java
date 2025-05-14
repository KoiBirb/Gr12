import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10000000; // Set the length of the array
        int[] randomArray = generateRandomArray(length);

        System.out.println("Sorting an array of length: " + length);

        long startTime = System.nanoTime(); // Start timing
        int[] sortedArray = Sort.mergeSort(randomArray);
        long endTime = System.nanoTime(); // End timing

        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        double durationInSeconds = (endTime - startTime) / 1e9; // Convert to seconds
        System.out.printf("Time taken to sort: %.6f seconds%n", durationInSeconds);
    }

    private static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000); // Generate random numbers between 0 and 999
        }
        return array;
    }
}