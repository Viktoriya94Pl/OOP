package hw3.prog3;

public class Main {
    public static void main(String[] args) {
        Crow crow = new Crow();
        Sparrow sparrow = new Sparrow();

        // Использование методов из интерфейсов
        crow.sing();
        sparrow.fly(); 

        sparrow.sing();
    }
}
