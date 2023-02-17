/*
    @author DanujaV
    @created 2/17/23 - 3:24 PM   
*/

class MyClass {
    long[] data = new long[10000];
}

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        MyClass[] obj = new MyClass[100000];

        for (int i = 0; i < 100000; i++) {
            System.out.println("obj: " + (i+1));
            obj[i] = new MyClass();
        }
    }
}
