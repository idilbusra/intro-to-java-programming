package workingwithfiles;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file= new File("C:\\Users\\idil_\\IdeaProjects\\javademos\\src\\main\\java\\files\\students.txt");
        try {
           if(file.createNewFile()){
               System.out.println("Dosya olusturuldu");
           }else{
               System.out.println("Dosya zaten mevcut");
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
