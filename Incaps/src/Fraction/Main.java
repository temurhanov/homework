package Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,-4);
        Fraction f2 = new Fraction(-5,8);

        Calculator c = new Calculator();
        Fraction result = c.add(f1,f2);

        View.display(result);
    }
    Fraction f1 = new Fraction(-6,5);
    Fraction f2 = new Fraction(9,-3);

    Calculator c = new Calculator();
    Fraction result = c.subtruct(f1,f2);

}
