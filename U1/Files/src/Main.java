import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1

        /*
         A method to store data in the long term
         */

        //2

        /*
         Applications can read and write to files
         */

        //3

        /*
         the java io class
         import java.io.*
         */

        //7

        /*
         Parsing means turning a string into a number
         */

        //10

        /*
         FileNotFoundExeption
         IOException
         */

        //11

        /*
        You must close them in opposite for the order you opened them
         */

        //12

//        File haikyu = new File("src/haikyu.txt");
//        FileReader reader;
//        BufferedReader bufferedReader;
//        String line;
//        int count = 1;
//
//
//        try {
//            reader = new FileReader(haikyu);
//            bufferedReader = new BufferedReader(reader);
//
//            System.out.println("A Haiku: ");
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println("Line " + count + ": " + line);
//                count++;
//            }
//            System.out.println("End of Haiku");
//
//            bufferedReader.close();
//            reader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File could not be found! " + e.getStackTrace());
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading or writing the file! " + e.getStackTrace());
//        }

        //13
//        File answers = new File("src/answers.txt");
//        FileWriter writer;
//        BufferedWriter bufferedWriter;
//        Scanner scanner = new Scanner(System.in);
//        char[] answersArray = {'A', 'B', 'A', 'D', 'C', 'B'};
//        int correct = 0;
//
//        try {
//            writer = new FileWriter(answers);
//            bufferedWriter = new BufferedWriter(writer);
//
//            while (true) {
//                System.out.print("Enter a name: ");
//                String name = scanner.nextLine();
//                if (name.equals("end")) {
//                    break;
//                } else {
//                    bufferedWriter.write(name + "\n");
//                }
//
//                System.out.print("Enter answers: ");
//                String answer = scanner.nextLine();
//
//                char[] answerarray = answer.toCharArray();
//
//                for (int i = 0; i < answersArray.length; i++) {
//                    if (answerarray[i] == answersArray[i])
//                        correct++;
//                    bufferedWriter.write(answerarray[i] + "\n");
//                }
//
//                bufferedWriter.write(correct + "\n");
//
//            }
//
//            bufferedWriter.close();
//            writer.close();
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading or writing the file! " + e.getStackTrace());
//        }

        //14

        FileReader haikuReader;
        BufferedReader bufferedReader2;

        try {
            haikuReader = new FileReader("src/haikyu.txt");
            bufferedReader2 = new BufferedReader(haikuReader);
            String line = bufferedReader2.readLine();
            ArrayList<Integer> lines = new ArrayList<>();

            while (line != null) {
                lines.add((line.replaceAll(" ","")).length());
                line = bufferedReader2.readLine();
            }

            double avg = 0;

            for (int i : lines){
                avg += i;
            }

            System.out.print("The avg of characters in the haiku is: ");
            System.out.printf("%.2f",avg/lines.size());

            bufferedReader2.close();
            haikuReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found! ");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file! " + e.getStackTrace());
            System.err.print("IOException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("An error occurred while getting the average");
            System.err.println("ArithmeticException: " + e.getMessage());
        }

    }
}