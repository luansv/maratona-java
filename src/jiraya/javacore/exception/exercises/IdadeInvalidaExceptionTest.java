package jiraya.javacore.exception.exercises;

import java.util.Scanner;

public class IdadeInvalidaExceptionTest {
    public static void main(String[] args) {

        try {
            idade();
        } catch (IdadeInvalidaException e) {
            throw new RuntimeException(e);
        }
    }

    public static void idade() throws IdadeInvalidaException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age1 = scanner.nextInt();

        if (age1 < 0 || age1 > 150) {
            throw new IdadeInvalidaException("You dont exist!");
        }

        System.out.println(age1);
        scanner.close();
    }

}

