package Chapter1.DuckBehavior.Fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날 수 없어요 :(");
    }
}
