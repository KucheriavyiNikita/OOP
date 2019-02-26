import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int j = 0; j < Integer.parseInt(a); j++) {
            String en = sc.nextLine();
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            int max = 0;
            int[] counts = countLetters(en.toLowerCase());
            for (int i = 0; i < counts.length; i++) {
                list1.add(counts[i]);
                if (counts[i] > max) {
                    max = counts[i];
                } }
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) == max) {
                    System.out.print((char) (i + 'a'));
                }
            }System.out.println();
        } }
    private static int[] countLetters(String en) {
        int[] letters = new int[26];
        for (int i = 0; i < en.length(); i++) {
            if (Character.isLetter(en.charAt(i)))
                letters[en.charAt(i) - 'a']++;
        }
        return letters;
    }}
