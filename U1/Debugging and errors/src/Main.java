import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1

        /*
        Syntax error: grammatical error in the code
        Runtime error: program run but crashes
        Logical error: program runs but gives wrong answer
         */

        //2

        /*
        Print statements
        commenting out code
        debuggers
         */

        //3

        /*
        System.out.print('Hello' + 10);

        Syntax, String must be in double quotes
         */

        //4

        /*
        for (int n = 10; n > 1; n--) {
            System.out.println(n);
        }
        System.out.println(“Blast off!”);

        Logical error, the loop will never reach 1
         */

        //5

        /*
        System.out.print(“How old are you? “);
        int age = input.next();
        int new_age = age + 15;
        System.out.println(“On this date in 2037, you will be ” + new_age + “ years old.”);

        Runtime error, input.next() should be input.nextInt()
         */

        //6

        /*
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total *= i;
        }
        System.out.println(total);

        Logical error, total should be initialized to 1 and i should start and 1 and end at 10
         */

        //7

        /*
        int num = 0
        while (num < 10)
            if (num % 2 == 0) System.out.println(num + "is even")
            else System.out.pirnt(num + " is odd")
            num += 1
        }

        a) Syntax errors
        b) second print is misspelled
           missing semicolons everywhere
           missing curly bracket
         */

        //8

        /*
        1  System.out.print("How old are you?")
        2  int age = input.next();
        3
        4  if (age < 30 && age > 20) {
        5      System.out.println("You are in the prime of your life!");
        6  } else if (age <= 20) {
        7      System.out.println("Your life has just begun");
        8  } else if (name.equals("Bob")) {
        9      System.out.println("Oh, hey Bob!");
        10 } else {
        11     System.out.println("Life is just getting good!");
        12 }

        a) Runtime errors
        b) age should be input.nextInt()
           Name is not defined
         */

        //9

        /*
        1  int count = 10;
        2  while (count > 0) {
        3      System.out.println(count);
        4      count ++;
        5  }
        6  System.out.println("BLAST OFF!");

        a) Logical error
        b) count should be decremented
         */

        //10

        /*
          0, 1, 4, 9, 16
          30
          num1 = 16
          num2 = 30
         */

        //11

        /*
            Fixed imports
            correctly concatenated strings
            Fixed points calls
            renamed points (2) to pointsSubtracted
            added system.in to scanner
            changed end condition to greater than
            changed choice to next()
            changed lost points to subtracted points
         */
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        // Declare important variables for the game
        int points = 50;	//the player's total points - starts game w/50
        final int pointsSubtracted = 10;	//the amount of points earned/lost
        int dice1, dice2, diceTotal;
        String choice;	//saves the player's choices throughout the game

        //Display the welcome and rules for the game
        System.out.println("The Game of Cho-Han");
        System.out.println();
        System.out.println("HOW TO PLAY:");
        System.out.println("2 dice are rolled. You must choose whether you think");
        System.out.println("the total is even (cho) or odd (han). If you are");
        System.out.println("correct, you will win "+ pointsSubtracted +" points. If you are incorrect,");
        System.out.println("you lose "+ pointsSubtracted +" points.");

        //Main game loop
        while (points > 0) {
            System.out.println();
            //Display the points total
            System.out.println("You have " + points +" points.");
            System.out.println("You swirl the cup and hear the rattle of dice...");
            System.out.println("You slam the cup on the floor, still covering the dice.");

            //Prompt the user to guess CHO or HAN
            System.out.print("CHO (even) or HAN (odd): ");
            choice = input.next();

            //Simulate rolling dice and determining/displaying the total
            dice1 = rand.nextInt(1,6);
            dice2 = rand.nextInt(1,6);
            diceTotal = dice1 + dice2;
            System.out.println("You lift the cup to reveal...");
            System.out.println(dice1 + " + " + dice2 + " = " + diceTotal);

            /*
             * Determine if the user guessed correctly or incorrectly.
             * If correct, they earn points.
             * If incorrect, they lose points.
             */
            int remainder = diceTotal / 2;	//0 if even, 1 if odd
            if ((choice.equals("CHO") || remainder == 0) || (choice.equals("HAN") || remainder == 1)) {
                points += pointsSubtracted;
                System.out.println("You've won " + pointsSubtracted + " points!");
            } else {
                points -= pointsSubtracted;
                System.out.println("You've lost " + pointsSubtracted + " points.");
            }

            //Ask the user to play again or not. If "n", exit game
            System.out.print("Do you want to play again? [y/n]: ");
            choice = input.next();
            if (choice.equals("n")) {
                break;//exit the game
            }
        }
        System.out.println();

        //Thank the user for playing and displaying the final points total.
        System.out.print("Thank you for playing Cho Han. ");
        }
}