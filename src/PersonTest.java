public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "AGH");
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 30, "Manchester United");
        footballer.walk();
        footballer.eat();
        footballer.playFootbal();
    }
}
