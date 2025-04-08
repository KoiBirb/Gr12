import java.util.ArrayList;

public class Queues {

    private ArrayList<String> numbers;

    public Queues() {
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
