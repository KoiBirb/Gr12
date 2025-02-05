import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1

        int counter1 = 0;
        int counter2 = 0;

        for(int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        do {
            System.out.println(counter1);
            counter1++;
        } while(counter1 < 6);

        while (counter2 < 6) {
            System.out.println(counter2);
            counter2++;
        }

        //2

        int guessMe = 8;
        int number = 1;

        while (guessMe != number) {
            if (number < guessMe) {
                System.out.println("Too low");
            } else {
                System.out.println("oops");
                break;
            }
            number++;
        }
        System.out.println("Found it!");

        //3

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        int total = 0;

        for (int i = 1; i < (x+1); i++){
            System.out.println(i);
            total += i;
            //skibbity sigma
        }
        System.out.println("The sum is: " + total);

        //4

        System.out.print("Enter an integer between 1 and 100");
        int y = scanner.nextInt();

        System.out.println("The multiples of " + y + " are:");
        for (int i = 1; i <= 100; i++){
            if (i * y <= 100){
                System.out.println(i * y);
            }
        }

        //5

        ArrayList<Integer> intArr = new ArrayList<>();
        boolean keepGoing = true;
        double totalGrade = 0;

        while (keepGoing){
            System.out.print("Enter a test score: ");
            intArr.add(scanner.nextInt());

            if (intArr.contains(999)){
                intArr.removeLast();
                for (int i = 0; i < intArr.size(); i++){
                    totalGrade += intArr.get(i);
                }
                totalGrade /= intArr.size();
                keepGoing = false;
            }
        }
        System.out.println("Your average test score is " + totalGrade + " %");

        //6

        System.out.print("Enter a number: ");
        int z = scanner.nextInt();
        int factorial = 1;

        for(int i = 1; i <= z; i++){
            factorial *= i;
        }

        System.out.println(z + "! = " + factorial);

        //7

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < a; i++){
            if (a % i == 0) {
                System.out.println(a + " is not a prime number");
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(a + " is a prime number");
    }
}