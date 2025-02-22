package jiraya.javacore.regex;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Patten, code, java";
        String[] text1 = text.split(",");
        for (String text2 : text1) {
            System.out.println(text2.trim());
        }

    }
}
