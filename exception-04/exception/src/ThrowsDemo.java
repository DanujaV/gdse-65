/*
    @author DanujaV
    @created 3/8/23 - 9:25 AM   
*/

import java.io.File;
import java.io.IOException;

public class ThrowsDemo {
    private static void writeFile() throws IOException {    // Danuja
        File file = new File("abc.txt");

        if(!file.exists()) {
            file.createNewFile();
        }
    }

    public static void sahan() {
        try {
            writeFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void nimna() {
        try {
            writeFile();
        } catch (IOException e) {

        }
    }
    public static void tiran() {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
