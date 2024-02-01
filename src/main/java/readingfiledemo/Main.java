package readingfiledemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\idil_\\IdeaProjects\\javademos\\src\\main\\java\\readingfiledemo\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (Exception exception) {

            }
        }
    }
}
