import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while (c != 0) {
            ArrayList<String> list = new ArrayList<String>();
            String a = Integer.toString(c);
            String b = sc.next();
            int dis = 0;
            int index = 0;
            for (int i =0; i < b.length(); i++){
                list.add(b.substring(i, i+1)); }
            for (int i =0; i < list.size(); i++){
                if (list.get(i).equals(a)){
                    list.remove(i);
                    i--;
                    dis++; }}
            for (int i =0; i < list.size();i++){
                if (list.get(index).equals("0")){
                    list.remove(index);
                    i--; }}
            if (list.size() == 0 || dis == b.length()){
                System.out.print(0);
            }else {
                for (int i =0; i < list.size(); i++){
                    System.out.print(list.get(i)); }
            }System.out.println();
            c = sc.nextInt();
        }}}