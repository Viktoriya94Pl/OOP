package hw3.prog2;

public class Task implements Constants {
    
    // Вычисляет площадь прямоугольника.
    public double calculateArea (){
        return WIDTH * HEGHT;
    }

    // Вычисляет периметр прямоугольника.
    public double calculatePerimeter (){
        return 2 *(WIDTH + HEGHT);
    }
    
}
