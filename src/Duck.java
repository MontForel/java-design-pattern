import DuckBehavior.Fly.FlyBehavior;
import DuckBehavior.Quack.QuackBehavior;

public class Duck {

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void swim() {
        System.out.println("수영을 하자");
    }

    public void hello() {
        System.out.println("안녕~");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
