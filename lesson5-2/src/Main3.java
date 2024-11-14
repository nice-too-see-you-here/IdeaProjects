
//Создай абстрактный класс Shape (форма) с абстрактным методом area() (площадь) и обычным методом display() для вывода информации.

//Создай два дочерних класса: Circle (круг) и Rectangle (прямоугольник), которые будут реализовывать метод area() для своих фигур.

//В main() создай объекты Circle и Rectangle, вызови для них методы area() и display().

public class Main3 {
    static double disp;
    static abstract class Shape {
        abstract void area();
        void display() {
            System.out.println(disp);
        }
    }
    static class Circle extends Shape {
        int rad;
        @Override
        void area() {
            disp = rad * rad * Math.PI;
        }
    }
    static class Rectangle extends Shape {
        int height;
        int width;
        @Override
        void area() {
           disp = width * height;
        }
    }

    public static void main(String[] args) {
        Circle Bublik = new Circle();
        Bublik.rad = 8;
        Bublik.area();
        Bublik.display();

        Rectangle Henry = new Rectangle();
        Henry.height = 5;
        Henry.width = 3;
        Henry.area();
        Henry.display();
    }
}
