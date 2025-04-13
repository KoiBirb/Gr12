public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addFront(Song song) {
        Node newNode = new Node(song);
        newNode.setNext(head);
        head = newNode;
    }

    public void removeFront() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public void peekFront() {
        if (head != null) {
            System.out.println("Front song: " + head.getSong().getTitle() + " by " + head.getSong().getArtist());
        } else {
            System.out.println("The list is empty.");
        }
    }
}
