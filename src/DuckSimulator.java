import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class DuckSimulator {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RubberDuck());
        ducks.add(new WoodenDuck());

        Iterator<Duck> duckIterator = ducks.iterator();
        while (duckIterator.hasNext()) {
            Duck duck = duckIterator.next();
            System.out.println(duck.getClass().getSimpleName());
            duck.performFly();
            duck.performQuack();
        }
    }
}