/**
 * Uses 0-based indexing.
 * 
 * TODO: Fix the remove function so it actually removes.
 **/
public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        this.head = new Node<T>(null);
        this.tail = this.head;
        this.size = 0;
    }

    /**
     * Prints all values in order
     **/
    public void print() {
        Node<T> curr_node = this.head;
        while (curr_node.hasNext()) {
            curr_node = curr_node.getNext();
            System.out.print(curr_node.getValue() + " ");
        }
    }

    /**
     * Appends to the end of the list
     **/
    public void add(T value) {
        Node<T> newNode = new Node(value);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    /**
     * Checks whether a given index is valid for this LinkedList.
     **/
    private boolean validIndex(int idx) {
        if (idx < this.size && idx >= 0) {
            return true;
        }
        return false;
    }

    /**
     * Gets the value at some index in the LinkedList
     **/
    public T get(int index) {
        int curr_idx = 0;
        Node<T> curr_node = this.head;
        if (!validIndex(index)) {
            String msg = String.format("LinkedList of size %d has no value at index: %d", this.size, index);
            throw new IndexOutOfBoundsException(msg);
        }
        while (curr_node.hasNext()) {
            if (curr_idx == index) {
                return curr_node.getValue();
            }
            curr_idx++;
            curr_node = curr_node.getNext();
        }

        // This should never happen.
        return null;
    }

    /**
     * Gets the value at some index in the LinkedList
     **/
    public void remove(int index) {
        int curr_idx = 0;
        Node<T> curr_node = this.head;
        if (!validIndex(index)) {
            String msg = String.format("LinkedList of size %d has no value at index: %d", this.size, index);
            throw new IndexOutOfBoundsException(msg);
        }
        while (curr_node.hasNext()) {
            if (curr_idx + 1 == index) {
                Node<T> removed_node = curr_node.getNext();
                Node<T> new_next = removed_node.getNext();
                removed_node.setNext(null);
                curr_node.setNext(new_next);
            }
            curr_idx++;
            curr_node = curr_node.getNext();
        }
        String msg = String.format("LinkedList has no value at index: %d", index);
        throw new IndexOutOfBoundsException(msg);
    }
}
