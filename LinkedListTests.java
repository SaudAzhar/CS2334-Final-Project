public class LinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<Integer>();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.remove(3);

        ll.print();
    }
}
