/*
    @author DanujaV
    @created 2/6/23 - 9:48 AM   
*/

public class Main {
    public static void main(String[] args) {
        IntegerClass ic = new IntegerClass(10);
        ic.setInteger(20);

        Integer value = ic.getInteger();
        System.out.println(value);  //

        //--------------------

        DoubleClass dc = new DoubleClass(20.5);
        dc.setDouble(15.5);

        Double dValue = dc.getDouble();
        System.out.println(dValue);

        //--------------

        BooleanClass bc = new BooleanClass(true);
        bc.setBoolean(false);

        Boolean bValue = bc.getBoolean();
        System.out.println(bValue);
    }
}
