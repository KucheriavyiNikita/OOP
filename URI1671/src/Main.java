import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for(int i = 0; i < a;i++) {
            ArrayList<Character> list = new ArrayList<Character>();
            String l1 = scn.next();
            String l2 = scn.next();
            char st = 0;
            int stint = 0;
            int r = 0;
            if (!l1.equals(l2)) {
                for (int j = 0; j < l1.length(); j++) {
                    st = l1.charAt(j);
                    int s = 1;
                    while (st != l2.charAt(j)) {
                        stint = (char) (l1.charAt(j) + s);
                        if (stint > 122) {
                            stint -= 26;
                        }
                        st = ((char) stint);
                        s++;
                        r++;
                    }}}
            System.out.println(r);
        }}}
