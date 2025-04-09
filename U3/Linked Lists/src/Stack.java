public class Stack {

    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    public void push(String data) {
        list.insertAtHead(data);
    }

    public String pop() {
        String data = list.getValue();
        list.remove(data);
        return data;
    }

    public String peek() {
        return list.getValue();
    }
}
