package exceptionhandling;

public class Main {
    public static void main (String arg[]){

        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch (Exception exception){
            System.out.println("Hata olustu");
        }finally {
            System.out.println("Ben her turlu calisirim");
        }
    }
}
