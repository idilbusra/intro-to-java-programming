public class Conditionals {
    public static void main(String[] args) {
        int sayi= 24;

        if (sayi<15){
            System.out.println("Sayi 15'ten kucuktur");
        }

        if(sayi<20){
            System.out.println("Sayi 20'den kucuktur");
        }else {
            System.out.println("Sayi 20'den kucuk degildir");
        }

        if(sayi<20){
            System.out.println("Sayi 20'den kucuktur");
        }else if(sayi==20){
            System.out.println("Sayi 20'ye esittir");
        }else{
            System.out.println("Sayi 20'den buyuktur");
        }


    }
}
