import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        String[] names = {"leo", "apple", "bob"};

        Sorting sorting = new Sorting();

        long startTime = System.currentTimeMillis();

        sorting.quickSort(names, 0, names.length - 1);

        long endTime = System.currentTimeMillis();

        for (String i : names) {
            System.out.print(i + " ");
        }

        System.out.println("Time taken to sort: " + (endTime - startTime) + " milliseconds");
    }
}