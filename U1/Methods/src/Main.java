import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1 & 2
        createBar(10, '*');
        System.out.println();

        //3
        createBox(5, 3, '$');

        //4
        createHollowBox(5, 4, '*');

        //5
        createHouse();

        //6

        /**
         * Finds the average of a set of test scores.
         * @param numTest the number of test scores to average
         * @return Double number of the average of the test scores
         */
//        double average(int numTest) {
//            double total = 0.0;
//            for (int i = 0; i < numTest; i++) {
//                System.out.print(“Enter a test score: ”);
//                double score = input.nextDouble();
//                total += score;
//            }
//            double avg = total / (double)numTestl
//            return avg;
//        }//end average(int)

        //7

        /**
         * Simulates choosing a random playing card from a deck of 52 cards.
         * A = 1, J = 11, Q = 12, K = 13. Hearts are 1 - 13, Diamonds are 14 - 26,
         * Clubs are 27 - 39, and Spades are 40 - 52.
         * @return		Returns the integer that corresponds to the random card.
         */
//        private int pickcard(){
//            Random random = new Random();
//            int card = random.nextInt(52) + 1;
//        }

        //8
        System.out.println(powerOf4(2));

        //9
        translate(5);

        //10 ---

        //11
        calculator();
    }

    /**
     * Returns the number to the 4th power
     * @param int x to be raised to the 4th power
     * @return int x raised to the 4th power
     */
    private static int powerOf4 (int x){
        return x * x * x * x;
    }

    /**
     * Translates a number from 1 to 10 to its Spanish equivalent
     * @param int x number to be translated
     */
    private static void translate (int x) {
        switch (x) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    private static void createBox(int width, int height, char symbol) {
        for (int i = 0; i < height; i++) {
            createBar(width, symbol);
            System.out.println();
        }
    }

    private static void createBar(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
    }

    private static void createHollowBox(int width, int height, char symbol) {
        createBar(width, symbol);
        System.out.println();
        for (int i = 0; i < height-2; i++) {
            System.out.print(symbol);
            for (int j = 0; j < width-2; j++) {
                System.out.print(" ");
            }
            System.out.println(symbol);
        }
        createBar(width, symbol);
    }

    private static void createHouse(){
        addRoof();
        addBase();
        createPath();
    }

    private static void addRoof(){
        System.out.println("""
                   /\\
                  / \\
                 /   \\
                /     \\""");
    }

    private static void addBase() {
        System.out.println("""
                            _____
                            |    |
                            |    |
                            -----""");
    }

    private static void createPath(){
        System.out.println("""
                    **
                    ********""");
    }

    private static int sum (int a, int b) {
        return a + b;
    }

    private static int difference (int a, int b) {
        return a - b;
    }

    private static int product (int a, int b) {
        return a * b;
    }

    private static int quotient (int a, int b) {
        return a / b;
    }

    private static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the operation (+ - / *): ");
        scanner.nextLine();
        String operation = scanner.nextLine();

        switch (operation) {
            case "+":
                System.out.println(sum(a, b));
                break;
            case "-":
                System.out.println(difference(a, b));
                break;
            case "*":
                System.out.println(product(a, b));
                break;
            case "/":
                System.out.println(quotient(a, b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}