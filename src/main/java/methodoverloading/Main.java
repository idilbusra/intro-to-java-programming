package methodoverloading;

public class Main {
    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        System.out.println( hesapMakinesi.topla(2, 3));
        hesapMakinesi.topla(2,3,4);
    }
}
