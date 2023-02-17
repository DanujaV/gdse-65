/*
    @author DanujaV
    @created 2/17/23 - 3:37 PM   
*/

import java.util.Scanner;

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try{
            Class.forName("Test.class");
        }catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
