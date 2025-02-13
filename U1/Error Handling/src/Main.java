import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1

        /*
         Catching errors to prevent runtime crashes
         */

        //2

        /*
         By using try catch statements we can run code blocks that can
         produce errors then catch certain errors, allowing us to handle them properly
         */

        //3

        /*
         As many catch statements as you want
         */

        //4

        /*
         Someone might want to throw and exception that better describes the issue
         */

        //5

        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("Enter a number: ");
//            int x = scanner.nextInt();
//            System.out.print("Enter another number: ");
//            int y = scanner.nextInt();
//            System.out.println(x / y + " " + x % y);
//        } catch (ArithmeticException e) {
//            System.out.println("You can't divide by zero!");
//        } catch (InputMismatchException e) {
//            System.out.println("Incorrect input");
//        }  catch (Exception e) {
//            System.out.println("An error occurred");
//        }

        //6

//        int input = -1;
//
//        while (input < 1 || input > 100) {
//            System.out.print("Enter an integer between 1 and 100: ");
//
//            try {
//                input = scanner.nextInt();
//                if (input < 1 || input > 100) {
//                    System.out.println("Invalid input");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input");
//                scanner.nextLine();
//            }
//        }
//
//        for (int i = 1; i < 101; i++){
//            if (i % input == 0){
//                System.out.println(i);
//            }
//        }

        //7


    }
}