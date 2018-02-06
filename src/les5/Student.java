package les5;

public class Student {
    String name;
    boolean isHungry;
    boolean isHappy;
    int age;
    String livingPlace;

    int weight;
    int height;

    public Student(String name, boolean isHungry, boolean isHappy, int age, String livingPlace, int weight, int height) {
        this.name = name;
        this.isHungry = isHungry;
        this.isHappy = isHappy;
        this.age = age;
        this.livingPlace = livingPlace;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getStudent() {
        return name + (isHungry ?" is hungry ": " is not hungry " ) + " and he" + (isHappy ?" is hhappy ": " is not happy " );
    }

    public Student(String name, boolean isHungry, boolean isHappy) {
        this.name = name;
        this.isHungry = isHungry;
        this.isHappy = isHappy;
    }
}