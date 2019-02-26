import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a -- > 0){
            String T1 = sc.next();
            String T2 = sc.next();
            int end = 0;
            int min = Math.min(T1.length(), T2.length());
            for (int i = 0; i < min; i++) {
                end++;
                System.out.print(T1.substring(i, end) + T2.substring(i, end));
            } if (T1.length() >= T2.length()){
                System.out.println(T1.substring(end));
            } else {
                System.out.println(T2.substring(end));
            }
        }
    }
}
