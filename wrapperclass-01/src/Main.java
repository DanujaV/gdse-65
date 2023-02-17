/*
    @author DanujaV
    @created 2/6/23 - 9:29 AM   
*/

public class Main {
    public static void main(String[] args) {
        Integer i = new Integer(10);    //wrapper

        int x = i.intValue();   //manual unboxing

        int y = i;  //autoUnboxing compile time insert -> i.intValue()

        System.out.println(i);
        System.out.println(x);
        System.out.println(y);

    }
}
