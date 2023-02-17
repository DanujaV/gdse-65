/*
    @author DanujaV
    @created 2/17/23 - 3:54 PM   
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            fr.read();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException er) {
            System.out.println(er);
        }

    }
}
