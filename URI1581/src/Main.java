import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int z = 0; z < a; z++) {
            String word = null;
            int b = sc.nextInt();
            ArrayList<String> list = new ArrayList<String>();
            for (int i =0; i < b; i++){
                word = sc.next();
                list.add(word);
            }
            int count = 0;
            for (int i =0; i < b; i++){
                if (list.get(0).equals(list.get(i))){
                    count++;
                }
            }
            if (count == b){
                System.out.println(word);
            }else {
                System.out.println("ingles");
            } } } }