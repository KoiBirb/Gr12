import java.util.*;

public class Main {
    public static void main(String[] args) {
       /*

        1. A stack is a LIFO data structure

        2. LIFO

        3. A queue is a FIFO data structure

        4. FIFO

        5. Good for solving recursive problems

        6. Prevents access to middle terms

        7. Can handle multiple data types

        8. not easily searchable

        */

        // 9

        Stack<Character> stack = new Stack<>();

        String str = "broomstick";

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Reversed string: " + reversed);

        Queue<Character> queue = new LinkedList<>();

        for (char c : str.toCharArray()) {
            queue.add(c);
        }

        String reversedQueue = "";

        while (!queue.isEmpty()) {
            reversedQueue = queue.poll() + reversedQueue;
        }

        System.out.println("Reversed string using queue: " + reversedQueue);

        // 10

//        Stack<Integer> ints = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//
//        int input;
//
//        do {
//            System.out.print("Enter a number (999 to quit): ");
//            input = scanner.nextInt();
//            ints.push(input);
//        } while (input != 999);
//
//        System.out.println("You entered: ");
//
//        while (!ints.isEmpty()) {
//            ints.pop();
//            System.out.println(ints.pop());
//        }

        // 11

        Queue<Integer> sortedQueue = new LinkedList<>();

        int[] numbers1 = {1, 3, 7, 12, 13};
        int[] numbers2 = {2, 6, 14, 15};

        int index1 = 0;
        int index2 = 0;

        while (index1 < numbers1.length && index2 < numbers2.length) {
            if (numbers1[index1] <= numbers2[index2]) {
                sortedQueue.add(numbers1[index1]);
                index1++;
            } else {
                sortedQueue.add(numbers2[index2]);
                index2++;
            }
        }

        while (index1 < numbers1.length) {
            sortedQueue.add(numbers1[index1]);
            index1++;
        }

        while (index2 < numbers2.length) {
            sortedQueue.add(numbers2[index2]);
            index2++;
        }

        while (!sortedQueue.isEmpty()) {
            System.out.println(sortedQueue.poll());
        }




    }
}