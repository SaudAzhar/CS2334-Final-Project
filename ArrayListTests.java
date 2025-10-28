public class ArrayListTests {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<Integer>();
        arr.debugPrint();
        arr.print();

        arr.add(3);
        arr.add(8);
        arr.debugPrint();
        arr.print();

        arr = new MyArrayList<Integer>(1);
    }
}
