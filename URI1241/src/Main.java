import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a --> 0){
            String b1 = sc.next();
            String b2 = sc.next();
            if (b1.endsWith(b2)){
                System.out.println("encaixa");
            }else {
                System.out.println("nao encaixa");
            }
        }
    }
}
