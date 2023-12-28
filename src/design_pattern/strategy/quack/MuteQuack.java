package design_pattern.strategy.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< 조용~ >> ");
    }
}
