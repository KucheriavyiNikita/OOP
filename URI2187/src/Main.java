import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String saida;

        while(in.hasNextLine()) {
            String entrada = in.nextLine();
            saida = "";

            for(int i=0; i<entrada.length(); i++) {
                if(entrada.charAt(i) != ',' && entrada.charAt(i) != '.' && entrada.charAt(i) != ' ') {
                    if(entrada.charAt(i) == 'l') saida = saida +
                            '1';
                    else if(entrada.charAt(i) == 'o' || entrada.charAt(i) == 'O') saida = saida + '0';
                    else if(Character.isDigit(entrada.charAt(i)))saida = saida + entrada.charAt(i);
                }
            }

            if(!(saida.equals(""))) {
                Integer num = Integer.parseUnsignedInt(saida);

                if(num <= 2147483647 && num >= 0) {


                    if(num != 0) System.out.println(saida);
                    else System.out.println("0");
                }
                else System.out.println("error");
            }
            else System.out.println("error");

        }
        in.close();

    }
}
