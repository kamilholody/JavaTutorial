package homeWork127;


import java.util.Scanner;

public class ExceptionCheck {

    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        if(age<0){
            throw new InvalidAgeException("Your Age is not valid");
        } if(age >= 18){
            System.out.println("Jesteś pełnoletni!");
        } else {
            System.out.println("Nie jesteś pełnoletni!");
        }
    }
}
