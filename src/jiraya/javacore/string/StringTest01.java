package jiraya.javacore.string;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Luan";
        String nome2 = "   Luan    ";
        String numbs = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("L", "R"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numbs.substring(3 ));
        System.out.println(numbs.substring(3, 5 ));
        System.out.println(nome2.trim());
    }
}
