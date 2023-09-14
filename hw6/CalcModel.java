package hw6;


public class CalcModel {
    public double sumNumbers (double num1, double num2){
        return num1 + num2;
    }
    public double substructNumbers (double num1, double num2){
        return num1 - num2;
    }
    public double multiplNumbers (double num1, double num2){
        return num1 * num2;
    }
    public double divideNumbers (double num1, double num2){
        if (num2 == 0) {
            throw new ArithmeticException("You can't divide by zero");
        }
            return num1 / num2;
    }

}  