package hw8;

public class Complex {
    private double real;
    private double imaginary;


    //Конструктор класса Complex

public Complex (double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
}

//Метод сложения комплексных чисел
public Complex add(Complex other) {
    double realSum = this.real + other.real;
    double imaginarySum = this.imaginary + other.imaginary;

    return new Complex(realSum, imaginarySum);
}

//Метод умножения комплексных чисел

public Complex multiply(Complex other) {
    double realProduct = this.real * other.real - this.imaginary * other.imaginary;
    double imaginaryProduct= this.real * this.imaginary + other.imaginary * other.real;

    return new Complex(realProduct, imaginaryProduct);
}

// Метод деления комплексных чисел

public Complex divide(Complex other) {
    double denominator = other.real * other.real + other.imaginary * other.imaginary;
    double realQuotient= (this.real * other.real + this.imaginary * other.imaginary) / denominator;
    double imaginaryQuotient = (this.imaginary * other.real - this.real * other.imaginary) / denominator;

    return new Complex(realQuotient, imaginaryQuotient);
}
//Метод для получения строкового представления комплексного числа

@Override
public String toString(){
    if (imaginary >= 0){
        return real + " + " + imaginary + "i";
    }else {
        return real + " - " + Math.abs(imaginary) + "i";
    }
  }
}




