import java.util.Random;
import java.util.Scanner;

public class Main {

    // initialize classes
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int length;
        String password = "";

        // get password length
        System.out.print("How long would you like the password to be?: ");
        try {
            length = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
            return;
        }

        // generate password
        for (int i = 0; i < length; i++) {
            password += getRandomCharacter();
        }

        System.out.println("Your password is: " + password);
    }

    /**
     * Generates a random number between 1 and 10 and returns a character based on the number
     * @return char of a random character
     */
    public static char getRandomCharacter() {
       return switch ((random.nextInt(10) + 1)){
           case 10 -> getRandomSymbol();
           case 9,8 -> getRandomDigit();
           case 7,6,5 -> getRandomUpperCaseLetter();
           case 4,3,2,1 -> getRandomLowerCaseLetter();
           default -> {
               System.out.println("Error");
               yield ' ';
           }
       };
    }

    /**
     * Generates a random lowercase letter
     * @return char of a random lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return (char) (random.nextInt(26) + 'a');
    }

    /**
     * Generates a random uppercase letter
     * @return char of a random uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return (char) (random.nextInt(26) + 'A');
    }

    /**
     * Generates a random digit
     * @return char of a random digit
     */
    public static char getRandomDigit() {
        return (char) (random.nextInt(10) + '0');
    }

    /**
     * Generates a random symbol
     * @return char of a random symbol
     */
    public static char getRandomSymbol() {
        String symbols = "!@#$%^&*()_+";
        return symbols.charAt(random.nextInt(symbols.length()));
    }


}