import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Podałeś następujące liczby: " + firstNumber + " / " + secondNumber);

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber,secondNumber); // Adding the given numbers
        int subtraction = calculator.sub(firstNumber, secondNumber); // Subtracting the given numbers
        int multiplication = calculator.mult(firstNumber, secondNumber); // Multiplication the given numbers
        int division = calculator.div(firstNumber, secondNumber); // Division the given numbers
        int mod = calculator.mod(firstNumber, secondNumber); // Modulation the given numbers

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);
    }
}
