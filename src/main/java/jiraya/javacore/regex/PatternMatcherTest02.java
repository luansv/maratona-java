package jiraya.javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo que NÃO for digitos
        // \s = espaços em branco
        // \S = todos que NÃO são brancos
        // \w = tudo de a-ZA-Z, digitos, -
        // \W = tudo que NÃO for a-ZA-Z, digitos, _

        String regex = "\\w";
        String text = "a_d5 75as4";
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
