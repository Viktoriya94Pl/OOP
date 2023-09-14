package hw6;

import java.util.Scanner;

public class CalcView {
    public double numberOne() {
        double value1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        if (sc.hasNextDouble()) {
            value1 = sc.nextInt();
        }else {
            throw new ArithmeticException("Input number!");
        }
        return value1;
    }

    public double numberTwo() {
        double value2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the second number: ");
        if (sc.hasNextDouble()) {
            value2 = sc.nextInt();
        }else {
            throw new ArithmeticException("Input number!");
        }
        return value2;
    }
    public String oper() {
        String operator = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input operator: ");
        if (sc.hasNextLine()) {
            operator = sc.nextLine();
        }
        return operator;
    }
    public void printResult(double result) {
        System.out.println("The result is: " + result);
    }
    public void printError(String errMsg) {
        System.out.println("The error is: " + errMsg);
    }
}
