package Chapter1.DuckBehavior.Quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< ~조용~ >>");
    }
}
