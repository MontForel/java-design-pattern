package Chapter1;

import Chapter1.DuckBehavior.Fly.FlyWithWings;
import Chapter1.DuckBehavior.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void hello() {
        System.out.println("안녕 나는 청둥오리야!");
    }

    @Override
    public void swim() {
        System.out.println("청둥오리 수영중!");
    }
}
