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
        MyArrayList<Integer> arr = new MyArrayList<Integer>();
        arr.debugPrint();
        arr.print();

        arr.add(3);
        arr.add(8);
        arr.debugPrint();
        arr.print();

        System.out.println("New test");
        arr = new MyArrayList<Integer>(0);
        arr.debugPrint();
        arr.add(2);
        arr.debugPrint();
        arr.add(4);
        arr.debugPrint();
        arr.add(7);
        arr.debugPrint();
        arr.add(20);
        arr.debugPrint();
        arr.add(-4);
        arr.debugPrint();

        System.out.println("New test");
        MyArrayList<George> gArr = new MyArrayList<George>(7);
        gArr.add(new George());
        gArr.add(new George());
        gArr.add(new George());
        gArr.add(new George());
        gArr.add(new George());
        gArr.add(new George());
        gArr.debugPrint();
        gArr.add(3, new George());
        gArr.debugPrint();
        gArr.add(5, new George());
        gArr.debugPrint();

    }
}
