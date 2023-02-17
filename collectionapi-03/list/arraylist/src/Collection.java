/*
    @author DanujaV
    @created 2/6/23 - 12:35 PM   
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        java.util.Collection<Double> colList = new ArrayList<>();

        System.out.println(colList.isEmpty());  //true
        System.out.println(colList.size()); //0

        colList.add(15.5);
        colList.add(20.2);

        System.out.println(colList.isEmpty());  //false
        System.out.println(colList.size()); //2

        System.out.println("contains: " + colList.contains(15.5));

        Iterator<Double> iterator = colList.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Object[] toArray = colList.toArray();
        for (Object d : toArray) {
            System.out.println(d);
        }

        boolean remove = colList.remove(15.5);
        System.out.println(remove);

        System.out.println(colList);

//        boolean equals = colList.equals(20.2);
//        System.out.println(equals);

        int hashCode = colList.hashCode();
        System.out.println(hashCode);

        colList.clear();

        System.out.println(colList.size()); //0
    }
}
