/*
    @author DanujaV
    @created 2/17/23 - 2:58 PM   
*/

public class StackOverFlowErrorDemo {
    private static void methodA() {
        System.out.println("methodA()");
        methodB();
    }

    private static void methodB() {
        System.out.println("methodB()");
        methodA();
    }

    public static void main(String[] args) {
        methodA();
    }
}
