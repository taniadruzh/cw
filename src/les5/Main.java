package les5;


import les5.p1.Tc1;
import les5.p2.Tc2;

/**
 * Created by java on 12.01.2018.
 */
public class Main {
    public static void main(String[] args) {

        Student [] studArray = new Student[20];

        Student st = new Student("Vasia",true,false,17,"Kirova",75,180);
        Student st2 = new Student("Kolia",false,true,17,"Kirova",75,180);
        Student st3 = new Student("Vitia",true,false,17,"Kirova",75,180);

        studArray[0] = st;
        studArray[1] = st2;
        studArray[2] = st3;


        for (int i = 3; i < 20; i++)
        {
            Student stud = new Student("name" + i,true,false);
            studArray[i] = stud;
        }
        for (Student student : studArray) {
            System.out.println(student.getStudent());
        }
        Tc1 tc1 = new Tc1();
        Tc2 tc2 = new Tc2();
    }
}