/*
    @author DanujaV
    @created 2/6/23 - 3:37 PM   
*/

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(25);
        treeSet.add(12);
        treeSet.add(56);
        treeSet.add(1);
        treeSet.add(78);
        treeSet.add(2);
        treeSet.add(14);
        treeSet.add(12);

        System.out.println(treeSet);

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Kamal");
        treeSet2.add("Amal");
        treeSet2.add("Saman");
        treeSet2.add("Deshan");

        System.out.println(treeSet2);
    }
}
