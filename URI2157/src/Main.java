import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String S = "";
            int start = sc.nextInt(), end = sc.nextInt();
            sc.nextLine();
            for (int j = start; j <= end; j++) {
                String S1 = String.valueOf(j);
                S += S1;
            }
            for (int j = end; j >= start; j--) {
                String S1 = new StringBuilder(String.valueOf(j)).reverse().toString();
                S += S1;
            }
            System.out.println(S);
        }
    }
}
