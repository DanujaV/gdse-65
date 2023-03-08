/*
    @author DanujaV
    @created 3/8/23 - 9:20 AM   
*/

import java.util.ArrayList;
import java.util.List;

public class CustomExceptionDemo {
    static List<Integer> list = new ArrayList<>();
    private static void insertInteger(int integer) throws CustomException{
        if(list.contains(integer)) {
            throw new CustomException("oops! number already added! :()");
        }
        list.add(integer);
    }

    public static void main(String[] args) {
        try {
            insertInteger(10);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
