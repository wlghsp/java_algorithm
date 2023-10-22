package 스프링과진짜초면5기.javafour.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.model = "론 아버지차";
        car2.model = "박사님 차";
        car1.canFly = true;
        car2.canFly = false;

        System.out.println(car1.model + "는 하늘을 날 수 " + (car1.canFly ? "있습니다" : "없습니다"));
        System.out.println(car2.model + "는 하늘을 날 수 " + (car2.canFly ? "있습니다" : "없습니다"));

        car1.forward();
        car1.backward();
        car1.fly();

        car2.forward();
        car2.backward();
        car2.fly();
    }
}
