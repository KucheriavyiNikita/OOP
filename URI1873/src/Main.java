import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i =0; i < Integer.parseInt(a); i++){
            String raj = sc.next();
            String shel = sc.next();

            if (raj.equals(shel)){
                System.out.println("empate");
            }else if ((raj.equals("tesoura") && shel.equals("papel"))||
                    (raj.equals("papel")&&shel.equals("pedra")) ||
                    (raj.equals("pedra") && shel.equals("lagarto")) ||
                    (raj.equals("lagarto") && shel.equals("spock")) ||
                    (raj.equals("spock") && shel.equals("tesoura")) ||
                    (raj.equals("tesoura") && shel.equals("lagarto")) ||
                    (raj.equals("lagarto") && shel.equals("papel")) ||
                    (raj.equals("papel") && shel.equals("spock")) ||
                    (raj.equals("spock") && shel.equals("pedra")) ||
                    (raj.equals("pedra") && shel.equals("tesoura"))){

                System.out.println("rajesh");

            }else{

                System.out.println("sheldon");
            } } } }