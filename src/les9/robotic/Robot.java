package les9.robotic;

/**
 * Created by java on 26.01.2018.
 */
public class Robot {
    private int cpu;
    private String serialNumber;

    public void thinking(){
        if (cpu > 2){
            System.out.println("Very good");
        }
        else {
            System.out.println("Stupid robot");
        }

    }

}
