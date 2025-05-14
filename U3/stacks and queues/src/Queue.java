import java.util.ArrayList;

public class Queue {

    private ArrayList<String> numbers;

    public Queue() {
        numbers = new ArrayList<>();
    }

    public void add(String number) {
        numbers.add(number);
    }

    public int size() {
        return numbers.size();
    }

    public String remove() {
        if (numbers.isEmpty()) {
            return null;
        }

        return numbers.removeFirst();
    }

    public String peek() {
        if (numbers.isEmpty()) {
            return null;
        }

        return numbers.getFirst();
    }
}
