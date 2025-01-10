package jiraya.javacore.exception.exception.test;

import jiraya.javacore.exception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoException01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logar() throws LoginInvalidoException {

        String usernameDB = "Alice";
        String senhaDB = "alice";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Usuário");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
