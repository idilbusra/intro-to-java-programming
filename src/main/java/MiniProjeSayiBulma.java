public class MiniProjeSayiBulma {
    public static void main(String[] args) {
        int [] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 13;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi = true;
                break;
            }
        }

        if (varMi){
            System.out.println("Sayi mevcuttur");
        }else{
            System.out.println("Sayi mevcut degildir");
        }
    }
}
