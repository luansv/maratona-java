package jiraya.javacore.exception.exercises;

import java.util.Scanner;

public class NumbString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        try {
            String num = scanner.nextLine();
            int tempNum = Integer.parseInt(num);

        } catch (NumberFormatException e) {
            System.out.println("Invalid value "+e);
        }
    }
}
