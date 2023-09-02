package hw3.prog1;

class Dog implements Greet {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeGreeting (){
            System.out.println("Bark! My name is " + name);
            System.out.println("I am " + age + " old!");
    }
}