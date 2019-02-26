import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            ArrayList<String> list = new ArrayList<String>();
            String a = sc.nextLine();
            for(int j = 0; j < a.length(); j++){
                list.add(a.substring(j, j+1)); }
            int stars = 0;
            int shift = 0;
            for (int i=0; i < list.size(); i++){
                if (list.get(i).equals("_")){
                    shift++;
                    if (shift % 2 ==0){
                        list.set(i, "</i>");
                    }else {
                        list.set(i, "<i>");   } }
                else if (list.get(i).equals("*")){
                    stars++;
                    if (stars % 2 == 0){
                        list.set(i, "</b>");
                    }else {
                        list.set(i, "<b>");
                    } } }
            for (int i = 0; i < list.size(); i++){
                System.out.print(list.get(i));
            }System.out.println();
        }}}