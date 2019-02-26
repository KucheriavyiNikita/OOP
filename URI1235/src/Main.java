import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Integer.parseInt(a);
        for (int i = 0; i < Integer.parseInt(a); i++){
            String words = sc.nextLine();
            StringBuilder stb = new StringBuilder(words).reverse();

            int half = words.length() / 2;

            System.out.println(stb.substring(half, stb.length())+ stb.substring(0, half));

        }
    }
}