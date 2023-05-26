public class Footballer extends Person {

    public String club;

    public Footballer(String name, int age, String club) {
        super(name, age);
        this.club = club;
        System.out.println("Jestem w konstruktorze footballer");
    }

    public void eat(){
        System.out.println("I like healthy food!");
    }

    public void playFootbal(){
        System.out.println("I am playing football for " + club);
    }
}
