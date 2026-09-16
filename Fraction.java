public class Fraction extends Number implements Comparable<Fraction> {
private int numerateur; private int denominateur;

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
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

public Fraction add(Fraction autre) {
    int nouveauNum = this.numerateur * autre.denominateur + autre.numerateur * this.denominateur;
    int nouveauDenom = this.denominateur * autre.denominateur;
    return new Fraction(nouveauNum, nouveauDenom);
}

    @Override
public String toString() {
    return numerateur + "/" + denominateur;
}

    // Q7 : égalité
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        Fraction autre = (Fraction) obj;
        return this.numerateur * autre.denominateur == autre.numerateur * this.denominateur;
    }

    // q8 : 
    @Override
    public int compareTo(Fraction autre) {
        double diff = this.doubleValue() - autre.doubleValue();
        if (diff < 0) return -1;
        if (diff > 0) return 1;
        return 0;
    }

}