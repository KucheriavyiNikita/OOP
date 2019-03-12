import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= n; i += 2) {
                for (int j = 1; j <= n / 2 - i / 2; j++)
                    System.out.print(" ");
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                System.out.println();
            }
            for (int i = 1; i <= n / 2; i++)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
            for (int i = 1; i <= n / 2 - 1; i++)
                System.out.print(" ");
            System.out.println("***");
            System.out.println();
        }
    }

}