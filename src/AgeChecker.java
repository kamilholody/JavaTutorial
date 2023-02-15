import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w naszym sklep, proszę podaj swój wiek: ");

        int humanAge = scanner.nextInt();

        if(humanAge >= 18 && humanAge < 100) {
            System.out.println("Zapraszamy do zakupów, jesteś osobą pełnoletnią.");
        }
        else if(humanAge < 18 && humanAge > 0) {
            System.out.println("Nie jesteś osobą pełnoletnią!");
        }
        else if(humanAge >= 100) {
            System.out.println("Jesteś pewny czy w tym wieku chcesz dokonać zakupu alkocholu?");
        }
        else if(humanAge < 0) {
            System.out.println("Wprowadź wartość poprawną!");
        }
        else {
            System.out.println("Podaj liczby w przedziale 0 do 100");
        }
    }
}
