/*
 Notes:
    Default internal length of ArrayList arrays is 10
    ArrayLists grow by a factor of 1.5
    ArrayLists do not shrink unless the trimToSize() method is called 

 TODO: Add the following methods
    add
    remove
    get
    print
 */

import java.util.Arrays;

public class MyArrayList<T> {
    /** Internal array. Will store objects of type T */
    private Object[] array;

    /** Tracks how much of internal array is being used */
    private int size;

    /** Factor array should grow by */
    private static final double GROWTH_FACTOR = 1.5;

    /** Default length of internal array */
    private static final int DEFAULT_INIT_CAPACITY = 10;

    /**
     * Default constructor. Constructs ArrayList with {@link #DEFAULT_INIT_CAPACITY}
     */
    public MyArrayList() {
        this(DEFAULT_INIT_CAPACITY);
    }

    /**
     * Overloaded constructor
     * @param initialCapacity initial length of internal array
     */
    public MyArrayList(int initialCapacity) {
        array = new Object[initialCapacity];
        size = 0;
    }

    /**
     * Adds element to end of the list
     * @param el element to add
     */
    public void add(T el) {
        add(size, el);
    }

    /**
     * Inserts element at specified index. Shifts element currently at that index and all subsequent elements to the right
     * @param index index at which element is to be inserted
     * @param el    element to be inserted
     * @throws IndexOutOfBoundsException if index is out of range {@code (index < 0 || index > size())}
     */
    public void add(int index, T el) throws IndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index is outside range (index < 0 || index > size())");
        
        if (size == array.length)
            grow();

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = el;
        
    }

    /**
     * Get number of elements in list
     * @return number of elements in list
     */
    public int size() {
        return size;
    }

    /**
     * Helper method that grows the internal array by {@link #GROWTH_FACTOR}
     */
    private void grow() {
        int newLength = (int)(array.length * GROWTH_FACTOR);
        Arrays.copyOf(array, newLength);
    }
}