package jiraya.javacore.exception.runtime.test;

//OUTRA FORMA DE FAZER O CÓDIGO ANTERIOR

public class RunTimeException03 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Número inválido (0)!");
        }
        return a / b;
    }
}
