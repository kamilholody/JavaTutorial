package lambda;

public class ItStudent implements Student {


    @Override
    public void SayHello(String name, int age) {
        System.out.println("I am IT guy!");
        System.out.println("My name is " + name);
    }
}
