package design_pattern.strategy;

import design_pattern.strategy.fly.FlyNoWay;
import design_pattern.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
