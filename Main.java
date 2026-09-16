public class Main {
public static void main(String[] args) {
         // Q2 : test des constructeurs
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction();
        assert f1.toString().equals("3/4");
        assert f2.toString().equals("5/1");
        assert f3.toString().equals("0/1");

        // Q3 : test des constantes ZERO et UN
        assert Fraction.ZERO.toString().equals("0/1");
        assert Fraction.UN.toString().equals("1/1");

        // Q4 : test des getters
        assert f1.getNumerateur() == 3;
        assert f1.getDenominateur() == 4;

        assert Math.abs(f1.doubleValue() - 0.75) < 1E-8;

        Fraction somme = f1.add(new Fraction(1, 4));
assert Math.abs(somme.doubleValue() - 1.0) < 1E-8;

        // Q7 : égalité
        Fraction f4 = new Fraction(1, 2);
        Fraction f5 = new Fraction(2, 4);
        assert f4.equals(f5);
        assert !f4.equals(f1);
    }
}