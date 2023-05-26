package drivers;

public class FireFoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę za pomocą Firefox!");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą przeglądarki Firefox!");
    }
}
