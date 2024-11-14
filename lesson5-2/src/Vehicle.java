public class Vehicle {
    static class Vehicle2 {
        String brand;
        void start(){
            System.out.println(brand + " - Завелась!");
        }
    }

    static class Track extends Vehicle2 {
        String LoadCapacity;
    }

    public static void main (String[] args) {
        Track MNSTR = new Track();
        MNSTR.brand = "MNSTR-9000";
        MNSTR.LoadCapacity = "MORE THAN YOU THINKED";
        MNSTR.start();
        System.out.println("Load capacity is " + MNSTR.LoadCapacity);
    }
}
