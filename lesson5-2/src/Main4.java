//Создайте класс Car, который будет иметь поля make (марка автомобиля), model (модель автомобиля) и year (год выпуска).
// Напишите конструктор для этого класса и метод displayInfo(), который выводит информацию об автомобиле.

//Используя модификаторы доступа, защитите поля класса Car, сделав их приватными. Добавьте публичные методы для
// установки и получения значений этих полей.

public class Main4 {

    static class Car {

        private String make;
        private String model;
        private int year;

        Car(String make,String model,int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayInfo() {
            System.out.println("Информация о данном авто: " + "Марка: "+ make + "; Модель: " + model + "; Год выпуска: " + year);
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

    }

    public static void main (String[] args) {
        Car Alfa = new Car("Alfa", "Ludwig", 1986);
        Alfa.displayInfo();
        System.out.println(Alfa.getYear());
        System.out.println(Alfa.getModel());
        System.out.println(Alfa.getMake());

    }
}
