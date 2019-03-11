import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayListInt a = new ArrayListInt();

        while (scan.hasNextInt()) {
            int x = scan.nextInt();
            a.add(x);
        }

        System.out.println(a);
        reverse(a);
        System.out.println(a);
        System.out.println(a.get(7));
    }

    static void reverse(ArrayListInt a) {
        for (int i = 0; i < a.size() / 2; ++i) {
            // int t = a[i];
            int t = a.get(i);
            // a[i] = a[a.size() - 1 - i];
            a.set(i, a.get(a.size() - 1 - i));
            // a[a.size() - 1 - i] = t;
            a.set(a.size() - 1 - i, t);
        }
    }

}