public class Fraction {
    private int numerateur;
    private int denominateur;

public Fraction(int numerateur, int denominateur) {
    this.numerateur = numerateur;
    this.denominateur = denominateur;
}

public Fraction(int numerateur) {
    this(numerateur, 1);
}

public Fraction() {
    this(0, 1);
}

 // Q3 : constantes
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    public int getNumerateur() {
    return numerateur;
}

public int getDenominateur() {
    return denominateur;
}

    @Override
    public String toString() {
        return "Je suis une fraction.";
    }
}