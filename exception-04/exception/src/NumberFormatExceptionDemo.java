/*
    @author DanujaV
    @created 2/17/23 - 4:03 PM   
*/

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String n1 = "10";
        String n2 = "hello";

        try{
            int output = Integer.parseInt(n1) + Integer.parseInt(n2);
            System.out.println(output);
        }catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
}
