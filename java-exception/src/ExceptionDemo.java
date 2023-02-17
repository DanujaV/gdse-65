/*
    @author DanujaV
    @created 2/17/23 - 9:31 AM   
*/

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start main!");

        int i = new Scanner(System.in).nextInt();;
        int j = new Scanner(System.in).nextInt();

        try {
            int k = i/j;
            System.out.println(k);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("end main!");
    }
}
