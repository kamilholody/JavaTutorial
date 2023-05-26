import drivers.FireFoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b; // a zostaje przekonwertowane na double

        int d = a/(int)b;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FireFoxDriver();

        FireFoxDriver fireFoxDriver = (FireFoxDriver) driver;
        fireFoxDriver.get();
    }
}
