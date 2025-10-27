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

public class MyArrayList<T> {
    private Object[] array;
    private int size;
    private static final double GROWTH_FACTOR = 1.5;
    private static final int DEFAULT_INIT_CAPACITY = 10;

    public MyArrayList() {
        MyArrayList(DEFAULT_INIT_CAPACITY);
    }

    public MyArrayList(int initialCapacity) {
        array = new Object[initialCapacity];
        size = 0;
    }
}