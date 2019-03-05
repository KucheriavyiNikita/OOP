import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int N = 2000000;

        ArrayList<Integer> a2 = new ArrayList<Integer>();

        long beg2 = System.currentTimeMillis();
        for (int i = 0; i < N; ++i) {
            a2.add(i);
            // a2.add(new Integer(i)); //autoboxing
        }
        long end2 = System.currentTimeMillis();

        System.out.println(end2 - beg2);

        ArrayListInt a1 = new ArrayListInt();

        long beg1 = System.currentTimeMillis();
        for (int i = 0; i < N; ++i) {
            a1.add(i);
        }
        long end1 = System.currentTimeMillis();

        System.out.println(end1 - beg1);
    }
}