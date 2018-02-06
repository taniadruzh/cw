package les4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        Dog dog = new Dog();
        dog.setName("Little doggy");
        dog.setColPaws(5);
        dog.setHungry(false);
        System.out.print("My dog's name is " + dog.getName() + ". Hi has " + dog.getColPaws() + " paws.");
        System.out.println(" He is " + (dog.getHungry() ? "" : " not ") + "hungry.");

        Bird bird = new Bird();
        bird.setName("Little twytty");
        bird.setAge(5);
        System.out.println("My bird's name is " + bird.getName() + ". It is " + bird.getAge()+ ".");
            //calculator();

    }
    public static void calculator()
    {
        System.out.println("Let's calculate :-)");
        System.out.println("Enter your first number:");
        int num1 = getInt();
        System.out.println("Enter your second number:");
        int num2 = getInt();
        System.out.println("Enter your third number:");
        int num3 = getInt();
        System.out.println("Enter your fourth number:");
        int num4 = getInt();
        System.out.println("Enter operation symbol (+ - * /):");
        char ch = getOperation();
        System.out.print("Your first result is ");
        calc(num1,ch,num2);

        System.out.print("Your second result is ");
        calc(num1,num2,num3,ch);

        System.out.print("Your third result is ");
        calc(num1,num2,ch);

        System.out.print("Your fourth result is ");
        calc(num1,num2,num3,num4,ch);
    }

    public static int getInt()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }

    public static char getOperation()
    {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        char ch = st.charAt(0);
        return ch;
    }

    public static void calc(int num1,int num2,char ch)
    {
        switch (ch){
            case '+': {
                System.out.println(num1 + num2);
                break;
            }
            case '-':{
                System.out.println(num1 - num2);
                break;
            }
            case '*':{
                System.out.println(num1 * num2);
                break;
            }
            case '/':{
                System.out.println(num1 / num2);
                break;
            }
        }
    }

    public static void calc(int num1,char ch,int num2)
    {
        switch (ch){
            case '+': {
                System.out.println(num1 + num2);
                break;
            }
            case '-':{
                System.out.println(num1 - num2);
                break;
            }
            case '*':{
                System.out.println(num1 * num2);
                break;
            }
            case '/':{
                System.out.println(num1 / num2);
                break;
            }
        }
    }

    public static void calc(int num1,int num2,int num3,char ch)
    {
        switch (ch){
            case '+': {
                System.out.println(num1 + num2 + num3);
                break;
            }
            case '-':{
                System.out.println(num1 - num2 - num3);
                break;
            }
            case '*':{
                System.out.println(num1 * num2 * num3);
                break;
            }
            case '/':{
                System.out.println(num1 / num2 / num3);
                break;
            }
        }
    }

    public static void calc(int num1,int num2,int num3,int num4,char ch)
    {
        switch (ch){
            case '+': {
                System.out.println(num1 + num2 + num3 + num4);
                break;
            }
            case '-':{
                System.out.println(num1 - num2 - num3 - num4);
                break;
            }
            case '*':{
                System.out.println(num1 * num2 * num3 * num4);
                break;
            }
            case '/':{
                System.out.println(num1 / num2 / num3 / num4);
                break;
            }
        }
    }
}
