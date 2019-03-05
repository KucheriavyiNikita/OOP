import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayListInteger a = new ArrayListInteger();
    while (sc.hasNextInt()){
        int x = sc.nextInt();
        a.add(x);

    }
    System.out.println(a);




    }
}
