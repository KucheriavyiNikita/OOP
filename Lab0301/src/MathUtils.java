public class MathUtils {
    static int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            throw new RuntimeException("gcd: both arguments equal to 0");
        }
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        int d = Math.min(Math.abs(a), Math.abs(b));
        while (a % d != 0 || b % d != 0) {
            --d;
        }

        return d;
    }
}