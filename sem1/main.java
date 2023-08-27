package sem1;
public class main {
    public static void main(String[] args) {
        
        // Создание объектов разных классов
        Mammal lion = new Mammal("Lion", 5, "Yellow");
        Bird sparrow = new Bird("Sparrow", 2, true);

        // Использование методов и вывод информации
        lion.makeSound();
        lion.displayInfo();

        sparrow.makeSound();
        sparrow.displayInfo();
    }

        
        
        // Animal animal = new Animal("Petr",30);
        // animal.displayInfo();

        // Animal animal2 = new Animal("Ivan");
        // animal2.displayInfo();

        //  Animal animal3 = new Animal();
        // animal3.displayInfo();

        // animal3.age = 30;
        // animal3.name = "Sergei";
        // animal3.displayInfo();
}
