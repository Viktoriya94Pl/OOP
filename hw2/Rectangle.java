package hw2;

class Rectangle {
    private double width;
    private double height;

    //Конструктор без параметров, создающий прямоугольник с шириной и высотой по умолчанию.
    public Rectangle () {
        this.width = 0;
        this.height = 0;
    }

    //Конструктор, создающий прямоугольник с заданной шириной и высотой.
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }


    // Получает ширину прямоугольника.
    public double getWidth() {
        return width;
    }

    // Устанавливает ширину прямоугольника.
    public void setWidth(double width) {
        this.width = width;
    }

    // Получает высоту прямоугольника.
    public double getHeight() {
        return height;
    }

    //  Устанавливает высоту прямоугольника.
    public void setHeight(double height) {
        this.height = height;
    }

    // Вычисляет площадь прямоугольника.
    public double calculateArea (){
        return width * height;
    }

    // Вычисляет периметр прямоугольника.
    public double calculatePerimeter (){
        return 2 *(width + height);
    }
}
