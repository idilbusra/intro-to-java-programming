public class Methods {
    public static void main(String[] args) {
        sayiBulmaca(); //istedigin kadar method call yapabilirsin



    }

    public  static  void sayiBulmaca(){ //Method yazarak kendini tekrar etmeyi birakiyorsun
        int [] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi = true;
                break;
            }
        }


        String mesaj="";
        if (varMi){
            mesaj= "Sayi mevcuttur"+ aranacak;
            mesajVer(mesaj);
        }else{
            mesajVer("Sayi mevcut degildir : "+ aranacak);
        }

    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
