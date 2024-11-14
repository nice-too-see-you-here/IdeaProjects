public class Main {
    static class Car {
        String brand;
        String model;
        int year;
        void start() {
           System.out.println (brand + " " + model + " " + year + " года выпуска - завелась!");
        }

        Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car Alfa = new Car("Alfa-romeo", "CX-200T", 2000);
        Alfa.start();

        Car Mercedes = new Car("Mercedes","Lux",2010);
        Mercedes.start();

        Car Lamba = new Car("Lambargini","El zaebito",  2020);
        Lamba.start();
    }
}