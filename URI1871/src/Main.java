import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            ArrayList<Character> list = new ArrayList<Character>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0){break;}
            String sum = Integer.toString(a + b);
            for (int i = 0; i < sum.length(); i++){
                if (sum.charAt(i) != '0') {
                    list.add(sum.charAt(i));
                }
            }
            for (int i = 0; i < list.size(); i++){
                System.out.print(list.get(i));
            }System.out.println();
        }}}



