/*
    @author DanujaV
    @created 2/6/23 - 11:15 AM   
*/

public class Main {
    public static void main(String[] args) {
        Numerical<Integer> n1 = new Numerical<Integer>();
        n1.isEven(10);

        Numerical<Double> n2 = new Numerical<Double>();
        n2.isEven(10.5);

        short s = 10;

        Numerical<Short> n3 = new Numerical<Short>();
        n3.isEven(s);

//        Numerical<String> n4 = new Numerical<String>();   //Illegal
//        n4.isEven("kamal");
    }
}
