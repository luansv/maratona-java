package jiraya.javacore.exception.exercises;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add a value to A: ");
        double valueA = scanner.nextDouble();

        System.out.print("Add a value to B: ");
        double valueB = scanner.nextDouble();

        double result = div(valueA, valueB);
        System.out.println("The result is: " + result);

        scanner.close();
    }

    private static double div(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid operation: " + e.getMessage());
        }
        return 0; // Retorna 0 se ocorrer uma exceção
    }
}

