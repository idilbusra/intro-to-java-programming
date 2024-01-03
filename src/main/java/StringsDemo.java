public class StringsDemo {
    public static void main(String[] args) {
        String mesaj= "Bugun hava cok guzel";
        System.out.println(mesaj);
        System.out.println("Eleman sayisi : " + mesaj.length());
        System.out.println("5.eleman : "+ mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin!")); //Istersen atama yapabilirsin
        System.out.println(mesaj.startsWith("A"));//boolean dondurur
        System.out.println(mesaj.endsWith("."));//boolean dondurur
        char[] karakterler= new char[5];
        mesaj.getChars(0,5,karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//char değil de String de arayabilirsin
        System.out.println(mesaj.lastIndexOf("a"));
        System.out.println(mesaj.replace(' ', '-'));//Assign etmezsen bu kalıcı olmaz
        System.out.println(mesaj.substring(2));//2den itibaren al
        System.out.println(mesaj.substring(2,4));//2 ile 4 arasini
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}
