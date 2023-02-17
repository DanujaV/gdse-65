/*
    @author DanujaV
    @created 2/6/23 - 3:19 PM   
*/

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(18);
        list.add(100);
        list.add(10);

        System.out.println("ArrayList: " + list);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(18);
        hashSet.add(100);
        hashSet.add(10);

        System.out.println("HashSet: " + hashSet);
    }
}
