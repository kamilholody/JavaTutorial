public class UserTest {

    public static void main(String[] args) {

        //User user = new User();
        User user = new User("Tomek", "hello");

       /* user.username = "Bartek";
        user.password = "QWERT";*/
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();

    }
}
