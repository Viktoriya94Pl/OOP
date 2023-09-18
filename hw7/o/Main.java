package hw7.o;

//O - Open closed Principle - принцип открытости-закрытости

//В данном примере есть несколько классов с разными видами птиц. И методы sing и fly. 
//Какая-то птица умеет петь, а какая-то умееть и петь и летать. 

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
