import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String string;
        int shift;

        System.out.print("Enter a string to be encrypted:");
        string = scanner.nextLine();

        System.out.print("Enter a shift value:");

        while (true) {
            try {
                shift = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.nextLine();
            }
        }

        char[] encrypted = string.toLowerCase().toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if (alpha.indexOf(encrypted[i]) != -1)
                encrypted[i] = alpha.charAt((alpha.indexOf(encrypted[i]) + shift) % 26);
        }

        string = new String(encrypted);

        System.out.println("Encrypted string: " + string);


    }
}