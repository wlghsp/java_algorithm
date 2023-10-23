package 스프링과진짜초면5기.task1.polymorphism;

public class Bicycle implements Vehicle {

    @Override
    public void moveForward() {
        System.out.println("자전거가 전진");
    }

    @Override
    public void moveBackward() {
        System.out.println("자전거가 후진");
    }
}
