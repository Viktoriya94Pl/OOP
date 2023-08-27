package hw1;

public class main3 {

        public static void main(String[] args) {
            
            // Создание объектов разных классов
            Cat cat = new Cat("Barsik",5);
            Owner owner = new Owner("Petr");

            cat.setOwner(owner);
            cat.greet();

            // Изменяем имя кота и его возраст
            cat.setName("Tiger");
            cat.setAge(5);
            cat.greet();
    
            // Изменяем имя владельца кота
            owner.setName("Irina");
            cat.greet();
    }
}
