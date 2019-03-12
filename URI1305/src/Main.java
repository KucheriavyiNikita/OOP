import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String S1 = sc.nextLine();
            String S2 = sc.nextLine();
            if (!S1.contains(".")) S1 = S1 + ".";
            if (!S2.contains(".")) S2 = S2 + ".";
            if (S1.charAt(0) == '.') S1 = "0" + S1;
            if (S2.charAt(0) == '.') S2 = "0" + S2;
            double num = Double.parseDouble(S1);
            int n = (int) num;
            num -= n;
            double nn = Double.parseDouble(S2);
            if (num > nn) {
                n++;
            }
            System.out.println(n);
        }
    }
}
