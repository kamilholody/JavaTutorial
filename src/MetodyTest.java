public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzWynik();
//        metody.policzWynik();
//        metody.policzWynik();
//        int result = metody.pobierzWynik();
//        int result2 = result * 2;
//        System.out.println("Rezultat przez mnożeniem to: " + result);
//        System.out.println("Rezultat po mnożeniu to " + result2);
        metody.policzWynikParam(2);
        metody.policzWynikParam( 100);
        metody.policzWynikParam( 23);

        metody.add(2,6);
    }
}
