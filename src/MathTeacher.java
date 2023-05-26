public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("Jestem w konstruktorze MathTeacher");

    }

    public void walk(){
        super.walk();
        System.out.println("I walk very fast!");
    }

    public void teachMath(){
        eat();
        walk();
        System.out.println("I am teaching Math!");
    }

    public void sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
