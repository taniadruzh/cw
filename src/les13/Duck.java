package les13;

/**
 * Created by java on 06.02.2018.
 */
public class Duck extends Bird {
    @Override
    public void fly() {
        System.out.println("I am duck, a can fly");
    }

    @Override
    public void sound() {
        System.out.println("krya");
    }


}
