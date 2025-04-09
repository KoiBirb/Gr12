public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insertAtHead(String data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtTail(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void remove(String str) {
        Node current = head;
        Node previous;

        if (current.getData().equals(str)) {
            head = current.getNext();
        }

        else {
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
                if (current.getData().equals(str)) {
                    previous.setNext(current.getNext());
                }
            }
        }
    }

    public String toString() {
        Node current = head;
        String listString;

        if (current != null) {
            listString = current.getData() + "\n";
            while (current.getNext() != null) {
                current = current.getNext();
                listString += current.getData() + "\n";
            }
            return listString;
        } else return "There are no items in the list.";
    }

    public int size () {
        Node current = head;
        int size = 0;

        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public String getValue(){
        return (head == null) ? null : head.getData();
    }

    public void clear() {
        head = null;
    }

}
