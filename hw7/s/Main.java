package hw7.s;

//принцип единственной ответственности
    
    //В данном примере два метода, каждый из которых несет свой функционал. 
    //Метод makeGreeting выводит в консоль приветсвтие
    //Метод makeSound выводит в консоль звук животного

    
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        cat.makeGreeting();
        cat.makeSound();
        
   }
}