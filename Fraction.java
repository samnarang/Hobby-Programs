public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }
    public Fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }
    public Fraction(Fraction original) {
        numerator = original.numerator;
        denominator = original.denominator;
    }
    
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNumerator(int num) {
        numerator = num;
    }
    public void setDenominator(int den) {
        denominator = den; 
    }
    
    public int greatestInteger() {
        int n = numerator/denominator;
        return n;
    }
    public Fraction add(Fraction frac) {
        Fraction sum = new Fraction();
        sum.numerator = ((frac.denominator * this.numerator) + (frac.numerator * this.denominator));
        sum.denominator = (frac.denominator * this.denominator);
        return sum;
    }
    public Fraction subtract(Fraction frac) {
        Fraction sub = new Fraction();
        sub.numerator = (frac.denominator * this.numerator) - (frac.numerator * this.numerator);
        sub.denominator = frac.denominator * this.denominator;
        return sub;
    }
    public Fraction multiply(Fraction frac) {
        Fraction multi = new Fraction();
        multi.numerator =(frac.numerator * this.numerator);
        multi.denominator = frac.denominator * this.denominator;
        return multi;
    }
    public Fraction divide(Fraction frac) {
        Fraction div = new Fraction();
        div.numerator = (frac.numerator * this.denominator);
        div.denominator = frac.denominator * this.numerator;
        return div;
    }
    public boolean equals(Fraction frac) {
        return (frac.numerator == numerator && frac.denominator == denominator);
    }
    public boolean isEquivalent(Fraction frac) {
        return frac.toLowestTerms().equals(this.toLowestTerms());
    }
    
    private int getHcf() {
        int j,hcf = 1;
        if(numerator > denominator)
            j = numerator;
        else 
            j = denominator;
        for(int i = j;i > 0;i--)
        {
            if(numerator % i == 0 && denominator % i == 0)
            {
                hcf = i;
                break;
            }
            else
                hcf = 1;
        }
        return hcf;
    }
    public Fraction toLowestTerms() {
        Fraction lowterm = new Fraction();
        int l = this.getHcf();
        lowterm.numerator = numerator/l;
        lowterm.denominator = denominator/l;
        return lowterm;
    }
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
    public static void main() {
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(2,3);
        a.print();
        a.add(b).print();
        a.subtract(b).print();
        a.multiply(b).print();
        a.divide(b).print();
        a.toLowestTerms().print();
    }
}