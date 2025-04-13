import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> english = new HashMap<>();

        english.put(1, "one");
        english.put(2, "two");
        english.put(3, "three");
        english.put(4, "four");
        english.put(5, "five");
        english.put(6, "six");
        english.put(7, "seven");
        english.put(8, "eight");
        english.put(9, "nine");
        english.put(10, "ten");

        System.out.println("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();

        System.out.println(english.get(number));
    }
}