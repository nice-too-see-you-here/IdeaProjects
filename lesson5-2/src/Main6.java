//Создайте интерфейс Vehicle, который включает методы start() и stop().
//Создайте два класса, которые реализуют этот интерфейс: Car и Bike.
//Создайте абстрактный класс Shape с абстрактным методом draw().
//Создайте два класса, наследующие Shape: Circle и Rectangle, и реализующие метод draw().
//В классе Main создайте объекты всех классов и вызовите их методы.


//Дополнительные задания:
//
//    Добавьте методы:
//        В интерфейс Vehicle добавьте метод accelerate(), который будет описывать разгон транспортного средства.
//        Реализуйте этот метод в классах Car и Bike.
//
//    Используйте интерфейсы в абстрактных классах:
//        Создайте абстрактный класс ColoredShape с абстрактным методом getColor(), который возвращает цвет фигуры.
//        Реализуйте этот класс в Rectangle и Circle, добавьте метод setColor(String color) и соответствующее поле для хранения цвета.
//
//    Пример полиморфизма:
//        Создайте массив типа Vehicle и добавьте в него объекты Car и Bike. Пройдитесь по этому массиву и вызовите методы start() и stop() для каждого элемента.

//  --------------TASK 2 -------------------------------------
//    Создайте список (ArrayList) для хранения объектов типа Vehicle.
//    Добавьте в этот список несколько объектов Car и Bike.
//    Используйте цикл для вывода информации о каждом объекте в списке, вызывая методы start, stop и accelerate.
//    Дополнительное задание: Используйте HashMap для хранения объектов Shape с ключами типа String, где ключ будет описывать тип фигуры (например, "Circle" или "Rectangle"). Реализуйте метод, который будет выводить информацию о всех фигурах, хранящихся в HashMap.
//
//Подсказки:
//
//    Коллекции типа ArrayList и HashMap находятся в пакете java.util, поэтому не забудьте импортировать их.
//    Обратите внимание на то, как использовать интерфейсы и абстрактные классы при работе с коллекциями.

import java.util.ArrayList;
import java.util.HashMap;

public class Main6 {



    interface Vehicle {
        void start();
        void stop();
        void accelerate();
    }


    class Car implements Vehicle {
        @Override
        public void start(){
            System.out.println("Car: Start!");
        }
        public void stop() {
            System.out.println("Car: Stop!");
        }

        public void accelerate(){
            System.out.println("Car: is accelerated");
        }
    }

    class Bike implements Vehicle {
        @Override
        public void start(){
            System.out.println("Bike: Start!");
        }
        public void stop(){
            System.out.println("Bike: Stop!");
        }
        public void accelerate(){
            System.out.println("Bike: is accelerated.");
        }
    }

    abstract class Shape {
        abstract void draw();
    }

    abstract class ColoredShape extends Shape {
        abstract String getColor();
        abstract void setColor(String color);
    }

    class Rectangle extends ColoredShape {
            String color;
            void draw(){
                System.out.println("Rectangle: draw!");
            }
            void setColor(String color) {
                this.color = color;
        }
            String getColor(){
                return ("Цвет прямоугольника: " + color);
            }
        }

    class Circle extends ColoredShape {
        String color;
        void draw(){
            System.out.println("Circle: draw!");
        }
        void setColor(String color){
            this.color = color;
        }
        String getColor(){
            return color;
        }

    }

    public void VehTask() {
        Main6 main = new Main6();
        Vehicle[] vehicles = new Vehicle[3];

        vehicles [0] = main.new Car();
        vehicles [1] = main.new Bike();
        vehicles [2] = main.new Bike();

        for (Vehicle element : vehicles) {
            element.start();
            element.stop();
            element.accelerate();
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Main6 main = new Main6();
        Bike bike = main.new Bike();
        bike.start();
        bike.stop();
        Car car = main.new Car();
        car.start();
        car.stop();
        Circle circle = main.new Circle();
        circle.setColor("green");
        System.out.println(circle.color);
        Rectangle rectangle = main.new Rectangle();
        rectangle.setColor("red");
        System.out.println(rectangle.color);
        main.VehTask();

        System.out.println("""
                
                ===ТАСК 2===
                
                """);
        ArrayList<Vehicle> array = new ArrayList<>();
        array.add(car);
        array.add(bike);

        for (int i = 0; i < array.size(); i++){
            array.get(i).stop();
            array.get(i).start();
            array.get(i).accelerate();
            System.out.println();
        }

    HashMap<String, Shape> hmap = new HashMap<>();
        hmap.put("rectangle", rectangle);
        hmap.put("circle", circle);

    for (String key : hmap.keySet()){
        hmap.get(key);
        System.out.println(key);
    }

    }

}
