import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        while(a > 0){
            ArrayList<String> list = new ArrayList<String>();
            int max = 0;
            for(int i = 0;i < a;i++){
                String l = scn.next();
                list.add(l);
                if(max <= l.length()){
                    max = l.length();
                }
            }
            String format = "%" + max + "s%n";

            for(int i = 0;i < list.size();i++){
                System.out.printf(format, list.get(i));
            }
            a = scn.nextInt();
            if(a != 0){
                System.out.println();
            }
        }}}