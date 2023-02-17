/*
    @author DanujaV
    @created 2/6/23 - 12:21 PM   
*/

public class Customer {
    int id;
    String name;

    Customer(int id, String name) {
       this.id = id;
       this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
