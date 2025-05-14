import java.util.ArrayList;

public class Stack {

    private ArrayList<Integer> numbers;

    public Stack() {
        numbers = new ArrayList<>();
    }

    public void push(int number) {
        numbers.add(number);
    }

    public int size() {
        return numbers.size();
    }

    public int pop() {
        if (numbers.isEmpty()) {
            return -1;
        }

        return numbers.removeLast();
    }

    public int peek() {
        if (numbers.isEmpty()) {
            return -1;
        }

        return numbers.getLast();
    }
}
