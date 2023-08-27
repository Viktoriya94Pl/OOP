package hw1;

// Базовый класс для кота
class Cat {
    private String name;
    private int age;
    private Owner owner;

    // Конструктор класса Cat
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    // Геттер для получения имени питомца
    public String getName() {
        return name;
    }

    // Сеттер для установки имени питомца
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для получения возраста питомца
    public int getAge() {
        return age;
    }

    // Сеттер для установки возраста питомца
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Геттер для получения имени владельца

    public Owner getOwner() {
        return owner;
    }

    // Сеттер для установки имени владельца
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Метод для приветствия 
    public void greet() {
        String ownerName;
        if (owner != null){
            ownerName = owner.getName();
        }
        else {
            ownerName = "unknown";
        }
        System.out.println("Meow! My name is " + name);
        System.out.println("I am " + age + " old!");
        System.out.println("My owner is " + ownerName + "!");
    }
}
