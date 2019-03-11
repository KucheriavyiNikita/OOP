public class ArrayListInt {
    private static int[] EMPTY_DATA = {};

    private int[] data;

    public ArrayListInt() {
        data = EMPTY_DATA;
    }

    public void add(int e) {
        int[] tempData = new int[data.length + 1];
        for (int i = 0; i < data.length; ++i) {
            tempData[i] = data[i];
        }
        tempData[data.length] = e;
        data = tempData;
    }

    @Override
    public String toString() {
        String res = "[ ";

        for (int i = 0; i < data.length; ++i) {
            res += data[i] + " ";
        }

        res += "]";

        return res;
    }
}