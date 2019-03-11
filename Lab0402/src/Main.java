import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<Integer>();

        while (scan.hasNextInt()) {
            int x = scan.nextInt();
            a.add(x);
        }

        System.out.println(a);

        for (int i = 0; i < a.size();) {
            if (a.get(i) % 2 == 0) {
                a.add(i, 0);
                ++i;
            }
            ++i;
        }

        System.out.println(a);

        for (int i = 0; i < a.size();) {
            if (a.get(i) % 2 != 0) {
                a.remove(i);
            } else {
                ++i;
            }
        }

        System.out.println(a);
    }

}