/*
    @author DanujaV
    @created 2/6/23 - 3:33 PM   
*/

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(5);
        linkedHashSet.add(100);
        linkedHashSet.add(45);
        linkedHashSet.add(5);
        linkedHashSet.add(585);

        System.out.println(linkedHashSet);
    }
}
