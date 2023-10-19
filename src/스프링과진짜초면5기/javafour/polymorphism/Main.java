package 스프링과진짜초면5기.javafour.polymorphism;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        vehicle.moveBackward();
        vehicle.moveForward();


        // 간편하게 갈아 끼울 수 있음
        vehicle = new Bicycle();

        vehicle.moveBackward();
        vehicle.moveForward();
    }
}
