/*
    @author DanujaV
    @created 3/8/23 - 9:53 AM   
*/

import java.io.File;
import java.io.IOException;

public class CatchLadderDemo {
    public static void main(String[] args) {
        var file = new File("abc.txt");// type inference

        /*try {
            if(!file.exists()) file.createNewFile();    //IO

            Class.forName("abc");   //classNOt
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        /*try {
            if(!file.exists()) file.createNewFile();

            Class.forName("abc");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            if(!file.exists()) file.createNewFile();

            Class.forName("abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
