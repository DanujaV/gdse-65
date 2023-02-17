/*
    @author DanujaV
    @created 2/6/23 - 2:29 PM   
*/

import java.util.LinkedList;

/*class Node {
    int data;

    Node(int data) {
        this.data = data;
    }

    Node next;
    Node prev;
}*/

public class Main {
    public static void main(String[] args) {
      /*  Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next = node2;

        node1.next.next = node3;*/

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(25);
        linkedList.add(1);
        linkedList.add(24);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList);

        linkedList.removeFirst();

        System.out.println(linkedList);

        linkedList.removeLast();

        System.out.println(linkedList);

        linkedList.addFirst(100);
        System.out.println(linkedList);

        linkedList.addLast(5000);
        System.out.println(linkedList);

        System.out.println("contains: " + linkedList.contains(1));

        System.out.println("size: "  + linkedList.size());

        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
