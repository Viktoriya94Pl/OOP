package hw3.prog1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rembo", 8);
        Cat cat = new Cat("Barsik", 5);

        // Вызов методов makeGreeting()
        dog.makeGreeting();
        cat.makeGreeting();
    }
}
