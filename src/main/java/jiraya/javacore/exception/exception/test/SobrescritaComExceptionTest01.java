package jiraya.javacore.exception.exception.test;

import jiraya.javacore.exception.exception.domain.Funcionario;
import jiraya.javacore.exception.exception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
