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
     * Default constructor. Constructs ArrayList with DEFAULT_INIT_CAPACITY
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
     * Helper method that grows the internal array by GROWTH_FACTOR
     */
    private void grow() {
        int newLength = (int)(array.length * GROWTH_FACTOR);
        Arrays.copyOf(array, newLength);
    }
}