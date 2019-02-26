import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a --> 0) {
            String S = sc.next();
            char[] ch = S.toCharArray();
            if(ch.length == 5) {
                System.out.println("3");
            }else if((ch[0]== 't' && ch[1] == 'w'|| (ch[0] == 't' && ch[2] == 'o')||(ch[1] == 'w' && ch[2] == 'o'))){
             System.out.println("2");

            }
            else {
                System.out.println("1");
            }
        }
    }
}
