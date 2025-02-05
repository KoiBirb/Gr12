
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1

        Scanner scanner = new Scanner(System.in);
        int age;
        String name;

        System.out.print("Whats your name? ");
        name = scanner.nextLine();

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        System.out.println("Hi " + name + "\nYou are " + age + " years old.");

        // 2

        if (age >= 18 )
            System.out.println("You are old enough to vote.");
        else
            System.out.println("You are not old enough to vote.");

        // 3

        Random random = new Random();
        int randInt = random.nextInt(19) + 1;
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.print("Guess a number between 1 and 20: ");
            int guess = scanner.nextInt();
            if (guess < 1 || guess > 20) {
                System.out.println("Please enter a number between 1 and 20");
            } else {
                if (guess == randInt) {
                    System.out.println("Just right");
                    keepGoing = false;
                } else if (guess < randInt) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
            }
        }

        // 4

        int grade;

        System.out.print("Enter your grade: ");
        grade = scanner.nextInt();
        int trueGrade = grade / 10;

        switch (trueGrade) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

        boolean small, green;

        System.out.print("Is the object small? (true/false) ");
        small = scanner.nextBoolean();

        System.out.print("Is the object green? (true/false) ");
        green = scanner.nextBoolean();

        if (small && green)
            System.out.println("Eat a pea!");
        else if (small)
            System.out.println("Eat a cherry!");
        else if (green)
            System.out.println("Eat a watermelon!");
        else
            System.out.println("Eat a pumpkin!");
    }
    // done!
}