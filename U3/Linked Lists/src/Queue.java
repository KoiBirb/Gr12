public class Queue {

    LinkedList list = new LinkedList();

    public Queue() {
        list = new LinkedList();
    }

    public void enqueue(String data) {
        list.insertAtTail(data);
    }

    public String dequeue() {
        String data = list.getValue();
        list.remove(data);
        return data;
    }

    public String peek() {
        return list.getValue();
    }

    public String toString() {
        return list.toString();
    }
}
