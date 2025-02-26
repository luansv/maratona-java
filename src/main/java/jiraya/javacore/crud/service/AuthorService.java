package jiraya.javacore.crud.service;

import jiraya.javacore.crud.domain.Author;
import jiraya.javacore.crud.repository.AuthorRepository;

import java.util.List;
import java.util.Scanner;

public class AuthorService {
    private static final Scanner scanner = new Scanner(System.in);

    public static void buidMenu(int op) {
        switch (op) {
            case 1:
                findByName();
            case 2:
                delete();
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = scanner.nextLine();
        List<Author> authors = AuthorRepository.findByNameAndPreparedStatement(name);
        for (int i = 0; i < authors.size(); i++) {
            String name1 = authors.get(i).getName();
            System.out.println(name1);
        }

    }

    private static void delete() {
        System.out.println("Type one of the ids below to delete");
        findByName();
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Are you sure (Y/N)");
        String choice = scanner.nextLine();
        if ("y".startsWith(choice)) {
            AuthorRepository.delete(id);
        }
    }
}
