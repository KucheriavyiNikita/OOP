import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = "";
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) == 'a') ||
                    (str.charAt(i) == 'e')  ||
                    (str.charAt(i) == 'i') ||
                    (str.charAt(i) == 'o') ||
                    (str.charAt(i) == 'u')) {
                word += str.charAt(i);
            }
        }
        if(isPalindrome(word)) {
            System.out.println("S");
        }else {
            System.out.println("N");
        }
    }
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}