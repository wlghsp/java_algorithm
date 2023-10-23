package 스프링과진짜초면5기.task1.abstratction;

public class Car implements Vehicle {

    @Override
    public void forward() {
        System.out.println("앞으로 갑니다");
    }

    @Override
    public void backward() {
        System.out.println("뒤로 갑니다.");
    }
}
