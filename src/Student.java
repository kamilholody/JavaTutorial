public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    public void zalogujSie() {
        System.out.println("Loguje się za pomocą " + nick);
    }
    public void podajNrIndeksu() {
        System.out.println("Mój numer indeksu to :" + numerIndeksu);
    }
    public void podajEmail() {
        System.out.println("Mój email to : " + email);
    }

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to " + nazwaUczelni + " po zmianie");
        druga();
    }

    public static void druga(){
        System.out.println("Jestem drugą metodą");
    }
}
