import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1

        Scanner scanner = new Scanner(System.in);
        boolean isEightChar = false;
        String user;
        String password = "";

        System.out.print("Enter a username: ");
        user = scanner.nextLine();
        user = user.toUpperCase();

        while (!isEightChar) {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
            if (password.length() >= 8) {
                isEightChar = true;
            } else {
                System.out.println("Password must be 8 characters long.");
            }
        }

        System.out.println("Your username is: " + user + " and your password is: " + password);

        //2

        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your Middle initial: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Your monogram is: " + firstName.toLowerCase().charAt(0) + middleName.toUpperCase() + lastName.toLowerCase().charAt(0));

        //3

        boolean isCorrectLength = false;
        String input = "";

        while (!isCorrectLength) {
            System.out.print("Enter a 8 or more character string: ");
            input = scanner.nextLine();
            if (input.length() >= 8) {
                isCorrectLength = true;
            } else {
                System.out.println("The string must be over 8 characters long.");
            }
        }

        System.out.println("First 3 characters: " + input.substring(0, 3));
        System.out.println("Last 3 characters: " + input.substring(input.length() - 3));
        System.out.println("Middle 3 characters: " + input.substring(input.length() / 2 - 1, input.length() / 2 + 2));

        //4

        String vowels = "aeiou";

        System.out.print("Enter a string: ");
        String vowelsInput = scanner.nextLine();
        vowelsInput = vowelsInput.toLowerCase();
        int vowelsCount = 0;

        for (int i = 0; i < vowelsInput.length(); i++) {
            if (vowels.contains(String.valueOf(vowelsInput.charAt(i)))) {
                vowelsCount++;
            }
        }

        System.out.println("The number of vowels in the string is: " + vowelsCount);

        //5

        System.out.println("Enter a string: ");
        String input5 = scanner.nextLine();
        int wordCount = 1;

        for (int i = 0; i < input5.length(); i++) {
            if (input5.charAt(i) == ' ')
                wordCount++;
        }

        System.out.println("There are " + wordCount + " words in the string.");

        //7

        System.out.print("Enter your first name: ");
        scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName1 = scanner.nextLine();
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        int pos = alpha.indexOf(lastName1.charAt(0));

        if (pos >= 0 && pos <= 8) {
            System.out.println("You are in the first group.");
        } else if (pos >= 9 && pos <= 18) {
            System.out.println("You are in the second group.");
        } else {
            System.out.println("You are in the last group.");
        }

        //7

        int[] numbers = new int[5];
        numbers[3] = 7;
        for (int i : numbers)
            System.out.println(i);

        //8

        String[] ducks = {"Donald", "Huey", "Dewey", "Louie"};

        //9

        String[] friend = new String[3];

        for (int i = 0; i < friend.length; i++) {
            System.out.print("Enter a friend's name: ");
            friend[i] = scanner.nextLine();
        }

        System.out.println("Your friends are: " + friend[0] + ", " + friend[1] + ", and " + friend[2]);

        //10

        int[] numbers1 = new int[10];

        for (int i = 0; i < numbers1.length; i++)
            numbers1[i] = i * i;

        for (int i : numbers1)
            System.out.println(i);

        //11

        int[] countdown = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Countdown! ");

        for (int i = countdown.length - 1; i >= 0; i--)
            System.out.println(countdown[i]);

        System.out.println("GO!");

        //12

        Random random = new Random();
        int[] randomNums = new int[25];
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int i = 0; i < randomNums.length; i++)
            randomNums[i] = random.nextInt(0, 99);

        for (int i : randomNums){
            if (i % 2 == 0)
                evens.add(i);
            else
                odds.add(i);
        }

        System.out.print("Evens: ");
        for (int i : evens)
            System.out.print(i + " ");

        System.out.println();
        System.out.print("Odds: ");
        for (int i : odds)
            System.out.print(i + " ");
    }
}