package animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Hau!");
        sayHello();
        System.out.println("Numbers of legs " + legs);
    }
}
