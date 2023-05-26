package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę za pomocą Chrome!");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą przeglądarki Chrome!");
    }
}
