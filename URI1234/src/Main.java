import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            ArrayList<Character> list = new ArrayList<Character>();
            String words = sc.nextLine().toUpperCase();

            for (int w = 0; w < words.length(); w++) {
                list.add(words.charAt(w));
            }
            int beg = 2;
            for (int i = 0; i < list.size(); i++) {
                if (Character.isLetter(list.get(i))) {
                    if (beg % 2 != 0) {
                        list.set(i, list.get(i).toLowerCase(list.get(i)));
                    }
                    beg++;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
        }}}