/*
 * Main.java
 * Leo Bogaert
 * February 24, 2025,
 * Determines grades for students and stores the information in a file
 */

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Declaring global variable
    static FileReader fileReader;
    static FileWriter fileWriter;
    static BufferedReader bufferedReader;
    static BufferedWriter bufferedWriter;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("""
                Teacher’s Gradebook
                ==================================
                Enter file name:""");

        // initialize and create files if not already created
        File gradesFile = createFile("src/grades.txt");
        File studentsFile = createFile("src/" + scanner.nextLine());

        System.out.println("... \nClass load complete.\n==================================");

        // store students names and grades
        String[] students = loadStudents(studentsFile);
        int[] grades = new int[students.length];

        // determine grades
        for (int i = 0; i < students.length; i++) {

            // ensure good input
            while (true) {
                System.out.print("Enter grades for " + students[i] + ": ");
                try {
                    grades[i] = scanner.nextInt();
                    if (grades[i] < 0 || grades[i] > 100)
                        System.out.println("Invalid grade. Please enter a grade between 0 and 100");
                     else
                        break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid grade. Please enter a Integer number");
                    scanner.next();
                }
            }
        }

        saveGrades(gradesFile, grades, students);

        scanner.close();

        System.out.println("Session Terminated...Goodbye");
    }

    /**
     * Creates a file if it does not already exist
     * @param fileName name of file to be created
     * @return object of the file created
     */
    private static File createFile(String fileName) {
        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file");
                System.err.println("IOException: " + e.getMessage());
            }
        }
        return file;
    }

    /**
     * Loads students from a file
     * @param file file object with string of students names separated by new line
     * @return String array of students names
     */
    private static String[] loadStudents (File file) {
        String[] students = new String[0];

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String names = "";
            String name = bufferedReader.readLine();

            while (name != null) {
                names += name + " ";
                name = bufferedReader.readLine();
            }

            students = names.split(" ");

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error finding file");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file");
            System.err.println("IOException: " + e.getMessage());
        }

        return students;
    }

    /**
     * Saves grades to a file
     * @param file file object to save grades to
     * @param grades array of grades for students
     * @param names array of students names
     */
    private static void saveGrades(File file, int[] grades, String[] names) {
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i] + "  " + grades[i] + "  " + determineLetterGrade(grades[i]));
                bufferedWriter.write(names[i] + "  " +  grades[i] + "  " + determineLetterGrade(grades[i]) + "\n");
            }

            bufferedWriter.close();
            fileWriter.close();
        } catch  (FileNotFoundException e){
            System.out.println("Error finding file");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file");
            System.err.println("IOException: " + e.getMessage());
        }

        System.out.print("==================================\nReport successfully saved to file: "
                + file.getName() + "\n==================================\n" );
    }

    /**
     * Determines the letter grade based on the grade
     * @param grade integer value of the grade
     * @return letter value of the grade
     */
    private static String determineLetterGrade (int grade) {
        return switch (grade / 10) {
            case 10, 9 -> "A+";
            case 8 -> "A";
            case 7 -> "B";
            case 6 -> "C";
            case 5 -> "D";
            default -> "F";
        };
    }
}