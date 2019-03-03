public class Main {

    public static void main(String[] args) {

    try {
            Rational a = new Rational(10, 20);
            Rational b = new Rational(20, 30);
            System.out.println(a);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        }


    }