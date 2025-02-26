package jiraya.javacore.crud.test;

import jiraya.javacore.crud.service.AuthorService;

import java.util.Scanner;

public class CrudTest01 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true){
            authorMenu();
            op = Integer.parseInt(scanner.nextLine());
            if (op == 0) break;
            AuthorService.buidMenu(op);
        }
    }
    private static void authorMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("0. Exit");
    }
}
