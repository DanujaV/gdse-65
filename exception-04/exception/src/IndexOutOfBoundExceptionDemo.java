/*
    @author DanujaV
    @created 2/17/23 - 4:20 PM   
*/

public class IndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        int[] xr = new int[5];

        xr[0] = 10;
        xr[1] = 20;

        try{
            xr[5] = 30;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("something happend!");
        }

        System.out.println("end main");

        //-----

        String name = "My name is danuja";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(16));
        try{
            System.out.println(name.charAt(14));
            System.out.println("try block is running");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("catch block is running");
        } finally {
            System.out.println("finally block is running!");
        }
    }
}
