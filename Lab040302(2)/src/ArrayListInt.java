public class ArrayListInt {
    private static final int DEFAULT_CAPACITY = 10;
    private static int[] EMPTY_DATA = {};

    private int[] data;
    private int size;

    public ArrayListInt() {
        data = EMPTY_DATA;
    }

    public void add(int e) {
        if (size == data.length) {
            int newCapacity = data.length == 0 ?
                    DEFAULT_CAPACITY: data.length  + data.length / 2;
            int[] tempData = new int[newCapacity];
            for (int i = 0; i < size; ++i) {
                tempData[i] = data[i];
            }
            data = tempData;
        }
        data[size] = e;
        ++size;
    }

    @Override
    public String toString() {
        String res ="[ ";

        for (int i = 0; i < data.length; ++i) {
            res += (data[i] + " ");
        }

        res += "]";

        return res;
    }
    public int get(int index) {
        if (index < 0 || index >- size) {
            throw new IndexOutOfBoundsException("ArrayListInt: incorrect index" + index);
        }
        return data[index];

    }
    public void set(int index,int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("ArrayListInt: incorrect index" + index);
        }
        data[index] = value;
    }
    public int size(){
        return size;
    }
    private void rangeCheck(int index){

    }
}