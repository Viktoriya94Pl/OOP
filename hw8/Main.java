package hw8;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(5.7, 9.8);
        Complex b = new Complex(6.8, 3.6);
        Calculator calculator = new Calculator();
        calculator.add(a, b);
        calculator.divide(a, b);
        calculator.multiply(a, b);


    }
}
