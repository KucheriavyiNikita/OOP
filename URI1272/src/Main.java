import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String words = sc.nextLine();
        for (int j = 0; j < a; j++){
            ArrayList<String> list = new ArrayList<String>();
            words = sc.nextLine();
            for (int i = 0; i < words.length(); i++){
                if (words.substring(i, i + 1).equals(" ")){
                }else{
                    list.add(words.substring(i, i + 1));
                    if (i + 1 == words.length()){
                        break;
                    }else {
                        while (!words.substring(i, i+1).equals(" ")){
                            i++;
                            if (i + 1 == words.length() ){
                                break;
                            } } } } }
            for (int i = 0; i < list.size(); i++){
                System.out.print(list.get(i));
            }System.out.println();
        }}}
