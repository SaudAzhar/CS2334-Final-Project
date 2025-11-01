class George {
    private static int nextIndex = 0;
    private int index;
    public String toString() {return "George" + index;}

    public George() {
        index = nextIndex++;
    }
}

public class ArrayListTests {
    public static void main(String[] args) {
        MyArrayList<String> arr = new MyArrayList<String>(2);
        arr.populateRandomStrings(1000000);
        arr.remove(arr.size() - 1);
    }
}
