import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String S = sc.nextLine();
            for (int k = 0; k < S.length(); k++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < S.length() - 1 - k; i++) {
                    System.out.print(S.charAt(i) + " ");
                }
                System.out.println(S.charAt(S.length() - 1 - k));
            }
            System.out.println();
        }
    }
}
