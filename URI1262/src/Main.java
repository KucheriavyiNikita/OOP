import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            int num = sc.nextInt();
            int sumW = 0;
            int i = 0; int s = 0;
            while (true) {
                if (i == input.length()) {
                    System.out.println(sumW);
                    break;
                } else {
                    while (input.charAt(i) == 'R') { s++;   i++;
                        if (s == num) { sumW++;    s = 0; }
                        if (i == input.length()) {
                            break; } }
                    if (s >= 1) {
                        sumW++;
                        s = 0; }
                    if (i == input.length()) {
                        continue;
                    } else {
                        while (input.charAt(i) == 'W') {
                            sumW++;
                            i++;
                            if (i == input.length()) {
                                break;
                            } } } } } } }}