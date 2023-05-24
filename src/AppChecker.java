public class AppChecker {

    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("WorkFlow");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("WorkFlow");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();

    }
}
