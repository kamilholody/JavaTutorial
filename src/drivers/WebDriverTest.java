package drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

//        FireFoxDriver fireFoxDriver = new FireFoxDriver();
//        fireFoxDriver.get();
//        fireFoxDriver.findElementBy();
//        fireFoxDriver.findElementBy();
//        fireFoxDriver.findElementBy();
//        fireFoxDriver.findElementBy();

    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FireFoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name.");
    }
}
