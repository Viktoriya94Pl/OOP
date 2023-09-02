package hw3.prog1;

class Cat implements Greet {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeGreeting (){
            System.out.println("Meow! My name is " + name);
            System.out.println("I am " + age + " old!");
    }
}
