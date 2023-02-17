/*
    @author DanujaV
    @created 2/6/23 - 10:00 AM   
*/

public class CommonClass<T> {   //type parameter
    T b;

    CommonClass(T b) {
        this.b = b;
    }

    void setWrapper(T b) {
        this.b = b;
    }

    T getWrapper() {
        return b;
    }

    void print() {
        System.out.println(b);
    }
}
