import DuckBehavior.Fly.FlyNoWay;
import DuckBehavior.Quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void swim() {
        System.out.println("고무오리 수영중!");
    }

    @Override
    public void hello() {
        System.out.println("안녕 나는 고무오리야!");
    }
}
