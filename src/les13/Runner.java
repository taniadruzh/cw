package les13;

/**
 * Created by java on 06.02.2018.
 */
public class Runner {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird duck = new Duck();
        Bird rubberDuck = new RubberDuck();

        Bird [] birds = new Bird[3];
        birds[0] = eagle;
        birds[1] = duck;
        birds[2] = rubberDuck;

        Fly duckF = new Duck();
        Fly eagleF = new Eagle();
        Fly [] flyingBirds = new Fly[2];
        flyingBirds[0] = duckF;
        flyingBirds[1] = eagleF;
    }
}
