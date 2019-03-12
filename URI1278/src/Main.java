import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean cond = true;
        while ((n = Integer.parseInt(sc.nextLine())) != 0) {
            if (cond) {
                cond = false;
            } else System.out.println();
            String[] S = new String[n];
            int max = 0;

            for (int i = 0; i < n; i++) {
                S[i] = sc.nextLine().trim();
                while (S[i].contains("  ")) {
                    S[i] = S[i].replaceAll("  ", " ");

                }
                if (S[i].length() > max) {
                    max = S[i].length();
                }
            }

            for (int i = 0; i < n; i++) {
                while (S[i].length() != max) {
                    S[i] = " " + S[i];
                }
                System.out.println(S[i]);
            }
        }
    }
}