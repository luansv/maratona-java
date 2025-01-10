package jiraya.javacore.string;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Luan";
        nome.concat(" Silva");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Luan Silva");
        sb.append(" Silva").append(" Gomes");
        System.out.println(sb);
        System.out.println(sb.delete(0, 5));
        System.out.println(sb.reverse());
    }
}
