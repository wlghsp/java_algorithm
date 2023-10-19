package 스프링과진짜초면5기.javafour.inheritance;

public class Car extends Vehicle{

    boolean canFly;

    void fly() {
        if (canFly) {
            System.out.println("날았다!!!!");
        } else {
            System.out.println("이 차는 날 수 없습니다.");
        }
    }
}
