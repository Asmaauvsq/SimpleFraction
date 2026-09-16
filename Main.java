public class Main {
public static void main(String[] args) {
          // Q2
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction();
        assert f1.toString().equals("3/4");
        assert f2.toString().equals("5/1");
        assert f3.toString().equals("0/1");
                System.out.println("Q2 (constructeurs) OK : f1=" + f1 + ", f2=" + f2 + ", f3=" + f3);

        // Q3
        assert Fraction.ZERO.toString().equals("0/1");
        assert Fraction.UN.toString().equals("1/1");
                System.out.println("Q3 (constantes) OK : ZERO=" + Fraction.ZERO + ", UN=" + Fraction.UN);

        // Q4
        assert f1.getNumerateur() == 3;
        assert f1.getDenominateur() == 4;
                System.out.println("Q4 (getters) OK : numerateur=" + f1.getNumerateur() + ", denominateur=" + f1.getDenominateur());

        // Q5
        assert Math.abs(f1.doubleValue() - 0.75) < 1E-8;
                System.out.println("Q5 (doubleValue) OK : f1.doubleValue()=" + f1.doubleValue());

        // Q6
        Fraction somme = f1.add(new Fraction(1, 4));
        assert Math.abs(somme.doubleValue() - 1.0) < 1E-8;
                System.out.println("Q6 (add) OK : f1 + 1/4 = " + somme);

        // Q7
        Fraction f4 = new Fraction(1, 2);
        Fraction f5 = new Fraction(2, 4);
        assert f4.equals(f5);
        assert !f4.equals(f1);
                System.out.println("Q7 (equals) OK : f4.equals(f5)=" + f4.equals(f5) + ", f4.equals(f1)=" + f4.equals(f1));

        // Q8
        Fraction f6 = new Fraction(1, 2);
        Fraction f7 = new Fraction(3, 4);
        Fraction f8 = new Fraction(2, 4);
        assert f6.compareTo(f7) < 0;
        assert f7.compareTo(f6) > 0;
        assert f6.compareTo(f8) == 0;
                System.out.println("Q8 (compareTo) OK : f6<f7=" + (f6.compareTo(f7) < 0) + ", f6==f8=" + (f6.compareTo(f8) == 0));

        // Q9
        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
                System.out.println("Q9 (Number) OK : 1 + 1/2 = " + (aNumber.doubleValue() + anotherNumber.doubleValue()));

    }

    
}