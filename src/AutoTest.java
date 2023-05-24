public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto Audi = new Auto("Audi", "A5", 2020, 20000);
        Audi.jedz();
        Audi.hamuj();
        Audi.info();

        Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info();
    }
}
