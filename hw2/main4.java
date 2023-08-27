package hw2;

public class main4 {
    public static void main(String[] args) {
        
        // Создание прямоугольника с шириной и высотой по умолчанию
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Ширина: " + rectangle1.getWidth());
        System.out.println("Высота: " + rectangle1.getHeight());
        System.out.println("Площадь: " + rectangle1.calculateArea());
        System.out.println("Периметр: " + rectangle1.calculatePerimeter());

        // Создание прямоугольника с заданной шириной и высотой
        Rectangle rectangle2 = new Rectangle(5.5, 3.1);
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.calculateArea());
        System.out.println("Периметр: " + rectangle2.calculatePerimeter());

        // Изменение свойств прямоугольника
        rectangle2.setWidth(7);
        rectangle2.setHeight(4);
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.calculateArea());
        System.out.println("Периметр: " + rectangle2.calculatePerimeter());
    }
}
