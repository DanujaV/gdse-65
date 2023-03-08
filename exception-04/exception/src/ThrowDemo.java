/*
    @author DanujaV
    @created 3/8/23 - 9:05 AM   
*/

import java.util.Scanner;

public class ThrowDemo {
    private static void isEligibleForTheVote(int age) {
        if(age  < 18) {
            throw new IllegalArgumentException("age is below than 18 !");
        }
        System.out.println("eligible for the VOTE :)");
    }

    public static void main(String[] args) {
        System.out.print("Input age: ");
        int age = new Scanner(System.in).nextInt();

        isEligibleForTheVote(age);
    }
}
