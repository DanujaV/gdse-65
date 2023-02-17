/*
    @author DanujaV
    @created 2/17/23 - 4:01 PM   
*/

public class ArithmeticDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

       try{
           int k = i/j;
           System.out.println(k);
       }catch (ArithmeticException e) {
           System.out.println(e);
       }

    }
}
