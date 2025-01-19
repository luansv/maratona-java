package jiraya.javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaaababaa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:   "+text);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);

        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }

    }
}
