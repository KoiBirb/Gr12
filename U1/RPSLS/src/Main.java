import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // initialize classes
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // loss conditions
    static int[] rockLosses = {2, 5};
    static int[] paperLosses = {3, 4};
    static int[] scissorsLosses = {1, 5};
    static int[] lizardLosses = {1, 3};
    static int[] spockLosses = {2, 4};

    public static void main(String[] args) {

        // translate choices
        HashMap<Integer, String> choices = new HashMap<>() {{
            put(1, "ROCK");
            put(2, "PAPER");
            put(3, "SCISSORS");
            put(4, "LIZARD");
            put(5, "SPOCK");
        }};

        // counter variables
        int wins = 0;
        int losses = 0;
        int ties = 0;
        int gamesPlayed = 0;

        // choices
        int computerChoice, playerChoice;

        // rules
        printRules();

        // game loop
        while (true) {

            // print game stats
            printRecord(gamesPlayed, wins, losses, ties);

            // get and display choices
            playerChoice = getPlayerChoice();
            computerChoice = getComputerChoice();

            System.out.println(choices.get(playerChoice) + " versus... " + choices.get(computerChoice));

            // determine outcome of match
            switch (getResult(playerChoice, computerChoice)) {
                case 0 -> {
                    System.out.println("It's a tie!");
                    ties++;
                }
                case 1 -> {
                    System.out.println("You win!");
                    wins++;
                }
                case -1 -> {
                    System.out.println("You lose!");
                    losses++;
                }
            }

            // restart or end game
            if (!keepGoing()) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }

    /**
     * Prints the rules of the game
     */
    private static void printRules() {
        System.out.println("""
                Rock, Paper, Scissors, Lizard, Spock
                ====================================
                Rules of the Game:
                You will choose your throw. I will choose my throw. The winner will be determined based on the the following rules:
                ROCK breaks SCISSORS and crushes LIZARD
                PAPER covers ROCK and disproves SPOCK
                SCISSORS cuts PAPER and decapitates LIZARD
                LIZARD poisons SPOCK and eats PAPER
                SPOCK breaks SCISSORS and vaporizes ROCK
                ==========================================""");
    }

    /**
     * Prints the records of the game
     * @param gamesPlayed int value of total numbers of games played
     * @param wins int value of the total number of wins
     * @param losses int value of the total number of losses
     * @param ties int value of the total number of ties
     */
    private static void printRecord(int gamesPlayed, int wins, int losses, int ties) {
        System.out.println("Current Record: ");
        System.out.println("Total games played: " + gamesPlayed);
        System.out.println("Wins: " + wins + "\tLosses: " + losses + "\tTies: " + ties);
    }

    /**
     * Gets the player's choice
     * @return int value of the player's choice
     */
    private static int getPlayerChoice() {
        int playerChoice;
        while (true) {

            System.out.println("What do you throw: 1 = ROCK, 2 = PAPER, 3 = SCISSORS, 4 = LIZARD, 5 = SPOCK");
            System.out.print("Choice: ");

            try {
                playerChoice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice. Please try again.");
                scanner.nextLine();
                continue;
            }

            // check for good input
            if (playerChoice < 1 || playerChoice > 5)
                System.out.println("Invalid choice. Please try again.");
            else
                break;
        }
        return playerChoice;
    }

    /**
     * Gets the computer's choice
     * @return int value of the computer's choice
     */
    private static int getComputerChoice() {
        return random.nextInt(5) + 1;
    }

    /**
     * Determines the result of the match
     * @param playerChoice int value of the player's choice
     * @param computerChoice int value of the computer's choice
     * @return int value of the result of the match, 0 = tie, 1 = player wins, -1 = player loses
     */
    private static int getResult (int playerChoice, int computerChoice){
        return switch (playerChoice) {
            case(1) -> (playerChoice == computerChoice) ? 0 :
                    (rockLosses[0] == computerChoice || rockLosses[1] == computerChoice) ? -1 : 1;
            case(2) -> (playerChoice == computerChoice) ? 0 :
                    (paperLosses[0] == computerChoice || paperLosses[1] == computerChoice) ? -1 : 1;
            case(3) -> (playerChoice == computerChoice) ? 0 :
                    (scissorsLosses[0] == computerChoice || scissorsLosses[1] == computerChoice) ? -1 : 1;
            case(4) -> (playerChoice == computerChoice) ? 0 :
                    (lizardLosses[0] == computerChoice || lizardLosses[1] == computerChoice) ? -1 : 1;
            case(5) -> (playerChoice == computerChoice) ? 0 :
                    (spockLosses[0] == computerChoice || spockLosses[1] == computerChoice) ? -1 : 1;
            default -> {
                System.out.println("Something went wrong.");
                yield 0;
            }
        };
    }

    /**
     * Determines if the player wants to play again
     * @return boolean value of whether the player would like to play again
     */
    private static boolean keepGoing() {
        scanner.nextLine();
        String response;
        while (true) {
            System.out.print("Would you like to play again? [Y]es or [N]o: ");
            response = scanner.nextLine();

            if (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N"))
                System.out.println("Invalid response. Please try again.");
            else
                break;
        }
        return (response.equalsIgnoreCase("Y"));
    }
}