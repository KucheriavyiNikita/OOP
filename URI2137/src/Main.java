import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine()), k;
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = Integer.parseInt(sc.nextLine());
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (ints[j] > ints[j + 1]) {
                        k = ints[j];
                        ints[j] = ints[j + 1];
                        ints[j + 1] = k;
                    }
                }
            }
            String S;
            for (int i = 0; i < n; i++) {
                S = String.valueOf(ints[i]);
                while (S.length() != 4) {
                    S = "0" + S;
                }
                System.out.println(S);}}}}
