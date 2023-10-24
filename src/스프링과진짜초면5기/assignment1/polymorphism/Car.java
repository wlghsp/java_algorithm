package 스프링과진짜초면5기.assignment1.polymorphism;

public class Car implements Vehicle {
    @Override
    public void moveForward() {
        System.out.println("자동차가 전진");
    }

    @Override
    public void moveBackward() {
        System.out.println("자동차가 후진");
    }
}
