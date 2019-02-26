import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int start = 0; start <Integer.parseInt(a); start++){
            String  b = sc.next();
            int totalValue = 0;

            for (int elementOfInput = 0; elementOfInput < Integer.parseInt(b); elementOfInput++){
                String word = sc.next();

                for (int i = 0; i < word.length(); i++){
                    int z = (int)(word.charAt(i));
                    totalValue += (z - 65) + elementOfInput + i;

                }}
            System.out.println(totalValue);
        }}}
