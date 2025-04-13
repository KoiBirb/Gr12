public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFront(new Song ("Song 1", "Artist 1"));
        list.addFront(new Song("Song 2", "Artist 2"));
        list.addFront(new Song("Song 3", "Artist 3"));

        list.peekFront();

        list.removeFront();

        list.peekFront();





    }
}