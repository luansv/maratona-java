package jiraya.javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo que NÃO for digitos
        // \s = espaços em branco
        // \S = todos que NÃO são brancos
        // \w = tudo de a-ZA-Z, digitos, -
        // \W = tudo que NÃO for a-ZA-Z, digitos, _
        // [] =
        // ? = zero ou uma
        // * = zero ou mais
        // + = uma ou mais
        // {n,m} = de n até m
        // () agrupamento
        // | ou  o(v|c) ovo ou oco
        // $ fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:   "+text);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
