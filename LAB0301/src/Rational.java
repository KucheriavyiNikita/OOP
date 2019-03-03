public class Rational {
    private int num;
    private int den;
    public Rational(int num, int den) {
        if (den == 0) {
            throw new RuntimeException("Rational: denominator equal 0");
        }
        this.num = num;
        this.den = den;
        int d = MathUtils.gcd(this.num, this.den);
        num /= d;
        den /= d;
    }
    @Override
    public String toString(){
        return num + "/" + den;
    }
    public Rational add(Rational other) {
        int thum = num * other.den + den * other.num;
        int tden = den * other.den;
        return new Rational(thum, tden);
    }

}
