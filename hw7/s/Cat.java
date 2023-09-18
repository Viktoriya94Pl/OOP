package hw7.s;

class Cat  {
    private String name;
    private int age;

/**
 * Конструктор для создания кота с именем и возрастом
 * @constructor
 * @param name - Имя кота
 * @param age  - Возраст кота
 */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void makeGreeting (){
            System.out.println("Meow! My name is " + name);
            System.out.println("I am " + age + " old!");
    }

    public void makeSound (){
        System.out.println(name + " says Meow!");
    }

}    