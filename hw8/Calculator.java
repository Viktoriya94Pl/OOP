package hw8;

import java.util.logging.Logger;

public class Calculator {
    
    //Метод для сложения комплексных чисел

    public Complex add (Complex a, Complex b){
        LOGGER.info("Выполняется операция сложения комплексных чисел");
        
        Complex result = a.add(b);

        LOGGER.info("Результат: " + result);

        return result;
    }

    //Метод для умножения комплексных чисел

    public Complex multiply (Complex a, Complex b){
        LOGGER.info("Выполняется операция умножения комплексных чисел");
        
        Complex result = a.multiply(b);

        LOGGER.info("Результат: " + result);

        return result;
    }

    //Метод для деления комплексных чисел


     public Complex divide (Complex a, Complex b){
        LOGGER.info("Выполняется операция деления комплексных чисел");
        
        Complex result = a.divide(b);

        LOGGER.info("Результат: " + result);

        return result;
    }


    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

}
