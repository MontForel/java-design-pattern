import DuckBehavior.Fly.FlyNoWay;
import DuckBehavior.Quack.MuteQuack;

public class WoodenDuck extends Duck{
    public WoodenDuck () {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void swim() {
        System.out.println("나무오리 수영중!");
    }

    @Override
    public void hello() {
        System.out.println("안녕 나는 나무오리야!");
    }
}
