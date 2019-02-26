import java.util.ArrayList;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                ArrayList<Character> line = new ArrayList<Character>();
                String input = sc.nextLine();
                for (int i = 0; i < input.length(); i++) {
                    if (Character.isLetter(input.charAt(i))) {
                        if (Character.isUpperCase(input.charAt(i))) {
                            line.add((char) ((input.charAt(i) + 13 - (int) ('A')) % 26 + (int) 'A'));
                        } else if (Character.isLowerCase(input.charAt(i))) {
                            line.add((char) ((input.charAt(i) + 13 - (int) ('a')) % 26 + (int) 'a'));
                        }
                    } else {
                        line.add(input.charAt(i));
                    }
                }
                for (int i = 0; i < line.size(); i++) {
                    System.out.print(line.get(i));
                }
                System.out.println();
            }}}
