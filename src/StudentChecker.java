public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();


        Student student1 = new Student();
        student1.imie = "Kamil";
        student1.nazwisko = "Hołody";
        student1.nick = "Limak";
        student1.email = "kamilholody@live.com";
        student1.numerIndeksu = 23452;
        String uczelniaStuden1 = student1.nazwaUczelni;
        student1.infoUczelnia();

        Student student2 = new Student();
        student2.imie = "Arek";
        student2.nazwisko = "Wolny";
        student2.nick = "Wolak";
        student2.email = "test@test.com";
        student2.numerIndeksu = 34563;

        Student student3 = new Student();
        student3.imie = "Ola";
        student3.nazwisko = "Arles";
        student3.nick = "Arla";
        student3.email = "alrla@test.com";
        student3.numerIndeksu = 23511;

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for(int i=0; i<students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
        }


    }
}
