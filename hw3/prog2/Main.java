package hw3.prog2;

public class Main {
public static void main(String[] args) {
        
    // Использование объявленных констант
        System.out.println("Width: " + Constants.WIDTH);
        System.out.println("Heght: " + Constants.HEGHT);

        Task task = new Task();
        System.out.println("Площадь: " + task.calculateArea());
        System.out.println("Периметр: " + task.calculatePerimeter());
    }
}