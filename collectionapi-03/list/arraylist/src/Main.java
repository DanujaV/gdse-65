/*
    @author DanujaV
    @created 2/6/23 - 12:00 PM   
*/

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();

        arrayList1.add(10);
        arrayList1.add("kamal");
        arrayList1.add(true);
        arrayList1.add(10);

        System.out.println(arrayList1);

        //-----------------------

        //since JDK7
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(10);
        //Illegal -> type safety
        /*        integerArrayList.add("kamal");
        integerArrayList.add(true);*/
        integerArrayList.add(10);

        System.out.println(arrayList1);

        //----------------------------

        ArrayList<Customer> customerList = new ArrayList<>();
        //Illegal
        /*customerList.add(10);
        customerList.add("Kamal");
        customerList.add(true);*/

        Customer c3 = new Customer(3, "Supun");

        customerList.add(new Customer(1, "Kamal"));
        customerList.add(new Customer(2, "Saman"));
        customerList.add(c3);

        System.out.println(customerList);

        Customer customer = customerList.get(1);
        System.out.println(customer);
    }
}
