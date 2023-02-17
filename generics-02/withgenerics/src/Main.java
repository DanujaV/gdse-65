/*
    @author DanujaV
    @created 2/6/23 - 9:59 AM   
*/

public class Main {
    public static void main(String[] args) {
        //-- Integer
        CommonClass<Integer> icc = new CommonClass<Integer>(10);
        icc.setWrapper(100);
        System.out.println(icc.getWrapper());

        //--- Double
        CommonClass<Double> dcc = new CommonClass<Double>(10.25);
        dcc.setWrapper(500.5);
        System.out.println(dcc.getWrapper());

        // --- Boolean
        CommonClass<Boolean> bcc = new CommonClass<Boolean>(false);
        bcc.setWrapper(true);
        System.out.println(bcc.getWrapper());
    }
}
