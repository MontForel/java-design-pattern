package Chapter1.DuckBehavior.Quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삐익!");
    }
}
