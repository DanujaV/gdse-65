/*
    @author DanujaV
    @created 2/17/23 - 4:07 PM   
*/

import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        Scanner s1 = null;
        try {
            s1.nextInt();
        }catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
